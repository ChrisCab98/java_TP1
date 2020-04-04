public class MonObjet {
    private long valeur;

    public MonObjet(long valeurUtilisateur) {
        System.out.println("Constructeur");
        valeur = valeurUtilisateur;
    }

    public void affichePuisModifieValeur(long nouvelleValeur) {
        System.out.println("Affiche de la valeur : " + valeur);
        valeur = nouvelleValeur;
    }

    public static void main(String arguments[]) {
        MonObjet objet = new MonObjet(20);
        objet.affichePuisModifieValeur(10);
        System.out.println(("L'algo c'est rigolo ?"));
        objet.affichePuisModifieValeur(20);
    }
}