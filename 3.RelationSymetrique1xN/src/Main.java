import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Création d'un plat
        PlatCuisine plat1 = new PlatCuisine("Spaghetti Bolognese", "Faire cuire les pâtes et préparer la sauce bolognaise.");

        // Création d'ingrédients
        Ingredient ingredient1 = new Ingredient("Pâtes", plat1);
        Ingredient ingredient2 = new Ingredient("Viande hachée", plat1);
        Ingredient ingredient3 = new Ingredient("Tomates", plat1);

        // Ajout des ingrédients au plat
        plat1.ajouterIngredient(ingredient1);
        plat1.ajouterIngredient(ingredient2);
        plat1.ajouterIngredient(ingredient3);

        // Afficher le plat avec ses ingrédients
        System.out.println("Plat créé : " + plat1);

        // Vérification si un ingrédient existe dans le plat
        System.out.println("L'ingrédient 'Pâtes' existe-t-il dans le plat ? " + plat1.existeIngredient(ingredient1));

        // Retirer un ingrédient du plat
        plat1.retirerIngredient(ingredient2);
        System.out.println("Après retrait de l'ingrédient 'Viande hachée' : " + plat1);

        // Délier un ingrédient du plat
        ingredient1.delierPlat();
        System.out.println("Après déliement de 'Pâtes' du plat : " + ingredient1);
    }
}
