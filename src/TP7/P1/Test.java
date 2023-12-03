//Test.java

package TP7.P1;

public class Test {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("yahya");
        e1.ajouterNote(18);
        e1.ajouterNote(29);
        e1.ajouterNote(-2);
        e1.afficher();


        Etudiant e2 = new Etudiant("Joáo");
        e2.ajouterNote(8);
        e2.ajouterNote(12);
        e2.ajouterNote(1);

        System.out.println(e1.compareTo(e2));
        System.out.println(e2.compareTo(e1));
        System.out.println(e1.compareTo(e1));
    }
}
