public class Table {

    // Attributs
    private String _numero; // Numéro de la table

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

    // Méthodes
    // Méthodes usuelles
    public String toString() {
        return "Table n°" + _numero;
    }
}
