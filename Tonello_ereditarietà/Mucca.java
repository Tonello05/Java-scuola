/*
 * Autore: Tonello Samuele
 * Oggetto: classe mucca figlia di Animale
 */

import java.util.Date;
import java.text.SimpleDateFormat;

public class Mucca extends Animale {
    
    // --- attributi

    private final int latteGiornaliero=28;  //in litri
    String ultimaMungitura;

    // --- costruttori

    public Mucca(String nome, Data dataNascita, String nomeProprietario, String cognomeProprietario, String ultimaMungitura){

        super(nome, dataNascita, nomeProprietario, cognomeProprietario);
        this.ultimaMungitura=ultimaMungitura;
    }

    // --- metodi

    public int mungi(){
        Date date = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        String currentDate = formatter.format(date);
        if(currentDate==ultimaMungitura){
            System.out.println("la mucca è già stata munta oggi");
            return 0;
        }
        ultimaMungitura=currentDate;
        return latteGiornaliero;
             
    }

}
