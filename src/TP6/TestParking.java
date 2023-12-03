
package TP6;

public class TestParking {
    public static void main(String[] args) {
        Voiture v1 = new Voiture("Yahya", "BMW", "Coupé", 45);
        Voiture v2 = new Voiture("Messi", "Mercedes", "SUV", 20);
        Parking p1 = new Parking(5);

        System.out.println("\033[35m==Afficher etat Parking initial==\033[0m" + p1.toString() + "\n");

        try {
            p1.garer(v1, 0);p1.garer(v1, 0);}
        catch (PlaceNonLibreException | HorsParkingException e){
            e.printStackTrace();
        }

        try {
            p1.sortir(0);
        }
        catch (PlaceLibreException | HorsParkingException e){
            e.printStackTrace();
        }

        System.out.println("\033[33m==Etat Parking apres Supprimer une de 2 Voitures==\033[0m" + p1.toString());
    }
}
