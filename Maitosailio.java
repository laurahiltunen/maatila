
package maatila;

import static java.lang.Math.ceil;


public class Maitosailio {
    private double tilavuus;
    private double saldo;
    
    public Maitosailio() {
        this.tilavuus = 2000.0; 
        this.saldo = 0.0;
    }
    
    public Maitosailio(double tilavuus) {
        this.tilavuus = tilavuus;
    }
    
    public double getTilavuus() {
        return this.tilavuus;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public double paljonkoTilaaJaljella() {
        return this.tilavuus - this.saldo;
    }
    public void lisaaSailioon(double maara) {
        if (this.saldo + maara <= this.tilavuus) {
           this.saldo = this.saldo + maara; 
        } else {
            this.saldo = this.tilavuus;
        }   
    }
    
    public double otaSailiosta(double maara) {
        if(this.saldo - maara >= 0) {
            this.saldo = this.saldo - maara;
        } else {
            this.saldo = 0;
        }
        return this.saldo;
    }
    
    public String toString() {
        return ceil(this.saldo) + "/" + ceil(this.tilavuus);
    }
    
}
