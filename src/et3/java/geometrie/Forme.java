package et3.java.geometrie;

import java.lang.Object;
import java.awt.Point;
import java.awt.Color;
import java.util.Collection;

public abstract class Forme{
    protected Point centreDeGravite;
    protected Color color;
    protected String descption;

    public Forme(){
        centreDeGravite = new Point(0,0);
        color = new Color(0,0,0);
        descption = "[ Forme inconnue\n" +
                "\t\t[ centre de gravité : x =0 , y =0]\n" +
                "\t\t[ couleur : r =0 , g =0 , b =0]\n" +
                "\t]";
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

    public String getDescption(){
        return descption;
    }

    public void mettreAJourDesc(){
        descption = "[ Forme inconnue\n" +
                "\t\t[ centre de gravité : x ="+centreDeGravite.x+" , y ="+centreDeGravite.y+"]\n" +
                "\t\t[ couleur : r ="+color.getRed()+" , g ="+color.getGreen()+" , b ="+color.getBlue()+"]\n" +
                "\t]";
    }



}
