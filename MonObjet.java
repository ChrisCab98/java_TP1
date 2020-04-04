public class MonObjet
{
    private long valeur;

    public MonObjet()
    {
        System.out.println("Constructeur");
        valeur = 2;
    }

    public void affichePuisModifieValeur(long nouvelleValeur)
    {
        System.out.println("Affiche de la valeur : " + valeur);
        valeur = nouvelleValeur;
    }

    public static void main(String arguments[]) {
        MonObjet objet = new MonObjet();
        objet.affichePuisModifieValeur(10);
        System.out.println(("L'algo c'est rigolo ?"));
        objet.affichePuisModifieValeur(20);
    }
}