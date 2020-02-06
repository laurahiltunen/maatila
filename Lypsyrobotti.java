
package maatila;


public class Lypsyrobotti {
    private Maitosailio maitosailio;
    

    public Lypsyrobotti() {
        
    }
    
    public Maitosailio getMaitosailio() {
            return this.maitosailio;  
        
    }
    
    public void setMaitosailio(Maitosailio maitosailio) {
        this.maitosailio = maitosailio;
    }
    
    public void lypsa(Lypsava Lehma) {
        if (!(getMaitosailio() == null)) {
            this.maitosailio.lisaaSailioon(Lehma.lypsa());
        } else {
            System.out.println("Maidot menevät hukkaan!");
        }
        
        
    }
        
    
}
