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