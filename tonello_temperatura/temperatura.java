import java.util.Scanner;

public class temperatura {

    public static void main(String[] Strings) {

        //variabili
        Scanner input = new Scanner(System.in);

        //input
        System.out.print("inserire una temperatura (fahrenheit): ");
        double fahrenheit = input.nextDouble();
        input.close();

        //calcolo
        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);

        //output
        System.out.println(fahrenheit + " temperatura in celsius: " + celsius );
    }
}
