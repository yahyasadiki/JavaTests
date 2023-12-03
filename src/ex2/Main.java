package ex2;

import ex2.*;

public class Main {
    public static void main(String [] arg){

        CompteBancaire b1 = new CompteBancaire(111, "yahya", 40000);
        CompteBancaire b2 = new CompteBancaire(111, "yahya", 3000);

        b1.retirerArgent(+400);
        b2.retirerArgent(900);

        b1.affiche(); b1.consulterSolde();

        b2.affiche(); b2.consulterSolde();

        b1.virement(1000,b2);

    }

}
