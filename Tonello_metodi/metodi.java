package Tonello_metodi;
import java.util.*;

public class metodi {
 
    public static double media(double a, double b, double c){   //metodo che calcola la media

        double average=0;
        double temp;    

        temp=a+b+c;
        average = temp/3;

        return average;
    }

    public static void main(String[] args) {
        
        //variabili
        Scanner input = new Scanner(System.in);
        double a=0;
        double b=0;
        double c=0;
        double average; //media


        //input
        try {
            System.out.println("inserire il primo numero: ");
            a = input.nextDouble();
            System.out.println("inserire il secondo numero");
            b = input.nextDouble();
            System.out.println("inserire i terzo numero");
            c = input.nextDouble();
        } catch (Exception e) {
            System.out.println("errore nell'input");
        }
        finally{
            input.close();
        }

        average=media(a, b, c); //calcolo media

        System.out.println("la media dei tre numeri e': " + average);   //output media

    }


}