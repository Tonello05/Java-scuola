import java.util.Scanner;

public class cicloJava {

    public static void main(String[] args){

        //variabili
        int risPotenza;     //risultato potenza
        Scanner input = new Scanner(System.in);
        int num=0;
        int potenza=0;


        try {
            //input
            System.out.println("inserire numero: ");
            num = input.nextInt();
            System.out.println("inserire esponenete: ");
            potenza = input.nextInt();
        } catch (Exception e) {
            System.out.println("errore nell'input");
        }
        finally{
            input.close();
        }
            

        //algoritmo

        risPotenza = num;

        for (int i=1;i<potenza;i++){

            risPotenza = risPotenza * num;

        }
        
        //output
        System.out.println(num + " alla " + potenza + " = " + risPotenza);

    }
}
