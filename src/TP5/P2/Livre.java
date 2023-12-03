package TP5.P2;

public class Livre{
    private String titre;
    private String auteur;
    private int nbrePages;

    public Livre(String titre, String auteur, int nbrePages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbrePages = nbrePages;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Livre livre = (Livre) obj;
        return titre.equals(livre.titre) && auteur.equals(livre.auteur);
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbrePages() {
        return nbrePages;
    }
}
