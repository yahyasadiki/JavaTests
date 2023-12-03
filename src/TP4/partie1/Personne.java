package TP4.partie1;

public class Personne {
    private String nom;
    private int age;
    private double[] comptes;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public Personne() {}

    public Personne(String nom, int age, double[] comptes) {
        this(nom, age);
        this.comptes = comptes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public double[] getComptes() {
        return comptes;
    }
    public void afficher() {
        System.out.println("Nom : " + nom + " Age : " + age + " ans");
        if (comptes != null && comptes.length > 0) {
            System.out.print("Comptes : ");
            for (double compte : comptes) {
                System.out.print(compte + " ");
            }
            System.out.println();
        }
    }
    public void diviserParDeux() {
        if (comptes != null) {
            for (int i = 0; i < comptes.length; i++) {
                comptes[i] /= 2;
            }
        }
    }
    @Override
    public String toString() {
        return "Nom : " + nom + " Age : " + age + " ans";
    }


}
