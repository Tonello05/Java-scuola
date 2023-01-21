/*
 * Autore: Tonello Samuele
 * Oggetto: classe che rappresenta un servizio
 */
import java.text.SimpleDateFormat;
import java.util.Random;

public class Servizio{
    
    // --- attributi
    private String dataOraErogazione; 
    private Panino[] paninoServito;
    private Persona cliente;
    private int durataServizio;     //contata in secondi

    // --- costruttori

    public Servizio(Panino[] paninoServito, Persona cliente){

        this.paninoServito=paninoServito;
        this.cliente=cliente;
        dataOraErogazione = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        durataServizio=-1;

    }

    // --- get e set vari

    public Persona getCliente() {
        return cliente;
    }
    public String getDataOraErogazione() {
        return dataOraErogazione;
    }
    public int getDurataServizio() {
        return durataServizio;
    }

    public Panino[] getPaninoServito() {
        return paninoServito;
    }
    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }
    public void setDataOraErogazione(String dataOraErogazione) {
        this.dataOraErogazione = dataOraErogazione;
    }
    public void setDurataServizio(int durataServizio) {
        this.durataServizio = durataServizio;
    }

    public void setPaninoServito(Panino[] paninoServito) {
        this.paninoServito = paninoServito;
    }
    
    // --- metodi

    public void concludiServizio(){     // quando il servizio è terminato inseriscie automaticamente la sua durata

        Random rnd = new Random();
 
        durataServizio = rnd.nextInt(3600);

    }
    public String toString(){
        return cliente.getNome() + " " + cliente.getCognome() + "; panini ordinati: " + paninoServito.length;

    }

}
