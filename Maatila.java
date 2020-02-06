
package maatila;

import java.util.ArrayList;


public class Maatila implements Eleleva{
    private String omistaja;
    private Navetta navetta;
    private ArrayList<Lehma> lehmat;
    
    
    public Maatila(String omistaja, Navetta navetta) {
        this.omistaja = omistaja;
        this.navetta = navetta;
        this.lehmat = new ArrayList<>();
    }
    
    public String getOmistaja() {
        return this.omistaja;
    }
    
    public void lisaaLehma(Lehma lehma) {
        this.lehmat.add(lehma);
    }
    
    public int onkoLehmia() {
        int lehmienMaara = 0;
        
        for (Lehma lehma: lehmat) {
            
            lehmienMaara++;
        }
        return lehmienMaara;
    }
    
    public String lehmaLista() {
        String lehmalista = "";
        
        for(Lehma lehma: lehmat) {
            lehmalista = lehmalista + "    " + lehma.toString() +  "\n";
        }
        return lehmalista;
    }
    
    public void asennaNavettaanLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        this.navetta.asennaLypsyrobotti(lypsyrobotti);
    }
    
    public void hoidaLehmat() {
        this.navetta.hoida(this.lehmat);
    }
    
    @Override
    public void eleleTunti() {
        for (Lehma lehma: lehmat) {
            lehma.eleleTunti();
        }
        
    }
    
    public String toString() {
        String litania = "Maatilan omistaja: " + getOmistaja() + "\nNavetan maitosäiliö:" + this.navetta.getMaitosailio();
        
        if (onkoLehmia() == 0) {
            return litania + "\nEi lehmiä."; 
        }
        
        return litania + "\nLehmat:" + "\n" + lehmaLista();
        
    }
}
