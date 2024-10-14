public class Table {

    // Attributs
    private String _numero; // Numéro de la table
    private Client _monClient; // Client de la table

    // Constructeurs
    public Table(String numero) {
        _numero = numero;
    }
    public Table() {
        _numero = "0";
    }
    public Table(Table table) {
        _numero = table._numero;
    }

    // Encapsulation
    public String getNumero() {
        return _numero;
    }
    public void setNumero(String numero) {
        _numero = numero;
    }
    public Client getClient(){ return _monClient ;}
    public void setClient (Client pClient) {this._monClient = pClient; }

    // Méthodes
    // Méthodes usuelles
    public String toString() {
        return "Table n°" + _numero + _monClient.toString();
    }

    // Méthodes spécifiques
    public void delierClient(){
        if(_monClient != null) {
            _monClient.setTable(null);
            this.setClient(null);
        }
    }

    public void lierClient(Client pClient){
        this.delierClient();
        pClient.delierTable();
        this.setClient(pClient);
        this.getClient().setTable(this);
    }
}
