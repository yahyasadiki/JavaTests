package ex3;

public class Point
{
    private double y;
    private double x;
    public Point(double x, double y){
        if(x > 0 && y > 0){
            this.y = y; this.x=x;
        }
    }

    public String toString(){
        return "X: "+ x + " Y :" + y ;
    }
    public void afficher(){
        System.out.println(this);
    }
    public Point maxNorme(Point p){
        Point resultat = null;
        float r1 = (float) Math.sqrt((x*x)+(y*y));
        float r2 = (float) Math.sqrt((p.x*p.x)+(p.y*p.y));
        if(r1>r2){
            resultat = this;
        }
        else{
            resultat = p;
        }
        return resultat;
    }
    public static Point maxNormeStatic(Point p1, Point p2){
        Point resultat = null;
        float r1 = (float) Math.sqrt((p1.x*p1.x)+(p1.y*p1.y));
        float r2 = (float) Math.sqrt((p2.x*p2.x)+(p2.y*p2.y));
        if(r1>r2){
            resultat = p1;
        }
        else{
            resultat = p2;
        }
        return resultat;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}
