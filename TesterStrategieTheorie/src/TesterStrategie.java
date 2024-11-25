public class TesterStrategie {
    public static void main(String[] args) {
        ClasseXUtilisantStrategie objetX;
        objetX = new ClasseXUtilisantStrategie();

        IStrategie maStrategie;

        maStrategie = new StrategieConcrete1();
        objetX.setLaStrategie(maStrategie);
        objetX.operationMetier();

        maStrategie = new StrategieConcrete2();
        objetX.setLaStrategie(maStrategie);
        objetX.operationMetier();
    }
}