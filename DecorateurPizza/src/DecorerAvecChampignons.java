public class DecorerAvecChampignons extends DecorateurDeComposant{
    //CONSTRUCTEUR
    public DecorerAvecChampignons(IComposant composant){
        super(composant);
    }

    //METHODE A DECORER
    public String toString(){
        return composantDecore.toString() + " + des champignons";
    }
}
