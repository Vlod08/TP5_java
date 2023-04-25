package et3.java.geometrie;

public final class Rectangle extends Forme{
    private int longeur;
    private int largeur;

    @Override
    public void mettreAJourDesc()
    {
        descption = "[ Carre\n" +
                "\t\t[ centre de gravité : x ="+centreDeGravite.x+" , y ="+centreDeGravite.y+"]\n" +
                "\t\t[ longeur : "+longeur+" largeur : "+largeur+"]\n" +
                "\t\t[ couleur : r ="+color.getRed()+" , g ="+color.getGreen()+" , b ="+color.getBlue()+"]\n" +
                "\t]";

    }
    public Rectangle(){
        super();
        longeur =0;
        largeur = 0;
        this.mettreAJourDesc();
    }

    public Rectangle(int x, int y, int longeur, int largeur){
        super(x,y);
        this.longeur = longeur;
        this.largeur = largeur;
        this.mettreAJourDesc();
    }

    public Rectangle(int x, int y, int longeur, int largeur, int r, int g, int b){
        super(x,y,r,g,b);
        this.longeur = longeur;
        this.largeur = largeur;
        this.mettreAJourDesc();
    }
}
