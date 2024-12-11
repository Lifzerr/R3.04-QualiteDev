public class Main {
    public static void main(String[] args) {
        ServeurDeChat serveur = new ServeurDeChat();
        Utilisateurs utilisateur1 = new Utilisateurs();
        utilisateur1.nom = "Alice";
        Utilisateurs utilisateur2 = new Utilisateurs();
        utilisateur2.nom = "Bob";
        Utilisateurs utilisateur3 = new Utilisateurs();
        utilisateur3.nom = "Charlie";

        serveur.ajouter(utilisateur1);
        serveur.ajouter(utilisateur2);
        serveur.ajouter(utilisateur3);

        System.out.println(serveur.toString());
    }
}