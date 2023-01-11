import java.util.Vector;

/**
 * Serbatoio
 */
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
    public void setContenuto(float contenuto) {
        this.contenuto = contenuto;
    }
    public Vector<Integer> getCollegamenti() {
        return collegamenti;
    }
    public void setCollegamenti(Vector<Integer> collegamenti) {
        this.collegamenti = collegamenti;
    }
}