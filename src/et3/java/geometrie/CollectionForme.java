package et3.java.geometrie;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionForme extends ArrayList<Forme> {

    public void translation(int x, int y){
        for(Forme f: this){
            f.translation(x,y);
        }
    }

    @Override
    public String toString() {
        int i = 1;
        String str = "nombre de formes : "+this.size()+"\n";
        for(Forme f : this){
            str = str+"Forme "+i+" :\n"+f.toString()+"\n";
            i++;
        }
        return str;
    }
}
