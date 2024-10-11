public class Ingredient {

    // ATTRIBUTS
    private String _libelle;
    private PlatCuisine _monPlat;

    // CONSTRUCTEURS

    // Constructeur sans paramètres
    public Ingredient() {
        _libelle = "";
        _monPlat = null;
    }

    // Constructeur avec paramètres
    public Ingredient(String libelle, PlatCuisine monPlat) {
        _libelle = libelle;
        _monPlat = monPlat;
    }

    // CONSTRUCTEUR par recopie
    public Ingredient(Ingredient autreIngredient) {
        _libelle = autreIngredient.get_libelle();
        _monPlat = autreIngredient.get_monPlat();
    }

    // ENCAPSULATION

    public String get_libelle() {
        return _libelle;
    }

    public void set_libelle(String libelle) {
        _libelle = libelle;
    }

    public PlatCuisine get_monPlat() {
        return _monPlat;
    }

    public void set_monPlat(PlatCuisine monPlat) {
        _monPlat = monPlat;
    }

    // METHODES USUELLES : equals, toString, clone

    // Vérifie si deux ingrédients sont identiques (comparaison du libellé et du plat)
    public boolean equals(Ingredient autreIngredient) {
        boolean memeLibelle = _libelle.equals(autreIngredient.get_libelle());
        boolean memePlat = (_monPlat != null && _monPlat.equals(autreIngredient.get_monPlat())) ||
                (_monPlat == null && autreIngredient.get_monPlat() == null);
        return memeLibelle && memePlat;
    }

    // Méthode clone (dupliquer l'ingredient)
    public Ingredient dupliquer() {
        return new Ingredient(this);
    }

    // Représentation textuelle de l'ingredient
    public String toString() {
        String platDescription = (_monPlat != null) ? _monPlat.get_libelle() : "Aucun plat lié";
        return "Ingredient: " + _libelle + ", Plat: " + platDescription;
    }



    // METHODES GESTION DU PLAT

    // Lier cet ingrédient à un plat
    public void lierPlat(PlatCuisine monPlat) {
        if(monPlat != null) {
            set_monPlat(null);
        }
        set_monPlat(monPlat);
        _monPlat.ajouterIngredient(this);
    }

    // Délier cet ingrédient du plat
    public void delierPlat() {
        if (_monPlat.existeIngredient(this)) {
            _monPlat.retirerIngredient(this);
        }
        set_monPlat(null);
    }
}
