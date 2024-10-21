public class PreparationSimple extends PreparationDeCuisine{

    // Constructeurs
    public PreparationSimple(){
        super();
    }

    public PreparationSimple(String pLibelle, int pPrix){
        super(pLibelle, pPrix);
    }

    @Override
    public int getPrix(){
        return getPrixBase();
    }

    // Méthode de composition
    @Override
    public boolean estComposé(){
        return false;
    }

    @Override
    public String toString(){
        return getLibelle() + " - " + getPrix();
    }
}
