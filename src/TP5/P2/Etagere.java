package TP5.P2;

import java.util.ArrayList;

public class Etagere {
    private final int capaciteMax;
    private ArrayList<Livre> livres;

    public Etagere(int capaciteMax) {
        this.capaciteMax = capaciteMax;
        this.livres = new ArrayList<>();
    }

    public int getNbreLivres() {
        return livres.size();
    }

    public int getCapacite() {
        return capaciteMax;
    }

    public void afficherLivres() {
        for (Livre livre : livres) {
            System.out.println("Titre: " + livre.getTitre() + ", Auteur: " + livre.getAuteur() + ", Pages: " + livre.getNbrePages());
        }
    }
    public void afficherLivre(Livre l1) {
        System.out.println("Titre: " + l1.getTitre() + ", Auteur: " + l1.getAuteur() + ", Pages: " + l1.getNbrePages());
    }

    public void ajouterLivre(Livre livre) throws Exeptions.CapaciteMaximaleAtteinteException {
            if (livres.size() < capaciteMax) {
                livres.add(livre);
            } else {
                throw new Exeptions.CapaciteMaximaleAtteinteException("CapaciteMaximaleAtteinteException");
            }
    }

    public void chercherLivre(int position) throws Exeptions.PositionInvalideException {

        System.out.println("\n======chercher Livre pos "+ position+"======");
            if (position > 0 && position <= livres.size()) {
                afficherLivre(livres.get(position - 1));
            } else {
                throw new Exeptions.PositionInvalideException("PositionInvalideException");
            }
    }
    public int chercherPosition(Livre livre) throws Exeptions.PositionInvalideException {
        System.out.println("\n======chercherPosition (" + livre.getTitre() + " " + livre.getAuteur() + ")======");
        for (int i = 0; i < livres.size(); i++) {
            if (livres.get(i).equals(livre)) {
                return i + 1;
            }
        }

        throw new Exeptions.PositionInvalideException("PositionInvalideException");
    }

    public boolean existe(String auteur, String titre) throws Exeptions.EtagereException {
        System.out.println("\n======chercher livre (" + auteur + " " + titre + ")======");
        if (!auteur.isEmpty() && !titre.isEmpty()) {
            for (int i = 0; i < livres.size(); i++) {
                Livre currentLivre = livres.get(i);
                if (currentLivre.getAuteur().equals(auteur) && currentLivre.getTitre().equals(titre)) {
                    return true;
                }
            }
            return false;
        } else {
            throw new Exeptions.EtagereException("Type both auteur and titre");
        }
    }

    public ArrayList<String> chercherLivresParAuteur(String auteur) throws Exeptions.EtagereException {
        System.out.println("\n======chercherLivresParAuteur(" + auteur + ")======");
        ArrayList<String> livresParAuteur = new ArrayList<>();
        for (Livre livre : livres) {
            if (livre.getAuteur().equals(auteur)) {
                String livreInfo = "Titre: " + livre.getTitre() + ", Auteur: " + livre.getAuteur() + ", Pages: " + livre.getNbrePages();
                livresParAuteur.add(livreInfo);
            }
        }
        if (livresParAuteur.isEmpty()) {
            throw new Exeptions.EtagereException("EtagereException");
        }
        return livresParAuteur;
    }

    public ArrayList<String> chercherLivresParTitre(String titre) throws Exeptions.EtagereException {
        System.out.println("\n======chercherLivresParTitre(" + titre + ")======");
        ArrayList<String> livresParTitre = new ArrayList<>();
        for (Livre livree : livres) {
            if (livree.getTitre().equals(titre)) {
                String livreInfo = "Titre: " + livree.getTitre() + ", Auteur: " + livree.getAuteur() + ", Pages: " + livree.getNbrePages();
                livresParTitre.add(livreInfo);
            }
        }
        if (livresParTitre.isEmpty()) {
            throw new Exeptions.EtagereException("EtagereException");
        }
        return livresParTitre;
    }


    public void supprimerLivreRearrangement(int position) throws Exeptions.PositionInvalideException {
            if (position > 0 && position <= livres.size()) {
                System.out.println("=====deleting "+ livres.get(position -1).getTitre()+"=======");
                livres.remove(position - 1);
            } else {
                throw new Exeptions.PositionInvalideException("PositionInvalideException");
            }
    }

    public void supprimerLivre(int position) throws Exeptions.PositionInvalideException {
            if (position > 0 && position <= livres.size()) {
                System.out.println("=====deleting "+ livres.get(position -1).getTitre()+"=======");
                livres.set(position - 1, livres.get(livres.size() - 1));
                livres.remove(livres.size() - 1);
            } else {
                throw new Exeptions.PositionInvalideException("PositionInvalideException");
            }
    }

    @Override
    public String toString() {
        return "Etagere{" +
                "livres=" + livres +
                '}';
    }
}
