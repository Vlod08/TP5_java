package et3.java.geometrie;

public final class Carre extends Forme{
    private int cote;

    @Override
    public String toString()
    {
        return "[ Carre\n" +
                "\t\t[ centre de gravité : "+centreDeGravite.toString()+"]\n" +
                "\t\t[ cote : "+cote+"]\n" +
                "\t\t[ couleur : "+color.toString()+"]\n" +
                "\t]";

    }
    public Carre(){
        super();
        cote = 0;
    }

    public Carre(int x, int y, int cote){
        super(x,y);
        this.cote = cote;
    }

    public Carre(int x, int y, int cote, int r, int g, int b){
        super(x,y,r,g,b);
        this.cote = cote;
    }
}
