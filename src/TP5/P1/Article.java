package TP5.P1;

abstract public class Article {
    protected float prixAchat;
    protected float prixVente;
    protected String nom;
    protected String fournisseur;

    public Article(float prixAchat, float prixVente, String nom, String fournisseur) {
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.nom = nom;
        this.fournisseur = fournisseur;
    }

    public float rendement() {
        return ((prixVente - prixAchat) / prixAchat) * 100;
    }

    @Override
    abstract public String toString();

    public float getPrixAchat() {
        return prixAchat;
    }

    public float getPrixVente() {
        return prixVente;
    }
}
