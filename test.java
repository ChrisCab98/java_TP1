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