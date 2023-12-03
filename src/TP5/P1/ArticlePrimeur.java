package TP5.P1;

public class ArticlePrimeur extends Article implements Vendable<Float>, Solde {
    private float stock;

    public ArticlePrimeur(float prixAchat, float prixVente, String nom, String fournisseur) {
        super(prixAchat, prixVente, nom, fournisseur);
        this.stock = 0;
    }

    public void remplirStock(int quantite) {
        stock += quantite;
    }

    @Override
    public String toString() {
        return "ArticlePrimeur{ rendement=" + rendement() +
                ", stock=" + stock +
                ", prixAchat=" + prixAchat +
                ", prixVente=" + prixVente +
                ", nom='" + nom + '\'' +
                ", fournisseur='" + fournisseur + '\'' +
                '}';
    }

    public void afficher() {
        System.out.println(this);
    }

    @Override
    public void lanceSolde(int pourcentage) {
        if (pourcentage > 0 && pourcentage < 100) {
            prixVente -= (prixVente * pourcentage / 100);
        }
    }

    @Override
    public void termineSolde(int pourcentage) {
        if (pourcentage > 0 && pourcentage < 100) {
            prixVente += (prixVente * pourcentage / 100);
        }
    }

    @Override
    public float vendre(Float quantite) {
        if (quantite < stock) {
            stock -= quantite;
            return (prixVente * quantite);
        } else {
            System.out.println("Stock not enough");
            return 0;
        }
    }
}
