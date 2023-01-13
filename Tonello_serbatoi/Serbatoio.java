/*
 * Autore: Tonello Samuele
 * Oggetto: serbatoio
 */

import java.util.Vector;

public class Serbatoio {

    // -- attributi

    private double contenuto;

    Vector<Integer> collegamenti; 


    public Serbatoio(){

        contenuto = 0;

        collegamenti = new Vector<Integer>(1,0);

    }

    public double getContenuto() {
        return contenuto;
    }
    public void setContenuto(double contenuto) {
        this.contenuto = contenuto;
    }
    public Vector<Integer> getCollegamenti() {
        return collegamenti;
    }
    public void setCollegamenti(Vector<Integer> collegamenti) {
        this.collegamenti = collegamenti;
    }

    public void riempiSerbatoio(double quantita, double maxCapacity){

        if(quantita+contenuto<=maxCapacity){
            contenuto+=quantita;
        }else{
            contenuto=maxCapacity;
        }

    }

}