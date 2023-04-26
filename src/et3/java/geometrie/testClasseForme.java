package et3.java.geometrie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class testClasseForme{
    public static void test() {
        ArrayList<Forme> listeForme = new ArrayList<Forme>();
        Cercle cerc1 = new Cercle(1,2,10,50,50,50);
        Rectangle rect1 = new Rectangle(2,1,5,10,235,200,200);
        Carre car1 = new Carre(3,3,20);
        Carre car2 = new Carre(4,3,20);
        listeForme.add(cerc1);
        listeForme.add(rect1);
        listeForme.add(car1);
        ListIterator<Forme> it1 = listeForme.listIterator();

        while(it1.hasNext())
        {
            Forme f = it1.next();
            System.out.println(f.toString());
        }
        listeForme.remove(car2);

        ListIterator<Forme> it2 = listeForme.listIterator();
        while(it2.hasNext())
        {
            Forme f = it2.next();
            System.out.println(f.toString());
        }

    }

}
