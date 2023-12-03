package ex4;
public class TraitVect {
    private final double x;
    private final double y;
    private final double z;

    public TraitVect(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void affiche() {
        System.out.println("Vecteur (" + x + ", " + y + ", " + z + ")");
    }

    public double normeVect() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public static TraitVect sommeVect(TraitVect v1, TraitVect v2) {
        return new TraitVect(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    public double produitVect(TraitVect other) {
        return x * other.x + y * other.y + z * other.z;
    }
}
