public class ClasseXUtilisantStrategie {
    private IStrategie uneStrategie;

    public IStrategie getUneStrategie() {
        return uneStrategie;
    }

    public void setLaStrategie(IStrategie uneStrategie) {
        this.uneStrategie = uneStrategie;
    }

    public void operationMetier() {
        System.out.println("Commencement de l'opération métier");
        getUneStrategie().methodeDeStrategie();
        System.out.println("Fin de l'opération métier");
    }
}