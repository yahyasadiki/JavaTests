package TP6;

public class Voiture {
    private String nomProprietaire;
    private String marque;
    private String type;
    private int nombreCheval;

    public Voiture(String nomProprietaire, String marque, String type, int nombreCheval) {
        this.nomProprietaire = nomProprietaire;
        this.marque = marque;
        this.type = type;
        this.nombreCheval = nombreCheval;
    }

    public String getNumProprietaire() {
        return nomProprietaire;
    }

    public void setNumProprietaire(String numProprietaire) {
        this.nomProprietaire = numProprietaire;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNombreCheval() {
        return nombreCheval;
    }

    public void setNombreCheval(int nombreCheval) {
        this.nombreCheval = nombreCheval;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "nomProprietaire='" + nomProprietaire + '\'' +
                ", marque='" + marque + '\'' +
                ", type='" + type + '\'' +
                ", nombreCheval=" + nombreCheval +
                '}';
    }
}
