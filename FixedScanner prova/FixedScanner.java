/****************************
 * Autore: Tonello Samuele
 * Oggetto: classe che permette l'utilizzo del buffered reader in maniera semplice
 ****************************/

//import
import java.io.*;
import java.lang.NumberFormatException;
import java.io.IOException;

class FixedScanner {

    // --- ARGOMENTI
    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader  input = new BufferedReader(reader);

    // --- METODI
    public String nextString() {    //input stringa
        
        String temp=null;

        try {
            
            temp= input.readLine();

        } catch (Exception e) {
            System.out.println("errore nell'input della stringa");
        }

        return temp;

    }

    public int nextInt() {          //input int
        
        int temp=0;
        String temp2=null;



        try {
            
            temp2 = input.readLine();
            temp = Integer.parseInt(temp2);

        } catch (IOException e) {
            System.out.println("errore nell'input dell'intero");
        } catch (NumberFormatException e){
            System.out.println("il valore inserito non è di tipo numerico");
        }



        return temp;
    }

    public double nextDouble() {    //input double
        
        double temp=0;
        String temp2=null;

        try {
            
            temp2 = input.readLine();
            temp = Double.parseDouble(temp2);

        } catch (IOException e) {
            System.out.println("errore nell'input del double");
        } catch (NumberFormatException e){
            System.out.println("il valore inserito non è di tipo numerico");
        }


        return temp;
    }

    public short nextShort() {
        
        short temp=0;
        String temp2=null;

        try {
            
            temp2 = input.readLine();
            temp = Short.parseShort(temp2);

        } catch (IOException e) {
            System.out.println("errore nell'input dello short");
        } catch (NumberFormatException e){
            System.out.println("il valore inserito non è di tipo numerico");
        }


        return temp;
    }

}