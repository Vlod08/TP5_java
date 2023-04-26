package et3.java.geometrie;

public final class Cercle extends Forme{
    private int rayon;

    @Override
    public String toString()
    {
        return "[ Cercle\n" +
                "\t\t[ centre de gravité : "+centreDeGravite.toString()+"]\n" +
                "\t\t[ rayon : "+rayon+"]\n" +
                "\t\t[ couleur : "+color.toString()+"]\n" +
                "\t]";

    }
    public Cercle(){
        super();
        rayon = 0;

    }

    public Cercle(int x, int y, int rayon){
        super(x,y);
        this.rayon = rayon;

    }

    public Cercle(int x, int y, int rayon, int r, int g, int b){
        super(x,y,r,g,b);
        this.rayon = rayon;
    }
}
