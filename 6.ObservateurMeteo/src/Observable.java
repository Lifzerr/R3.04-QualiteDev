import java.util.ArrayList;
import java.util.List;

// Classe abstraite : Observable
abstract class Observable {
    protected List<Observateur> observateurs = new ArrayList<>();

    // Ajouter un observateur
    public void ajouterObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    // Supprimer un observateur
    public void supprimerObservateur(Observateur observateur) {
        observateurs.remove(observateur);
    }

    // Notifier tous les observateurs
    protected void notifierObservateurs() {
        for (Observateur observateur : observateurs) {
            observateur.reagir();
        }
    }
}