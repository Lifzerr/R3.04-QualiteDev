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
    public void ajouterComposant(PreparationDeCuisine composant) {
        composants.add(composant);
    }

    // Méthode pour enlever un composant
    public void enleverComposant(PreparationDeCuisine composant) {
        composants.remove(composant);
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
