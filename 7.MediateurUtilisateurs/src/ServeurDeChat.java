import java.util.ArrayList;

public class ServeurDeChat extends Médiateur{
    private ArrayList<Utilisateurs> lesActeurs = new ArrayList<Utilisateurs>();

    public boolean existe(Utilisateurs utilisateur) {
        if (lesActeurs.contains(utilisateur)) {
            return true;
        }
        return false;
    }

    public void ajouter(Utilisateurs utilisateur) {
        if (!existe(utilisateur)) {
            lesActeurs.add(utilisateur);
        }
    }

    public void enlever(Utilisateurs utilisateur) {
        if (existe(utilisateur)) {
            lesActeurs.remove(utilisateur);
        }
    }

    public void diffuserMessage(Utilisateurs auteur, String message) {
        for (Utilisateurs acteur : lesActeurs) {
            if (!acteur.equals(auteur)) {
                acteur.recevoirMessageDe(auteur, message);
            }
        }
    }


}
