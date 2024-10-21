import java.util.ArrayList;
import java.util.List;

// Classe PieceComposee qui hérite de PieceComposant
public class PieceComposee extends PieceComposant {
    // Liste des composants
    private List<PieceComposant> composants;

    // Constructeur par défaut
    public PieceComposee() {
        super();
        this.composants = new ArrayList<>();
    }

    // Constructeur avec paramètres
    public PieceComposee(String libelle, int prix) {
        super(libelle, prix);
        this.composants = new ArrayList<>();
    }

    // Méthode pour ajouter un composant
    public void ajouterComposant(PieceComposant composant) {
        composants.add(composant);
    }

    // Méthode pour enlever un composant
    public void enleverComposant(PieceComposant composant) {
        composants.remove(composant);
    }

    // Implémentation de la méthode getPrix
    @Override
    public int getPrix() {
        int totalPrix = getPrixBase();
        for (PieceComposant composant : composants) {
            totalPrix += composant.getPrix();
        }
        return totalPrix;
    }
}
