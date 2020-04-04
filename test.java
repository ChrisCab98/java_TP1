interface ObjetMesurable // Interface commune
{
    public double longueur();
}

class Chaine implements ObjetMesurable // Chaine se conforme a l'interface ObjetMesurable
{
    private String chaine; // Chaine est composée d'une String privée

    public Chaine(String chaine) { // Constructeur de la chaine
        this.chaine = chaine; // La variable membre chaine référence le paramètre chaine
    }

    public double longueur() {
        return (double) chaine.length();
    }

    public String toString() {
        return chaine.toString();
    }

}

abstract class BiPoint {
    protected double x1;
    protected double y1;
    protected double x2;
    protected double y2;

    public BiPoint(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}

class Segment extends BiPoint implements ObjetMesurable
{
    public Segment(double x1, double y1, double x2, double y2)
    {
        super(x1,y2,x2,y2);
    }

    public  double longueur() {
        return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow((y2-y1), 2));
    }

}

public class test
{
    public static void afficheLongueur(ObjetMesurable objet) // Méthode statique qui doit pouvoir afficher la longueur de tout ObjetMesurable
    {
        System.out.println("Longueur : " + objet.longueur());
    }

    public static void main(String[] args) {
        Chaine chaine = new Chaine("Coucou");
        afficheLongueur(chaine);
        Segment segment = new Segment(0, 0, 1, 1);
        afficheLongueur(segment);
    }

}