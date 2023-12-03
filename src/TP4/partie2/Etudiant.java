package TP4.partie2;
import TP4.partie1.Personne;

public class Etudiant extends Personne{
    private int nombreCours;
    private final String[] cours;
    private final double[] notes;
    private final int MAX_COURS = 10;

    public Etudiant(String nom, int age) {
        super(nom, age);
        this.cours = new String[MAX_COURS];
        this.notes = new double[MAX_COURS];
    }


    public void ajouteCoursNote(String cours,  double notes){
        this.cours[nombreCours] = cours;
        this.notes[nombreCours] = notes;
        nombreCours++;
    }
    public void afficheNotes(){
        for (int i =0; i<nombreCours;i++){
            System.out.println(cours[i] + " : " + getNom() + "Notes" + notes[i]);
        }
    }

    public double noteMoyenne(){
        double moyenne = 0;
        for(int i=0; i<nombreCours; i++){
            moyenne += notes[i];
        }
        return moyenne/nombreCours;
    }

    @Override
    public String toString() {
        return "Etudiant " + super.toString();
    }
}
