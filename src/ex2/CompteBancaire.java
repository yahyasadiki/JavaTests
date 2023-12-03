package ex2;

public class CompteBancaire {
    private final int numCompte;
    private final String nomProprietaire;
    private float soldeCompte;
    private static int Compteur=0;

    public CompteBancaire(int numCompte, String nomProprietaire, float soldeCompte) {
        this.numCompte = numCompte;
        this.nomProprietaire = nomProprietaire;
        this.soldeCompte = soldeCompte;
        Compteur++;
    }

    public void affiche(){
        System.out.println("N°du compte : "+numCompte+"\nNom du client : " +
                nomProprietaire);
    }
    public void consulterSolde(){
        System.out.println("Votre solde est : "+soldeCompte);
    }
    public static void afficher_nombre_de_compte() {
        System.out.println(Compteur);
    }
    public void deposerArgent(float montant) {
        if(montant <= 0){
            System.out.println("montant doit etre pos");
            return;
        }
        soldeCompte += montant;
    }
    public void retirerArgent(float montant) {
        if(montant > soldeCompte){
            System.out.println("Solde insuffisant");
            return;
        }
        soldeCompte -= montant;
    }
    public void virement(float montant, CompteBancaire b) {
        if(montant <= 0){
            System.out.println("montant doit etre pos");
            return;
        }
        if(montant > soldeCompte){
            System.out.println("Solde insuffisant");
            return;
        }
        soldeCompte = - montant;
        b.soldeCompte =+ montant;

        soldeCompte += montant;
    }

}

