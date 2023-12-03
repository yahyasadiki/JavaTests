package ex1;

public class equations {
     double a, b, c , delta, r1, r2;

    public equations(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void resolution() {
        delta = (b * b) - (4 * a * c);
        if (delta > 0) {
            r1 = (-b + Math.sqrt(delta)) / (2 * a);
            r2 = (-b - Math.sqrt(delta)) / (2 * a);
        } else if (delta == 0) {
            r1 = -b / (2 * a);
        }
    }

    public void affichage() {
        if (delta > 0) {
            System.out.println("2 racines reel : r1 = " + r1 + ", r2 = " + r2);
        } else if (delta == 0) {
            System.out.println("1 racine reel : r1 = " + r1);
        } else {
            System.out.println("0 de racines reel.");
        }
    }
}

