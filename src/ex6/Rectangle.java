package ex6;
public class Rectangle {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public double perimetre() {
        return 2 * (longueur + largeur);
    }
    public double aire() {
        return longueur * largeur;
    }
    public boolean estRectCarre() {
        if(longueur == largeur){
            System.out.println("carre");
            return true;
        }
        else {
            System.out.println("n'est pas un carre");
            return false;
        }
    }

    public String toString() {
        if (estRectCarre()){
            return "Longueur : " + longueur + " - Largeur : " + largeur + " - Périmètre : " + perimetre() +
                    " - Aire : " + aire() + " C'est un carre " ;
        }
        else{
            return "Longueur : " + longueur + " - Largeur : " + largeur + " - Périmètre : " + perimetre() +
                    " - Aire : " + aire() + " Ce n'est un carre " ;
        }
        }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }


}
