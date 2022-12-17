/*
 * Autore: Tonello Samuele
 * Oggetto: classe per rappresentare una data
 */

import java.time.LocalDate;

public class Data {
    
    // --- attributi

    private int anno;
    private int mese;
    private int giorno;

    // --- costruttori

    public Data(int giorno, int mese, int anno){

        this.anno=anno;
        this.mese=mese;
        this.giorno=giorno;

    }

    // --- metodi

    public int getAnno() {
        return anno;
    }
    public int getGiorno() {
        return giorno;
    }
    public int getMese() {
        return mese;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }
    public void setGiorno(int giorno) {
        this.giorno = giorno;
    }
    public void setMese(int mese) {
        this.mese = mese;
    }

    public int tempoPassato(){ //restituisce gli anni passati tra la data e il giorno attuale

        LocalDate currentdate = LocalDate.now();
        int currentMonth = currentdate.getMonthValue();
        int currentYear = currentdate.getYear();
        int anniPassati=0;

        if(currentYear>anno){
            if(currentYear-anno==1&&mese>currentMonth){
                anniPassati=0;
            }else{
                anniPassati=currentYear-anno;
            }
        }

        return anniPassati;

    }

}
