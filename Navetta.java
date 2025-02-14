
package maatila;

import static java.lang.Math.ceil;
import java.util.List;


public class Navetta {
    private Lypsyrobotti lypsyrobotti;
    private Maitosailio maitosailio;
    
    
    public Navetta(Maitosailio maitosailio) {
        this.maitosailio = maitosailio;
    }
    
    public Maitosailio getMaitosailio() {
        return this.maitosailio;
    }
    
    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        this.lypsyrobotti = lypsyrobotti;
        this.lypsyrobotti.setMaitosailio(this.maitosailio);
    }
    
    public void hoida(Lehma lehma) {
        if (this.lypsyrobotti.getMaitosailio() == null) {
            throw new IllegalStateException();
        }
        this.lypsyrobotti.lypsa(lehma);
    }
    
    public void hoida(List<Lehma> lehmat) {
        for (Lehma lehma: lehmat) {
            hoida(lehma);
        }
    }
    
    public String toString() {
        return ceil(this.maitosailio.getSaldo()) + "/" + ceil(this.maitosailio.getTilavuus());
    }
        
    
    
    
}
