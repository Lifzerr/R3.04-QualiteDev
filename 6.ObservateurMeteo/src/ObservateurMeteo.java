// Classe concrète : ObservateurMeteo
class ObservateurMeteo extends Observateur {
    private String libelle;
    private String dateHeureLocale;
    private double temperatureLocale;
    private double pressionLocale;

    // Constructeur
    public ObservateurMeteo(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public void reagir() {
        if (observable instanceof ObservableMeteo) {
            ObservableMeteo meteo = (ObservableMeteo) observable;
            this.dateHeureLocale = meteo.getDateHeure();
            this.temperatureLocale = meteo.getTemperature();
            this.pressionLocale = meteo.getPression();
        }
    }

    // Getter pour le libellé
    public String getLibelleObservateur() {
        return libelle;
    }

    @Override
    public String toString() {
        return libelle + " : Date et heure (" + dateHeureLocale + "), Température °C (" + temperatureLocale + "), Pression hPa (" + pressionLocale + ")";
    }
}