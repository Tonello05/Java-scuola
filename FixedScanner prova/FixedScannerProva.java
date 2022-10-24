/**********************************************
 * Autore: Tonello Samuele
 * Oggetto: test per la classe FixedScanner
 **********************************************/


public class FixedScannerProva {

    public static void main(String[] args) {
        
        FixedScanner input = new FixedScanner();
        String nome;
        int eta;


        System.out.println("come ti chiami?: ");
        nome = input.nextString();
        System.out.println("quanti anni hai?: ");
        eta = input.nextInt();

        System.out.println("ciao " + nome + ", hai " + eta + " anni");

    }

}
