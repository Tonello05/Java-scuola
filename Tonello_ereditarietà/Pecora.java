/*
 * Autore: Tonello Samuele
 * Oggetto: classe pecora figlia di Animale
 */

public class Pecora extends Animale {
    
    // --- attributi

    private float kgLana;   //lana che la pecora ha indosso
    private final float lanaGiornaliera = (float) 0.08;

    // --- costruttori

    public Pecora(String nome, Data dataNascita, String nomeProprietario, String cognomeProprietario, float kgLana){

        super(nome, dataNascita, nomeProprietario, cognomeProprietario);
        this.kgLana=kgLana;

    }

    // --- metodi

    public float getKgLana() {
        return kgLana;
    }
    public void setKgLana(float kgLana) {
        this.kgLana = kgLana;
    }

    public float tosa(){
        float lanaTosata;
        lanaTosata=kgLana;
        kgLana=0;
        return lanaTosata;
    }

    public void crescitaLana(int giorniPassati){  //aumenta la lana in base ai giorni passati
        kgLana=kgLana+(lanaGiornaliera*giorniPassati);
    }

}
