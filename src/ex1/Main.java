package ex1;

public class Main {
    public static void main(String [] arg){
        equations e1 = new equations(2, -1, -6);
        equations e2 = new equations(1, 2, 1);
        equations e3 = new equations(1, 3, 10);

        e1.resolution();
        e2.resolution();
        e3.resolution();

        e1.affichage();
        e2.affichage();
        e3.affichage();
    }

}
