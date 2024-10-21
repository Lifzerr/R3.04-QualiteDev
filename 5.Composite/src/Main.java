public class Main {
    public static void main(String[] args) {
        // Création d'une pièce simple
        PieceSimple simplePiece = new PieceSimple("Vis", 2);

        // Création d'une pièce composée
        PieceComposee composeePiece = new PieceComposee("Moteur", 100);
        composeePiece.ajouterComposant(simplePiece);

        // Affichage des prix
        System.out.println("Prix de la pièce simple : " + simplePiece.getPrix() + "€");
        System.out.println("Prix de la pièce composée : " + composeePiece.getPrix() + "€");
    }
}
