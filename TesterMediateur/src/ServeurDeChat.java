import java.util.ArrayList;

public class ServeurDeChat extends Médiateur{
    ArrayList<Utilisateurs> lesActeurs = new ArrayList<Utilisateurs>();

    public void ajouter(Utilisateurs utilisateur){
        if(!existe(utilisateur)) {
            lesActeurs.add(utilisateur);
        }
    }

    public void retirer(Utilisateurs utilisateur){
        if (existe(utilisateur)) {
            lesActeurs.remove(utilisateur);
        }
    }

    public boolean existe(Utilisateurs utilisateur){
        return lesActeurs.contains(utilisateur);
    }

    public String toString(){
        String res = "";
        for (Utilisateurs utilisateur : lesActeurs) {
            res += utilisateur.nom + "\n";
        }
        return res;
    }
}
