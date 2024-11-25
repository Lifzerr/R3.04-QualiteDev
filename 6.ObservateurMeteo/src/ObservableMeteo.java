// Classe concrète : ObservableMeteo
class ObservableMeteo extends Observable {
    private String libelle;
    private String dateHeure;
    private double temperature;
    private double pression;

    // Constructeur
    public ObservableMeteo(String libelle) {
        this.libelle = libelle;
    }

    // Mettre à jour les valeurs observées
    public void setDateHeureTemperaturePression(String dateHeure, double temperature, double pression) {
        this.dateHeure = dateHeure;
        this.temperature = temperature;
        this.pression = pression;
        notifierObservateurs();
    }

    // Getters
    public String getDateHeure() {
        return dateHeure;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPression() {
        return pression;
    }

    @Override
    public String toString() {
        return libelle + " : Date et heure (" + dateHeure + "), Température °C (" + temperature + "), Pression hPa (" + pression + ")";
    }
}