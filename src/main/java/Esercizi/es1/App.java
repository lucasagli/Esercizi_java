package Esercizi.es1;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
        int a = 5;
        int b = 4;
        int area;
        Rettangolo gesu;
        ArrayList<Rettangolo> list = new ArrayList <Rettangolo>();
        		
        for (int i = 0; i < 20; i++) {
        	 gesu = new Rettangolo(a + i,b + i);
        	 area = gesu.getArea();
        	 list.add(gesu);
        }
        for (Rettangolo r : list) {
        	area = r.getArea();
        	int altezza = r.getAltezza();
        	System.out.println("L'area è " + area );
        	System.out.println(r.toString());
        }
        
        System.out.println(list.toString());
    }

	
}

