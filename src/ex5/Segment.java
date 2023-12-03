package ex5;
import ex3.Point;
public class Segment {
    private Point p1;
    private Point p2;

    public Segment (double x1, double y1, double x2, double y2){
        this.p1 = new Point(x1,y1);
        this.p2 = new Point(x2,y2);
    }
    public Segment (Point p1, Point p2){
        this.p1 = p1; this.p2 = p2;
    }
    public Segment (){
    }
    public float longueur(){
        return (float) Math.sqrt(Math.sqrt((p2.getX() - p1.getX())+(p1.getX()*p1.getY())));
    }
    public void depOrigin(float a, float b){
        p1.setX(p1.getX());
        p1.setY(p1.getY());
    }
    public void depExtremite(){
        p2.setX(p2.getX());
        p2.setY(p2.getY());
    }

    @Override
    public String toString() {
        return "Segment{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    public void affiche(){
        System.out.println(this);
    }

}
