package et3.java.geometrie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class testClasseForme{
    public static void main(String[] args) {
        ArrayList<Forme> listeForme = new ArrayList<Forme>();
        Cercle cerc1 = new Cercle(1,2,10,50,50,50);
        Rectangle rect1 = new Rectangle(2,1,5,10,235,200,200);
        Carre car1 = new Carre(3,3,20);
        listeForme.add(cerc1);
        listeForme.add(rect1);
        listeForme.add(car1);
        Iterator<Forme> it = new Iterator<Forme>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Forme next() {
                return null;
            }
        }
    }

}
