
package butorgyar;


public class Butor {
    int lapokSzama;
    Butorlap[] lapok;
    
    public Butor(){
        this.lapokSzama=0;
        lapok=new Butorlap[100];
    }
    public void lapHozzaad(Butorlap lap){
        if (lapokSzama<100) {
            lapok[lapokSzama++]=lap;
        }
    }
    public double arSzamol(){
        double ar=0;
        for (int i = 0; i < this.lapokSzama; i++) {
            ar+=this.lapok[i].arSzamol();
        }
        return ar;
    }

    @Override
    public String toString() {
        return "Butor - lapok: "+lapokSzama+", ar:" + arSzamol();
    }
    
}
