package TP4.partie2;

import TP4.partie1.Personne;

import java.util.Arrays;

public class Enseignant extends Personne {
    private int nombreCours;
    private final String[] cours;
    private final int MAX_COURS = 8;

    public Enseignant(String nom, int age) {
        super(nom, age);
        this.cours = new String[MAX_COURS];
    }
    public boolean ajouteCours(String cour){
        for(int i=0; i<nombreCours; i++){
            if(cours[i].equalsIgnoreCase(cour)){
                System.out.println("Le cours est déjà présent");
                return false;
            }
        }
        cours[nombreCours] = cour;
        nombreCours++;
        return true;
    }

    @Override
    public String toString() {
        return "Enseignant{" + "Nom : "+ getNom() + " ,Age : " + getAge() +
                " ,cours=" + Arrays.toString(cours) +
                '}';
    }
    public void afficher(){
        System.out.println(this);
    }
}
