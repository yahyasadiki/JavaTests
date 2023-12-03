package TP5.P1;

import java.util.ArrayList;

public class Magasin {
    private float depense;
    private float revenu;
    private final ArrayList<ArticleElectromenager> articleElectromenagerArray;
    private final ArrayList<ArticlePrimeur> articlePrimeurArray;

    public Magasin() {
        this.depense = 0;
        this.revenu = 0;
        this.articleElectromenagerArray = new ArrayList<>();
        this.articlePrimeurArray = new ArrayList<>();
    }

    public float rendement() {
        if (depense == 0) {
            return 0;
        }
        return ((revenu - depense) / depense) * 100;
    }

    public void ajouterPrimeur(ArticlePrimeur ap, int stock) {
        articlePrimeurArray.add(ap);
        depense += ap.getPrixAchat() * stock;
        revenu += ap.getPrixAchat() * stock;
        ap.remplirStock(stock);
    }

    public void ajouterElectromenager(ArticleElectromenager ae, int stock) {
        articleElectromenagerArray.add(ae);
        depense += ae.getPrixAchat() * stock;
        revenu += ae.getPrixVente() * stock;
        ae.remplirStock(stock);
    }

    public void afficher() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Magasin{" +
                "depense=" + depense +
                ", revenu=" + revenu +
                ", articleElectromenagerArray=" + articleElectromenagerArray +
                ", articlePrimeurArray=" + articlePrimeurArray +
                '}';
    }
}
