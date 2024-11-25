// Classe abstraite : Observateur
abstract class Observateur {
    protected Observable observable;

    // Associer un observable
    public void setObservable(Observable observable) {
        this.observable = observable;
    }

    // Méthode abstraite pour réagir
    public abstract void reagir();
}