/*
 * Autore: Tonello Samuele
 * Oggetto: classe che rappresenta un servizio
 */

// TODO: aggiustare i metodi che prendono il tempo


import java.util.Calendar;

public class Servizio {
    
    // --- attributi
    private Data dataErogazione; 
    private Ora oraErogazione;
    private Panino[] paninoServito;
    private Persona cliente;
    private int durataServizio;     //contata in secondi

    // --- costruttori

    public Servizio(Panino[] paninoServito, Persona cliente){

        this.paninoServito=paninoServito;
        this.cliente=cliente;
        oraErogazione = new Ora(Calendar.SECOND, Calendar.MINUTE, Calendar.HOUR_OF_DAY);
        dataErogazione = new Data(Calendar.DAY_OF_MONTH, Calendar.MONTH, Calendar.YEAR);
        durataServizio=-1;

    }

    // --- get e set vari

    public Persona getCliente() {
        return cliente;
    }
    public Data getDataErogazione() {
        return dataErogazione;
    }
    public int getDurataServizio() {
        return durataServizio;
    }
    public Ora getOraErogazione() {
        return oraErogazione;
    }
    public Panino[] getPaninoServito() {
        return paninoServito;
    }
    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }
    public void setDataErogazione(Data dataErogazione) {
        this.dataErogazione = dataErogazione;
    }
    public void setDurataServizio(int durataServizio) {
        this.durataServizio = durataServizio;
    }
    public void setOraErogazione(Ora oraErogazione) {
        this.oraErogazione = oraErogazione;
    }
    public void setPaninoServito(Panino[] paninoServito) {
        this.paninoServito = paninoServito;
    }
    
    // --- metodi

    public void concludiServizio(){     // quando il servizio è terminato inseriscie automaticamente la sua durata

        int tempoTotale=0;

        tempoTotale+=Calendar.SECOND;
        tempoTotale+=Calendar.MINUTE*60;
        tempoTotale+=Calendar.HOUR*3600;
        tempoTotale-=oraErogazione.getSecondi();
        tempoTotale-=oraErogazione.getMinuti()*60;
        tempoTotale-=oraErogazione.getOre()*3600;

        durataServizio = tempoTotale;

    }

}
