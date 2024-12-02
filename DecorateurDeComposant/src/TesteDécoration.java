public class TesteDécoration {
    // METHODE PRINCIPALE : main ()
    public static void main(String[] args) {
        // Création d’un composantDeBase
        IComposant composantDeBase = new ComposantDeBase();
        composantDeBase.operation(); // Fait l’opération de base
        System.out.println();

        // Création d’un autreComposant basé sur composantDeBase
        IComposant autreComposant = new DecorateurA_DeComposant(composantDeBase);
        autreComposant.operation(); // Fait l’opération de base décorée par A
        System.out.println();

        // Ajout d’un décorateur B autour de autreComposant
        autreComposant = new DecorateurB_DeComposant(autreComposant);
        autreComposant.operation(); // Fait l’opération de base décorée par A et B
    }
}