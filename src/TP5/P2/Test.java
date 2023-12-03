package TP5.P2;

public class Test {
    public static void main(String[] args) {

        Etagere etagere = new Etagere(5);
        Livre l1 = null, l2 = null, l3 = null, l4 = null;
        try {
            l1 = new Livre("Book1", "Author1", 100);
            etagere.ajouterLivre(l1);
            l2 = new Livre("Book2", "Author2", 150);
            etagere.ajouterLivre(l2);
            l3 = new Livre("Book3", "Author2", 200);
            etagere.ajouterLivre(l3);
            l4 = new Livre("Book4", "Author3", 122);
            etagere.ajouterLivre(l4);

            try {
                etagere.chercherLivre(2);
            } catch (Exeptions.PositionInvalideException e) {
                e.printStackTrace();
            }

            try {
                int a = 0;
//            a = etagere.chercherPosition(new Livre("Book4", "Author4", 299));
//            System.out.println(a);
                a = etagere.chercherPosition(l2);
                System.out.println(a);
            } catch (Exeptions.PositionInvalideException e) {
                e.printStackTrace();
            }


            try {
                System.out.println(etagere.existe("Author2", "Book2"));
                System.out.println(etagere.existe("Author2", "Book3"));
//            System.out.println(etagere.existe("", ""));
            } catch (Exeptions.EtagereException e) {
                e.printStackTrace();
            }

            try {
                System.out.println(etagere.chercherLivresParAuteur("Author2"));
                System.out.println(etagere.chercherLivresParTitre("Book1"));
            } catch (Exeptions.EtagereException e) {
                e.printStackTrace();
            }

            try{
                etagere.supprimerLivreRearrangement(3);
                etagere.afficherLivres();
                 etagere.supprimerLivre(1);
                 etagere.afficherLivres();
            }
            catch (Exeptions.PositionInvalideException e) {
                e.printStackTrace();
            }
        } catch (Exeptions.CapaciteMaximaleAtteinteException e) {
            e.printStackTrace();
        }

    }


}

