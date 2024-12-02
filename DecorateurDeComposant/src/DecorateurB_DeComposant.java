public class DecorateurB_DeComposant extends DecorateurDeComposant {
    public DecorateurB_DeComposant(IComposant composant) {
        super(composant);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("Ajout de fonctionnalités par le Décorateur B.");
    }
}