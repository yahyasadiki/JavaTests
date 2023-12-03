package ex5;

import ex3.*;

public class Test {
    public static void main(String [] arg){
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);
        Segment s1 = new Segment(p1,p2);
        Segment s2 = new Segment(1,2,3,4);
        s1.affiche();
        System.out.println(s1.longueur());
        s1.depOrigin(1,2);
        s1.affiche();
        s1.depExtremite();
        s1.affiche();

    }
}
