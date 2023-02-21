
package butorgyar;

public class Butorlap {
    private double hossz;
    private double szeles;
    private boolean tartolapE;
    private final int tartolapAr=5000;
    private final int hatlapAr=500;

    public Butorlap(double hosszusag, double szelesseg, boolean tartolapE) {
        this.hossz = hosszusag/100;
        this.szeles = szelesseg/100;
        this.tartolapE = tartolapE;
    }
    public double arSzamol(){
    return hossz*szeles*(tartolapE?tartolapAr:hatlapAr);
    }
    
}
