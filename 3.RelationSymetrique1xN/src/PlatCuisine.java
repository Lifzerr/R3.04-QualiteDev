import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;


public class PlatCuisine {

    private String _libelle;
    private String _recette;
    private ArrayList<Ingredient> _mesIngredients;

    // CONSTRUCTEURS

    // sans parametre => initialise les attributs par defaut
    public PlatCuisine() {
        _libelle = "";
        _recette = "";
        _mesIngredients = new ArrayList<>();
    }

    // un parametre par attribut => affecte les attributs
    public PlatCuisine(String l, String r) {
        set_libelle(l);
        set_recette(r);
        _mesIngredients = new ArrayList<>();
    }

    // constructeur par recopie
    public PlatCuisine(PlatCuisine PlatCuisineModele) {
        set_libelle(PlatCuisineModele.get_libelle());
        set_recette(PlatCuisineModele.get_recette());
        _mesIngredients = new ArrayList<>(PlatCuisineModele.get_mesIngredients());
    }

    // ENCAPSULATION

    public String get_libelle() {
        return _libelle;
    }

    public String get_recette() {
        return _recette;
    }

    public ArrayList<Ingredient> get_mesIngredients() {
        return _mesIngredients;
    }

    public void set_libelle(String l) {
        _libelle = l;
    }

    public void set_recette(String r) {
        this._recette = r;
    }

    // METHODES USUELLES : equals, toString, clone

    public boolean equals(PlatCuisine unPlat) {
        boolean resultat;
        resultat = (get_libelle().equals(unPlat.get_libelle()) && get_recette().equals(unPlat.get_recette()));
        return resultat;
    }

    public PlatCuisine dupliquer() {
        PlatCuisine laCopie = new PlatCuisine();
        laCopie.set_libelle(get_libelle());
        laCopie.set_recette(get_recette());
        laCopie._mesIngredients = new ArrayList<>(this._mesIngredients);
        return laCopie;
    }


    public String toString1() {
        StringBuilder sb = new StringBuilder();
        sb.append("_libelle (").append(get_libelle()).append("), _recette (").append(get_recette()).append("), Ingredients : ");

        // Parcours de la liste d'ingrédients avec un accès direct par index
        for (int i = 0; i < _mesIngredients.size(); i++) {
            sb.append("\n").append(_mesIngredients.get(i).toString());
        }

        return sb.toString();
    }


    public String toString2() {
        StringBuilder sb = new StringBuilder();
        sb.append("_libelle (").append(get_libelle()).append("), _recette (").append(get_recette()).append("), Ingredients : ");

        // Parcours de la liste d'ingrédients et ajout à la chaîne de caractères
        for (Ingredient ingredient : _mesIngredients) {
            sb.append("\n").append(ingredient.toString());
        }

        return sb.toString();
    }


    public String toString3() {
        StringBuilder sb = new StringBuilder();
        sb.append("_libelle (").append(get_libelle()).append("), _recette (").append(get_recette()).append("), Ingredients : ");

        // Création de l'itérateur pour parcourir la liste d'ingrédients
        Iterator<Ingredient> iterator = _mesIngredients.iterator();

        // Parcours de la liste à l'aide de l'itérateur
        while (iterator.hasNext()) {
            Ingredient ingredient = iterator.next();
            sb.append("\n").append(ingredient.toString());
        }

        return sb.toString();
    }



    // METHODES GESTION D'INGREDIENTS

    // Verifie si un ingredient existe dans la liste
    public boolean existeIngredient(Ingredient ingredient) {
        return _mesIngredients.contains(ingredient);
    }

    // Ajoute un ingredient si il n'existe pas deja
    public boolean ajouterIngredient(Ingredient ingredient) {
        if (!existeIngredient(ingredient)) {
            _mesIngredients.add(ingredient);
            return true;
        }
        return false;
    }

    // Retire un ingredient s'il existe
    public boolean retirerIngredient(Ingredient ingredient) {
        if (existeIngredient(ingredient)) {
            _mesIngredients.remove(ingredient);
            return true;
        }
        return false;
    }

    // Lie un ingredient a ce plat
    public void lierIngredient(Ingredient ingredient) {
        if(ingredient.get_monPlat() != null){
            ingredient.set_monPlat(null);
        }
        ingredient.set_monPlat(this);
        ajouterIngredient(ingredient);
    }

    // Délie un ingredient de ce plat
    public void delierIngredient(Ingredient ingredient) {
        if(ingredient.get_monPlat() != null) {
            ingredient.set_monPlat(null);
        }
        retirerIngredient(ingredient);
    }

}