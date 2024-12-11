public abstract class Acteurs {
    private String nom;
    private Médiateur médiateur;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Médiateur getMédiateur() {
        return médiateur;
    }

    public void setMédiateur(Médiateur médiateur) {
        this.médiateur = médiateur;
    }
}

