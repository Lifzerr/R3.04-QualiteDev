public class TesteComposite {
    public static void main(String[] args) {

        // Création des préparations simples
        PreparationSimple pate = new PreparationSimple("Pâtes", 5);
        PreparationSimple viandeHachee = new PreparationSimple("Viande Hachée", 8);
        PreparationSimple tomateCuite = new PreparationSimple("Tomate Cuite", 3);
        PreparationSimple assaisonnement = new PreparationSimple("Assaisonnement", 1);

        // Création de la préparation composée "Sauce Tomate"
        PreparationComposee sauceTomate = new PreparationComposee("Sauce Tomate", 2);
        sauceTomate.ajouterComposant(tomateCuite);
        sauceTomate.ajouterComposant(assaisonnement);

        // Création de la préparation composée "Sauce Bolognaise"
        PreparationComposee sauceBolo = new PreparationComposee("Sauce Bolognaise", 4);
        sauceBolo.ajouterComposant(viandeHachee);
        sauceBolo.ajouterComposant(sauceTomate);

        // Création de la préparation finale "Pâtes Bolognaise"
        PreparationComposee patesBolo = new PreparationComposee("Pâtes Bolognaise", 3);
        patesBolo.ajouterComposant(pate);
        patesBolo.ajouterComposant(sauceBolo);

        // Affichage du prix total de chaque préparation
        System.out.println("Prix des Pâtes : " + pate.getPrix() + "€");
        System.out.println("Prix de la Sauce Tomate : " + sauceTomate.getPrix() + "€");
        System.out.println("Prix de la Sauce Bolognaise : " + sauceBolo.getPrix() + "€");
        System.out.println("Prix des Pâtes Bolognaise : " + patesBolo.getPrix() + "€");
    }
}
