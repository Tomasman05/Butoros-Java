
package Futtatas;

import butorgyar.Butor;
import butorgyar.Butorlap;


public class NewMain {

    
    public static void main(String[] tomb) {
        Butor loca=new Butor();
        Butorlap a = new Butorlap(35,180,true);
        Butorlap b = new Butorlap(50,190,false);
        Butorlap c = new Butorlap(78,53,false);
        loca.lapHozzaad(a);
        loca.lapHozzaad(b);
        loca.lapHozzaad(c);
        loca.lapHozzaad(a);
        System.out.println("Lóca: "+loca+" Forint.");
    }
    
}
