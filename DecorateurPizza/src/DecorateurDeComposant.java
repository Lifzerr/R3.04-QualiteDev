public abstract class DecorateurDeComposant implements IComposant{
    //ATTRIBUT
    public IComposant composantDecore;

    //CONSTRUCTEUR
    public DecorateurDeComposant (IComposant composant){
        setComposantDecore(composant);
    }

    //METHODE
    public void setComposantDecore(IComposant composant){
        this.composantDecore = composant;
    }

    public IComposant getComposantDecore(){
        return this.composantDecore;
    }
}
