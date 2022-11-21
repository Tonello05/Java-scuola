/*****************************
 * Autore: Tonello Samuele
 * Oggetto: classe triangolo
 *****************************/

import java.lang.Math;

public class Triangolo {

    // --attributi
    private Punto vertici[];
    private String nome;
 
    // --costruttori
    public Triangolo(Punto vertici[]){
        this.vertici = new Punto[3];
        for (int i = 0; i < vertici.length; i++) {
            this.vertici[i] = vertici[i];
        }
        nome = vertici[0].getNome() + vertici[1].getNome() + vertici[2].getNome();
    } 

    // --metodi

    public double perimetro(){  //calcolo del perimetro

        double perimetro=0;

        for (int i = 0; i < 2; i++) {
            perimetro+=vertici[i].distanza(vertici[i+1]);
        }

        perimetro+=vertici[2].distanza(vertici[0]);

        return perimetro;

    }

    public double areaDaLati(){ //calcolo area dai lata

        double p = perimetro()/2;
        return Math.sqrt(p*(p - vertici[0].distanza(vertici[1])) * (p - vertici[1].distanza(vertici[2])) * (p -vertici[2].distanza(vertici[0])));

    }

    public double[] getLati(){  //restituisce i lati

        double lati[] = new double[3];

        lati[0]=vertici[0].distanza(vertici[1]);
        lati[1]=vertici[1].distanza(vertici[2]);
        lati[2]=vertici[2].distanza(vertici[0]);

        return lati;

    }

    public String toString(){

        return nome + ": A(" + vertici[0].getX() + "," + vertici[0].getY() + ")  B(" + vertici[1].getX() + "," + vertici[1].getY() + ") C(" + vertici[2].getX() + "," + vertici[2].getY() + ")";

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double areaDaVertici(){  //calcolo area dai vertici

        return ((vertici[0].getX()*vertici[1].getY())+(vertici[0].getY()*vertici[2].getX())+(vertici[1].getX()*vertici[2].getY())-(vertici[2].getX()*vertici[1].getY())-(vertici[2].getY()*vertici[0].getX())-(vertici[1].getX()*vertici[0].getY()))/2;        

    }
    
    public double altezza(){    //calcolo dell'altezza

        return (areaDaLati()*2)/vertici[0].distanza(vertici[1]);

    }

    public boolean isRettangolo(){  //controlla se il triangolo è rettangolo

        boolean rettangolo = false;
        double lati[] = new double[3];
        lati = getLati();
        int a=0,b=1,c=2;      //variabili temporanee
        
        if(lati[0]>lati[1]&&lati[0]>lati[2]){c=0; a=1; b=2;}
        if(lati[1]>lati[0]&&lati[1]>lati[2]){c=1; a=0; b=2;}
        if(lati[2]>lati[0]&&lati[2]>lati[1]){c=2; a=0; b=1;}

        if((Math.pow(lati[a], 2))+(Math.pow(lati[b], 2)) == Math.pow(lati[c], 2)){

            rettangolo = true;

        }

        return rettangolo;
    }

    public boolean isEquilatero(){  //controlla se il triangolo è equilatero

        boolean equilatero = false;
        double lati[]= new double[3];
        lati=getLati();

        if(lati[0]==lati[1]&&lati[1]==lati[2]){
            equilatero= true;
        }

        return equilatero;

    }

    public boolean isIsoscele(){    //controlla se il triangolo è isoscele

        boolean isoscele = false;
        double lati[] = new double[3];
        lati = getLati();

        if(lati[0]==lati[1]&&lati[1]!=lati[2]){isoscele=true;}
        if(lati[0]==lati[2]&&lati[2]!=lati[1]){isoscele=true;}
        if(lati[1]==lati[2]&&lati[2]!=lati[0]){isoscele=true;}

        return isoscele;

    }

    public boolean isScaleno(){     //controlla se il triangolo è scaleno

        boolean Scaleno = false;
        double lati[] = new double[3];
        lati = getLati();
        
        if(lati[0]!=lati[1]&&lati[1]!=lati[2]&&lati[0]!=lati[2]){Scaleno=true;}

        return Scaleno;
    }

    

}