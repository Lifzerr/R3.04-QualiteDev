public class Main{
    public static void main(String[] args){
        // Création des clients
        Client client1 = new Client("Martin", "0101010101");
        Client client2 = new Client("Durand", "0202020202");

        // Création des tables
        Table table1 = new Table("t01");
        Table table2 = new Table("t02");

        // Lier les objets
        client1.lierTable(table1);
        client2.lierTable(table2);

        // Afficher toutes les informations
        System.out.println("Client 1 : " + client1.toString() + "\n");
        System.out.println("Client 2 : " + client2.toString() + "\n");
        System.out.println("Table 1 : " + table1.toString() + "\n");
        System.out.println("Table 2 : " + table2.toString() + "\n");

        // Lier client1 -> table2
        client1.lierTable(table2);

        // Afficher toutes les informations
        System.out.println("Client 1 : " + client1.toString() + "\n");
        System.out.println("Client 2 : " + client2.toString() + "\n");
        System.out.println("Table 1 : " + table1.toString() + "\n");
        System.out.println("Table 2 : " + table2.toString() + "\n");
    }
}