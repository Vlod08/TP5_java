package et3.java.geometrie;

public final class Cercle extends Forme{
    private int rayon;

    @Override
    public void mettreAJourDesc()
    {
        descption = "[ Cercle\n" +
                "\t\t[ centre de gravité : x ="+centreDeGravite.x+" , y ="+centreDeGravite.y+"]\n" +
                "\t\t[ rayon : "+rayon+"]\n" +
                "\t\t[ couleur : r ="+color.getRed()+" , g ="+color.getGreen()+" , b ="+color.getBlue()+"]\n" +
                "\t]";

    }
    public Cercle(){
        super();
        rayon = 0;
        this.mettreAJourDesc();
    }

    public Cercle(int x, int y, int rayon){
        super(x,y);
        this.rayon = rayon;
        this.mettreAJourDesc();
    }

    public Cercle(int x, int y, int rayon, int r, int g, int b){
        super(x,y,r,g,b);
        this.rayon = rayon;
        this.mettreAJourDesc();
    }
}
