public class Utilisateurs extends Acteurs{
    private String nom;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public void recevoirMessageDe(Utilisateurs auteur, String message) {
        System.out.println(auteur.getNom() + " a dit : " + message);
    }
}
