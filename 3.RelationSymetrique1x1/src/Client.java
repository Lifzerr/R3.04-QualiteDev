public class Client {

    // Attributs
    private String _nom; // Nom du client
    private String _telephone; // Numéro de téléphone du client
    private Table _maTable; // Table du client

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
    public Table getTable() {return _maTable; }
    public void setTable(Table pTable) { this._maTable = pTable ;}

    // Méthodes
    // Méthodes usuelles
    public String toString() {
        return "Client " + _nom + " (" + _telephone + ")" + _maTable.toString();
    }

    // Méthodes spécifiques
    public void delierTable(){
        if(getTable() != null){
            this.getTable().setClient(null);
            this.setTable(null);
        }
    }

    public void lierTable(Table pTable){
        this.delierTable();
        pTable.delierClient();
        pTable.lierClient(this);
        this.setTable(pTable);
    }

}
