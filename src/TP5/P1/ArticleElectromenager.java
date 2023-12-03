package TP5.P1;

class ArticleElectromenager extends Article implements Vendable<Integer>, Solde {
    private int stock;

    public ArticleElectromenager(float prixAchat, float prixVente, String nom, String fournisseur) {
        super(prixAchat, prixVente, nom, fournisseur);
        this.stock = 0;
    }

    public void remplirStock(int quantite) {
        stock += quantite;
    }

    public void afficher() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ArticleElectromenager{ rendement=" + rendement() +
                ", stock=" + stock +
                ", prixAchat=" + prixAchat +
                ", prixVente=" + prixVente +
                ", nom='" + nom + '\'' +
                ", fournisseur='" + fournisseur + '\'' +
                '}';
    }


    @Override
    public void lanceSolde(int pourcentage) {
        if (pourcentage > 0 && pourcentage < 100) {
            System.out.println("old price : " + prixVente);
            prixVente -= (prixVente * pourcentage / 100);
            System.out.println("new price : " + prixVente);
        }
    }

    @Override
    public void termineSolde(int pourcentage) {
        if (pourcentage > 0 && pourcentage < 100) {
            System.out.println("old price : " + prixVente);
            prixVente += (prixVente * pourcentage / 100);
            System.out.println("new price : " + prixVente);
        }
    }

    @Override
    public float vendre(Integer quantite) {
        if (quantite < stock) {
            stock -= quantite;
            return (prixVente * quantite);
        } else {
            System.out.println("Stock not enough");
            return 0;
        }
    }
}