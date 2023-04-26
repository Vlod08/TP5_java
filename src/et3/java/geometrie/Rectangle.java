package et3.java.geometrie;

public final class Rectangle extends Forme{
    private int longeur;
    private int largeur;

    @Override
    public String toString()
    {
        return "[ Rectangle\n" +
                "\t\t[ centre de gravité : "+centreDeGravite.toString()+"]\n" +
                "\t\t[ longueur : "+longeur+" largeur : "+largeur+"]\n" +
                "\t\t[ couleur : "+color.toString()+"]\n" +
                "\t]";

    }
    public Rectangle(){
        super();
        longeur = 0;
        largeur = 0;
    }

    public Rectangle(int x, int y, int longeur, int largeur){
        super(x,y);
        this.longeur = longeur;
        this.largeur = largeur;
    }

    public Rectangle(int x, int y, int longeur, int largeur, int r, int g, int b){
        super(x,y,r,g,b);
        this.longeur = longeur;
        this.largeur = largeur;
    }
}
