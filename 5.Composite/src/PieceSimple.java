// Classe PieceSimple qui hérite de PieceComposant
public class PieceSimple extends PieceComposant {
    // Constructeur par défaut
    public PieceSimple() {
        super();
    }

    // Constructeur avec paramètres
    public PieceSimple(String libelle, int prix) {
        super(libelle, prix);
    }

    // Implémentation de la méthode getPrix
    @Override
    public int getPrix() {
        return getPrixBase();
    }
}
