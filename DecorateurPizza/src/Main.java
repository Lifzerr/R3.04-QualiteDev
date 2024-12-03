public class Main {
    public static void main(String[] args) {
        // Création d'un composant de base
        IComposant pizza = new ComposantPizza();
        System.out.println(pizza.toString()); // Affichage du composant de base

        // Ajout du comportement de décoration avec les olives
        pizza = new DecorerAvecOlives(pizza);
        System.out.println(pizza.toString()); // Affichage après ajout des olives

        // Ajout des décorations supplémentaires avec les champignons
        pizza = new DecorerAvecChampignons(pizza);
        System.out.println(pizza.toString()); // Affichage après ajout des champignons
    }
}
