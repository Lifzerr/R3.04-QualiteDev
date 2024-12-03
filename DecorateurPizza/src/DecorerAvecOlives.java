public class DecorerAvecOlives extends DecorateurDeComposant{
    //CONSTRUCTEUR
    public DecorerAvecOlives(IComposant composant){
        super(composant);
    }

    //METHODE A DECORER
    public String toString(){
        return composantDecore.toString() + " + des olives";
    }
}
