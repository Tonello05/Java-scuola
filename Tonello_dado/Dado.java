/*
 * Autore: Tonello Samuele
 * Oggetto: classe che rappresenta un dado
 */



public class Dado{

    // --attributi
    private int nFacce;    //numero di faccie del dado
    private int faccia_attuale;     //faccia superiore del dado
    private String nome="";    //nome del dado

    public Dado(int nFacce){
        this.nFacce = nFacce;
    }

    public Dado(int faccia_attuale, String nome){
        this.faccia_attuale = faccia_attuale;
        this.nFacce = 6;
    }
    
    public int tira() {
        
        faccia_attuale = (int)(1+(Math.random()*nFacce));

        return faccia_attuale;

    }

    public String toString() {
        
        return nome + ":" + faccia_attuale + "(d" + nFacce + ")";

    }

}