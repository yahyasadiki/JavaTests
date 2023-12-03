package ex4;

public class Test {
    public static void main(String[] args) {
        TraitVect t1 = new TraitVect(1, 2, 3);
        TraitVect t2 = new TraitVect(4, 5, 6);

        t1.affiche();
        t2.affiche();

        System.out.println(t1.normeVect());

        TraitVect s1 = TraitVect.sommeVect(t1, t2);
        s1.affiche();

        double produitScalaire = t1.produitVect(t2);
        System.out.println(produitScalaire);
    }
}
