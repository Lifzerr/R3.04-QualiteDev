public class SingletonChefCuisinier {

    // Attributs
    private static SingletonChefCuisinier instance = null;
    private String _nom; // Nom du chef
    private String _prenom; // Prénom du chef

    // Constructeur
    private SingletonChefCuisinier(){};

    // Méthode spécifique au Singleton
    public static SingletonChefCuisinier getInstance(){
        if(instance == null){
            instance = new SingletonChefCuisinier();
        }
        return instance;
    }

    // Encapsulation
    // Getters
    public String getNom(){
        return this._nom;
    }

    public String getPrenom(){
        return this._prenom;
    }


    // Setters
    public void setNom(String pNom){
        this._nom = pNom;
    }

    public void setPrenom(String pPrenom){
        this._prenom = pPrenom;
    }


    // Méthodes usuelles
    // Affichage des informations de l'objet
    public String toString(){
        return ("Chef " + _prenom + "  " + _nom);
    }

}
