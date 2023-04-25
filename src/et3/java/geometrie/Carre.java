package et3.java.geometrie;

public final class Carre extends Forme{
    private int cote;

    @Override
    public void mettreAJourDesc()
    {
        descption = "[ Carre\n" +
                "\t\t[ centre de gravité : x ="+centreDeGravite.x+" , y ="+centreDeGravite.y+"]\n" +
                "\t\t[ cote : "+cote+"]\n" +
                "\t\t[ couleur : r ="+color.getRed()+" , g ="+color.getGreen()+" , b ="+color.getBlue()+"]\n" +
                "\t]";

    }
    public Carre(){
        super();
        cote = 0;
        this.mettreAJourDesc();
    }

    public Carre(int x, int y, int cote){
        super(x,y);
        this.cote = cote;
        this.mettreAJourDesc();
    }

    public Carre(int x, int y, int cote, int r, int g, int b){
        super(x,y,r,g,b);
        this.cote = cote;
        this.mettreAJourDesc();
    }
}
