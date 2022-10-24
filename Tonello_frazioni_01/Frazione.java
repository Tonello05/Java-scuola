/***********************************
 * Autore: Tonello Samuele
 * Oggetto: classe per una frazione
 **********************************/

public class Frazione {

    //attributi
    private double nominatore;
    private double denominatore;

    //costruttore
    public Frazione(double nominatore, double denominatore){

        this.nominatore=nominatore;
        this.denominatore=denominatore;
    }

    //metodi

    public double getNom(){

        double temp;
        temp=nominatore;

        return temp;
    }

    public double getDen(){

        double temp;
        temp=denominatore;

        return temp;
    }

    public Frazione somma(Frazione frz2){       //somma tra due frazioni

        double mcm;     //minimo comune multiplo dei denominatori
        double tempNom1=nominatore, tempNom2=frz2.nominatore;       //nominatori temporanei


        Frazione frz3 = new Frazione(0,0);  //creazioni oggetto frazione in cui andra il risultato


        //calcoli per ottenere la frazione risultato
        mcm = Mate.MCM(denominatore, frz2.denominatore);    //calcolo minimo comune multiplo

        tempNom1 = tempNom1 * (mcm/denominatore);
        tempNom2 = tempNom2 * (mcm/frz2.denominatore);

        frz3.nominatore = tempNom1 + tempNom2;
        frz3.denominatore = mcm;

        return  frz3;

    }

    public Frazione sottrazione(Frazione frz2){       //sottrazione tra due frazioni

        double mcm;     //minimo comune multiplo dei denominatori
        double tempNom1=nominatore, tempNom2=frz2.nominatore;       //nominatori temporanei


        Frazione frz3 = new Frazione(0,0);  //creazioni oggetto frazione in cui andra il risultato


        //calcoli per ottenere la frazione risultato
        mcm = Mate.MCM(denominatore, frz2.denominatore);    //calcolo minimo comune multiplo

        tempNom1 = tempNom1 * (mcm/denominatore);
        tempNom2 = tempNom2 * (mcm/frz2.denominatore);

        frz3.nominatore = tempNom1 - tempNom2;
        frz3.denominatore = mcm;

        return  frz3;

    }

    public Frazione moltiplicazione(Frazione frz2) {    //moltiplicazione tra due frazioni
        
        Frazione frz3 = new Frazione(0, 0); //creazionie frazione risultato

        //calcolo frazione risultato
        frz3.nominatore = nominatore * frz2.nominatore;
        frz3.denominatore = denominatore * frz2.denominatore;

        return frz3;
    }

    public Frazione divisione(Frazione frz2) {          //divisione tra due frazione
        
        Frazione frz3 = new Frazione(0, 0); //creazione frazione risultato
        
        //calcolo frazione  
        frz3.nominatore = nominatore * frz2.denominatore;
        frz3.denominatore = denominatore * frz2.nominatore;

        return frz3;
    }

    public Double risultato(){      //calcolo risultato divisione

        Double quoziente;

        quoziente = nominatore/denominatore;

        return quoziente;

    }

}
