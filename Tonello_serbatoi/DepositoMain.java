/*
 * Autore: tonello Samuele
 * Oggetto: main di prova per la classe deposito
 */


public class DepositoMain {
    
    public static void main(String[] args) {
        
        Deposito deposito1 = new Deposito(100, 10);

        deposito1.creaCollegamento(0, 1);
        deposito1.creaCollegamento(1, 2);
        deposito1.creaCollegamento(1, 5);
        deposito1.creaCollegamento(5, 8);
        deposito1.creaCollegamento(8, 4);
        deposito1.riempiSerbatoio(0, 75);
        deposito1.printSerbatoi();
    }

}
