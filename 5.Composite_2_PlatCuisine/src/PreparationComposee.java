import java.util.ArrayList;
import java.util.List;

public class PreparationComposee extends PreparationDeCuisine{

    // Attributs
    ArrayList<PreparationDeCuisine> composants;


    // Constructeur
    public PreparationComposee(){
        super();
        this.composants = new ArrayList<PreparationDeCuisine>();
    }

    public PreparationComposee(String pLibelle, int pPrix){
        super(pLibelle, pPrix);
        this.composants = new ArrayList<PreparationDeCuisine>();
    }

    // Méthode pour ajouter un composant
    @Override
    public boolean ajouterComposant(PreparationDeCuisine composant) {
        // Vérifie si le composant n'est pas déjà présent pour éviter les doublons
        if (!composants.contains(composant)) {
            composants.add(composant);
            return true; // Composant ajouté avec succès
        }
        return false; // Composant déjà présent
    }

    // Méthode pour enlever un composant
    @Override
    public boolean enleverComposant(PreparationDeCuisine composant) {
        // Retire le composant s'il est présent
        if (composants.contains(composant)) {
            composants.remove(composant);
            return true; // Composant enlevé avec succès
        }
        return false; // Composant non trouvé
    }

    // Méthode pour vérifier si un composant existe
    @Override
    public boolean existeComposant(PreparationDeCuisine composant) {
        // Vérifie d'abord si le composant donné correspond à cette instance elle-même
        if (this.equals(composant)) {
            return true;
        }

        // Parcours tous les composants de la liste
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
}
