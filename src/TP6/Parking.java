// Parking.java
package TP6;

import java.util.Arrays;

public class Parking {
    private int nombrePlace;
    private Voiture[] tableVoiture;

    public Parking(int nombrePlace) {
        this.nombrePlace = nombrePlace;
        this.tableVoiture = new Voiture[nombrePlace];
    }

    public void garer(Voiture v, int numPlace) throws PlaceNonLibreException, HorsParkingException{
        if (numPlace >= 0 && numPlace < nombrePlace) {
            if (tableVoiture[numPlace] == null) {
                tableVoiture[numPlace] = v;
            } else {
                throw new PlaceNonLibreException("PlaceNonLibreException");
            }
        } else {
            throw new HorsParkingException("HorsParkingException");
        }
    }

    public Voiture sortir(int numPlace) throws PlaceLibreException, HorsParkingException {
        if (numPlace >= 0 && numPlace < nombrePlace) {
            if (tableVoiture[numPlace] != null) {
                Voiture v1 = tableVoiture[numPlace];
                tableVoiture[numPlace] = null;
                return v1;
            } else {
                throw new PlaceLibreException("PlaceLibreException");
            }
        } else {
            throw new HorsParkingException("HorsParkingException");
        }
    }

    @Override
    public String toString() {
        for (int i = 0; i < nombrePlace; i++) {
            System.out.println("Numplace: "+ i + " || "+ tableVoiture[i]);
        }
        return "";
    }

    public Voiture[] getTableVoiture() {
        return tableVoiture;
    }
}
