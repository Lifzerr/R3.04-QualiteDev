public class Client {

    // Attributs
    private String _nom; // Nom du client
    private String _telephone; // Numéro de téléphone du client

    // Constructeurs
    public Client(String nom, String telephone) {
        _nom = nom;
        _telephone = telephone;
    }
    public Client() {
        _nom = "Inconnu";
        _telephone = "Inconnu";
    }
    public Client(Client client) {
        _nom = client._nom;
        _telephone = client._telephone;
    }

    // Encapsulation
    public String getNom() {
        return _nom;
    }
    public void setNom(String nom) {
        _nom = nom;
    }
    public String getTelephone() {
        return _telephone;
    }
    public void setTelephone(String telephone) {
        _telephone = telephone;
    }

    // Méthodes
    // Méthodes usuelles
    public String toString() {
        return "Client " + _nom + " (" + _telephone + ")";
    }

}
