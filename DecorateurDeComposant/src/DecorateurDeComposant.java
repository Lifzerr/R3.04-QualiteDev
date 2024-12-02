public abstract class DecorateurDeComposant implements IComposant {
    protected IComposant composantDecoré;

    public DecorateurDeComposant(IComposant composant) {
        this.composantDecoré = composant;
    }

    public void setDecorateurDeComposant(IComposant composant) {
        this.composantDecoré = composant;
    }

    public IComposant getComposantDecoré() {
        return composantDecoré;
    }

    @Override
    public void operation() {
        if (composantDecoré != null) {
            composantDecoré.operation();
        }
    }
}