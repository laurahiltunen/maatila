
package maatila;

import static java.lang.Math.ceil;
import java.util.Random;


public class Lehma implements Lypsava, Eleleva {
    private String nimi;
    private double maidonMaara;
    private double utareidenTilavuus;
    

    public Lehma() {
        this.nimi = "Heluna";
        this.maidonMaara = 0.0;
        this.utareidenTilavuus = 15 + new Random().nextInt(26);
    }
    
    public Lehma(String nimi){
        this.nimi = nimi;
        this.maidonMaara = 0;
        this.utareidenTilavuus = 15 + new Random().nextInt(26);
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public double getTilavuus() {
        return this.utareidenTilavuus;
    }
    
    public double getMaara() {
        return this.maidonMaara;
    }

    @Override
    public double lypsa() {
        double lypsettyMaito = this.maidonMaara;
        this.maidonMaara = 0;
        return lypsettyMaito;
    }

    @Override
    public void eleleTunti() {
        double maidonMaaraLisaantyy = new Random().nextDouble() + 0.7;
        
        if(this.maidonMaara + maidonMaaraLisaantyy <= this.utareidenTilavuus) {
        this.maidonMaara = this.maidonMaara + maidonMaaraLisaantyy;
        } else {
            this.maidonMaara = this.utareidenTilavuus;
        }
    }
    
    @Override
    public String toString() {
        return this.nimi + " " + ceil(getMaara()) + "/" + getTilavuus();
    }
    
}
