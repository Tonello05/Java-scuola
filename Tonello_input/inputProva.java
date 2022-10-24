import java.util.Scanner;

public class inputProva {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("inserire il nome");
        String myString = input.next();
        System.out.println("ciao " + myString);
        System.out.println("inserisci la tua eta': ");
        int numero = input.nextInt();
        System.out.println("hai" + numero + "anni");

        input.close();

    }

}