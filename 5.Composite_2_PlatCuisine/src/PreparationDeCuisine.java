public abstract class PreparationDeCuisine {

    // Attributs
    String _libelle;
    int _prix;


    // Constructeurs
    public PreparationDeCuisine() {
        this._libelle = "";
        this._prix = 0;
    }

    public PreparationDeCuisine(String pLibelle, int pPrix) {
        this._libelle = pLibelle;
        this._prix = pPrix;
    }


    // Encapsulation
    public String getLibelle() {
        return this._libelle;
    }

    public int getPrixBase() {
        return this._prix;
    }

    public void setLibelle(String pLibelle) {
        this._libelle = pLibelle;
    }

    public void setPrix(int pPrix) {
        this._prix = pPrix;
    }


    // méthodes pour les sous-classes
    public boolean ajouterComposant(PreparationDeCuisine composant) {
        return false;
    }

    public boolean enleverComposant(PreparationDeCuisine composant) {
        return false;
    }

    public boolean existeComposant(PreparationDeCuisine composant) {
        return false;
    }


    // Méthode de la superClasse - métiers
    public abstract int getPrix();

    public abstract String toString();


    // Méthode supp
    public abstract boolean estComposé();
}


