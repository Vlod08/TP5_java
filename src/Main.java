import et3.java.geometrie.*;

public class Main {

    public static void main(String[] args) {
        CollectionForme listeForme = new CollectionForme();
        Cercle cerc1 = new Cercle(1,2,10,50,50,50);
        Rectangle rect1 = new Rectangle(2,1,5,10,235,200,200);
        Carre car1 = new Carre(3,3,20);
        Carre car2 = new Carre(4,3,20);
        listeForme.add(car1);
        listeForme.add(rect1);
        listeForme.add(cerc1);
        listeForme.add(car2);
        System.out.println(listeForme.toString());
        listeForme.translation(2,3);
        System.out.println(listeForme.toString());


    }
}