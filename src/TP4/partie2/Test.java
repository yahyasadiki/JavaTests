package TP4.partie2;
import TP4.partie1.*;

public class Test {
    public static void main(String[] args) {
        Personne[] personnes = new Personne[5];
        personnes[0] = new Enseignant("yahya", 21);
        personnes[1] = new Etudiant("e1", 20);
        personnes[2] = new Etudiant("e2", 22);
        personnes[3] = new Enseignant("e3", 40);
        personnes[4] = new Etudiant("e4", 19);

        for (Personne personne : personnes) {
            if (personne instanceof Etudiant) {

                Etudiant etudiant = (Etudiant) personne;
                System.out.println(etudiant + " est un  etudiant");
            } else if (personne instanceof Enseignant) {

                Enseignant enseignant = (Enseignant) personne;
                System.out.println(enseignant + " est un  enseignant");
            }
        }
    }
}
