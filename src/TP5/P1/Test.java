package TP5.P1;

public class Test {

    public static void main(String[] args) {
        Magasin magasin = new Magasin();

        ArticleElectromenager articleElectromenager1 = new ArticleElectromenager(100, 120, "tv", "Samsung");
        ArticlePrimeur a2 = new ArticlePrimeur(100, 130, "Tomates", "Maroc Fruits");

        magasin.ajouterElectromenager(articleElectromenager1, 10);
        magasin.ajouterPrimeur(a2, 10);

        magasin.afficher();

        float venteElectromenager = articleElectromenager1.vendre(3);
        float ventePrimeur = a2.vendre(7f);

        System.out.println("Vente d'électroménager : " + venteElectromenager);
        System.out.println("Vente de primeur : " + ventePrimeur);

        magasin.afficher();

        float rendement = magasin.rendement();
        System.out.println("Taux de rendement du magasin : " + rendement + "%");
    }
}

