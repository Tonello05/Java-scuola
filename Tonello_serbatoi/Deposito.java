import java.util.Vector;

/*
 * Autore: tonello samuele
 * Oggetto: deposito di serbatoi
 */

public class Deposito {
    
    // -- attributi

    private Serbatoio serbatoi[];
    private double capacita;

    // -- costruttore

    public Deposito(double capacita , int nSerbatoi){

        this.capacita=capacita;
        serbatoi = new Serbatoio[nSerbatoi];

    }

    public boolean creaCollegamento(int serbatoio1,int serbatoio2){

        if(serbatoio1>=serbatoi.length||serbatoio2>=serbatoi.length){return false;};

        for (int i = 0; i < serbatoi[serbatoio1].getCollegamenti().size(); i++) {
        
            if(serbatoi[serbatoio1].getCollegamenti().get(i)==serbatoio2){return false;};

        }

        serbatoi[serbatoio1].getCollegamenti().add(serbatoio2);
        vasiComunicanti(serbatoio1);

        return true;

    }

    public boolean eliminaCollegamento(int serbatoio1, int serbatoio2){

        if(serbatoio1>=serbatoi.length||serbatoio2>=serbatoi.length){return false;};

        for (int i = 0; i < serbatoi[serbatoio1].getCollegamenti().size(); i++) {
        
            if(serbatoi[serbatoio1].getCollegamenti().get(i)==serbatoio2){r
            
                serbatoi[serbatoio1].getCollegamenti().remove(i);
                return true;

            }

        }

        return false;

    }

    public void vasiComunicanti(int serbatoio1){

        int c=0; //contatore
        double totLiquido=0;

        for (int i = 0; i < serbatoi[serbatoio1].getCollegamenti().size(); i++) {
            
            totLiquido+=serbatoi[serbatoio1].getCollegamenti().get(i);
            c++;
        }

        serbatoi[serbatoio1].setContenuto(c);
        for (int i = 0; i < serbatoi[serbatoio1].getCollegamenti().size(); i++) {
            
            serbatoi[serbatoio1].setContenuto(c);
        }

    }

}
