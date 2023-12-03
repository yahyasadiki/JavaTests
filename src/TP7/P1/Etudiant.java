// Etudiant.java
package TP7.P1;

import java.util.ArrayList;

public class Etudiant implements Comparable<Etudiant> {
    protected String nom;
    protected ArrayList<Integer> listeNotes;
    protected double moyenne;

    public Etudiant() {
        this.moyenne = 0;
        this.listeNotes = new ArrayList<>();
    }

    public Etudiant(String nom) {
        this.nom = nom;
        this.listeNotes = new ArrayList<>();
        this.moyenne = 0;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Integer> getListeNotes() {
        return listeNotes;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void ajouterNote(int note) {
        listeNotes.add(Math.max(0, Math.min(20, note)));
        moyenne = listeNotes.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    @Override
    public int compareTo(Etudiant autreEtudiant) {
        return Double.compare(this.moyenne, autreEtudiant.moyenne);
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "moyenne=" + moyenne +
                '}';
    }

    public void afficher(){
        System.out.println(this);
    }
}