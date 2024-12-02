public class DecorateurA_DeComposant extends DecorateurDeComposant {
    public DecorateurA_DeComposant(IComposant composant) {
        super(composant);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("Ajout de fonctionnalités par le Décorateur A.");
    }
}