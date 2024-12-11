public class Main {
    public static void main(String[] args) {
        ServeurDeChat serveur = new ServeurDeChat();
        Utilisateurs utilisateur1 = new Utilisateurs();
        utilisateur1.setNom("Alice");
        Utilisateurs utilisateur2 = new Utilisateurs();
        utilisateur2.setNom("Bob");
        Utilisateurs utilisateur3 = new Utilisateurs();
        utilisateur3.setNom("Charlie");
        serveur.ajouter(utilisateur1);
        serveur.ajouter(utilisateur2);
        serveur.ajouter(utilisateur3);
        serveur.diffuserMessage(utilisateur1, "Bonjour tout le monde !");

    }
}