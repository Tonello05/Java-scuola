public class Ora {
    
    // --- attributi

    private int secondi;
    private int minuti;
    private int ore;

    // --- costruttori

    public Ora(int secondi, int minuti, int ore){

        this.ore=ore;
        this.minuti=minuti;
        this.secondi=secondi;

    }

    // --- get e set vari

    public int getMinuti() {
        return minuti;
    }
    public int getOre() {
        return ore;
    }
    public int getSecondi() {
        return secondi;
    }
    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }
    public void setOre(int ore) {
        this.ore = ore;
    }
    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }

    @Override
    public String toString(){

        return ore + ":" + minuti + ":" + secondi;

    }

}
