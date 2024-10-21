import java.util.HashSet;
import java.util.Set;

public class PreparationComposee extends PreparationDeCuisine {

    // Attributs
    Set<PreparationDeCuisine> composants;

    // Constructeur
    public PreparationComposee() {
        super();
        this.composants = new HashSet<>();
    }

    public PreparationComposee(String pLibelle, int pPrix) {
        super(pLibelle, pPrix);
        this.composants = new HashSet<>();
    }

    // Méthode pour ajouter un composant
    public boolean ajouterComposant(PreparationDeCuisine composant) {
        // Utilise directement la méthode add du Set qui renvoie true si le composant a été ajouté
        return composants.add(composant);
    }

    // Méthode pour enlever un composant
    public boolean enleverComposant(PreparationDeCuisine composant) {
        // Utilise directement la méthode remove du Set qui renvoie true si le composant a été enlevé
        return composants.remove(composant);
    }

    // Méthode pour vérifier si un composant existe
    public boolean existeComposant(PreparationDeCuisine composant) {
        // Vérifie d'abord si le composant donné correspond à cette instance elle-même
        if (this.equals(composant)) {
            return true;
        }

        // Parcours tous les composants du set
        for (PreparationDeCuisine c : composants) {
            // Si le composant est une préparation composée, on vérifie récursivement
            if (c instanceof PreparationComposee) {
                if (((PreparationComposee) c).existeComposant(composant)) {
                    return true;
                }
            }
            // Sinon, on vérifie s'il s'agit d'une préparation simple
            else if (c.equals(composant)) {
                return true;
            }
        }

        // Si le composant n'a pas été trouvé, on retourne false
        return false;
    }

    // Méthode de la superclasse redéfinie
    @Override
    public int getPrix() {
        int totalPrix = getPrixBase();
        for (PreparationDeCuisine composant : composants) {
            totalPrix += composant.getPrix();
        }
        return totalPrix;
    }

    // Méthode métier - toString
    @Override
    public String toString(){
        String reponse = "Compo : " + getLibelle() + "  -  " + getPrix() + "\n";
        for (PreparationDeCuisine composant : composants) {
            reponse += composant.toString() + "\n";
        }
        return reponse;
    }
}
