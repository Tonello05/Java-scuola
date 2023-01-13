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
        for (int i = 0; i < serbatoi.length; i++) {
            serbatoi[i]=new Serbatoio();
        }
    }

    public boolean creaCollegamento(int serbatoio1,int serbatoio2){     //crea un nuovo collegamento

        if(serbatoio1>=serbatoi.length||serbatoio2>=serbatoi.length){return false;};

        for (int i = 0; i < serbatoi[serbatoio1].getCollegamenti().size()-1; i++) {
        
            if(serbatoi[serbatoio1].getCollegamenti().get(i)==serbatoio2){return false;};

        }

        serbatoi[serbatoio1].getCollegamenti().add(serbatoio2);
        serbatoi[serbatoio2].getCollegamenti().add(serbatoio1);
        vasiComunicanti(serbatoio1);

        return true;

    }

    public boolean eliminaCollegamento(int serbatoio1, int serbatoio2){ //elimina un collegamento esistente

        if(serbatoio1>=serbatoi.length||serbatoio2>=serbatoi.length){return false;};

        for (int i = 0; i < serbatoi[serbatoio1].getCollegamenti().size(); i++) {
        
            if(serbatoi[serbatoio1].getCollegamenti().get(i)==serbatoio2){
            
                serbatoi[serbatoio1].getCollegamenti().remove(i);
                for (int j = 0; j < serbatoi[serbatoio2].getCollegamenti().size(); j++) {
                    if (serbatoi[serbatoio2].getCollegamenti().get(j)==serbatoio1) {
                        serbatoi[serbatoio2].getCollegamenti().remove(j);
                    }
                }
                return true;

            }

        }

        return false;

    }
    
    private void vasiComunicanti(int serbatoio1){    // metodo che applica i vasi comunicanti a tutti i serbatoi
                                                     // collegati tra di loro
        Vector<Integer> rete = new Vector<Integer>();
        double media;

        rete.add(serbatoio1);

        for (int i = 0; i < serbatoi[serbatoio1].getCollegamenti().size(); i++) {
            
            rete.add(serbatoi[serbatoio1].getCollegamenti().get(i));
            rete = vasiComunicanti(serbatoi[serbatoio1].getCollegamenti().get(i), rete);
            
        } 

        media=mediaVettore(rete);
        System.out.println(media);
        for (int i = 0; i < rete.size(); i++) {
            serbatoi[rete.get(i)].setContenuto(media);
        }

    }

    private Vector<Integer> vasiComunicanti(int serbatoio1, Vector<Integer> rete) {
        
        for (int i = 0; i < serbatoi[serbatoio1].getCollegamenti().size(); i++) {
            
            if(!rete.contains(serbatoi[serbatoio1].getCollegamenti().get(i))){
                rete.add(serbatoi[serbatoio1].getCollegamenti().get(i));
                rete = vasiComunicanti(serbatoi[serbatoio1].getCollegamenti().get(i), rete);
            }


        }

        return rete;

    }

    private double mediaVettore(Vector<Integer> rete){  //media di tutti i serbatoi collegati

        double a=0; // accumulatore

        for (int i = 0; i < rete.size(); i++) {
            a=a+serbatoi[rete.get(i)].getContenuto();
        }
        return a/rete.size();

    }

    public void printSerbatoi() {   //stampa il contenuto di tutti i serbatoi
        
        for (int i = 0; i < serbatoi.length; i++) {
            System.out.println("serbatoio " + i + "  contenuto: " + serbatoi[i].getContenuto());
        }

    }

    public void riempiSerbatoio(int serbatoio1, double quantita) {  //riempi un serbatoio 

        serbatoi[serbatoio1].riempiSerbatoio(quantita, capacita);
        vasiComunicanti(serbatoio1);
    }

}
