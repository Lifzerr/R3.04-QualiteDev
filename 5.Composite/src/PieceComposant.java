// Superclasse abstraite PieceComposant
public abstract class PieceComposant {
    // Attributs
    private String libelle;
    private int prix;

    // Constructeur par défaut
    public PieceComposant() {
        this.libelle = "";
        this.prix = 0;
    }

    // Constructeur avec paramètres
    public PieceComposant(String libelle, int prix) {
        this.libelle = libelle;
        this.prix = prix;
    }

    // Getters et setters (encapsulation)
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getPrixBase() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    // Méthode abstraite
    public abstract int getPrix();
}
