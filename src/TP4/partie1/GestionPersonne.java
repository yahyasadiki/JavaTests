package TP4.partie1;

public class GestionPersonne {
    public static void main(String[] args) {
        double[] comptes1 = { 1000, 600, 2000 };
        double[] comptes2 = { 500 };

        Personne p1 = new Personne("yahya", 21, comptes1);
        Personne p2 = new Personne("messi", 35, comptes2);

        p1.afficher(); p2.afficher();

        p1.diviserParDeux();
        System.out.println(p1);
    }
}