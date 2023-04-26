package et3.java.geometrie;

import java.lang.Object;
import java.awt.Point;
import java.awt.Color;
import java.util.Collection;

public abstract class Forme{
    protected Point centreDeGravite;
    protected Color color;

    @Override
    public String toString() {
        return "[ Forme inconnue\n" +
                "\t\t[ centre de gravité : "+centreDeGravite.toString()+"]\n" +
                "\t\t[ couleur : r ="+color.toString()+"]\n" +
                "\t]";
    }


    public Forme(){
        Point p1 = new Point(1,2);

        centreDeGravite = new Point(0,0);
        color = new Color(0,0,0);
    }
    public Forme(int x, int y){
        this();
        centreDeGravite.x = x;
        centreDeGravite.y = y;
    }

    public Forme(int x, int y, int r, int g, int b){
        this(x,y);
        setColor(r,g,b);
    }

    public Point getCentreDeGravite(){
        return (Point) centreDeGravite.clone();
    }

    public void translation(int x, int y){
        centreDeGravite.x += x;
        centreDeGravite.y += y;
    }

    public Color getColor(){
        return new Color(color.getRed(),color.getGreen(),color.getBlue()); //La classe Color n'implemente pas clonable
    }

    public void setColor(int r, int b, int g){
        color = new Color(r,g,b); //On cree une nouvelle instance de couleur car la classe Color est immutable
    }

}
