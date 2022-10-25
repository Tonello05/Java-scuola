/*
 * Autore: Tonello Samuele
 * Oggetto: main per provare la classe Mate
 */



public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner();  //classe Scanner per l'input
        double[] arr;  //array contenente i numeri
        int i;      //contatore
        int sel=0;    //selettore del menu;

        System.out.println("quanti numeri si vuole inserire?: ");   //input dell'array
        i= input.nextInt();
        arr = new double[i];
        for (int j = 0; j < i; j++) {
            System.out.println("inserire il " + (j+1) + " numero: ");
            arr[j] = input.nextDouble();
        }

        do{
            System.out.println(" 1- visualizzare il numero maggiore");
            System.out.println(" 2- visualizzare il numero minore");
            System.out.println(" 3- visualizzare la media dei numeri");
            System.out.println(" 4- ordinare i numeri");
            System.out.println(" 5- uscire dal programma");

            sel = input.nextInt();
            
            switch (sel) {
                case 1:
                    System.out.println("il numero maggiore e': " + Mate.maxNum(arr));
                    break;
                case 2:
                    System.out.println("il numero minore e': " + Mate.minNum(arr));
                    break;
                case 3: 
                    System.out.println("la media dei numeri e': " + Mate.average(arr));
                    break;

                case 4:
                    Mate.sortArray(arr);
                    for (int j = 0; j < arr.length; j++) {
                        System.out.print(" " + arr[j] + " ");
                    }
                    System.out.println(" ");
                    break;

                default:
                    System.out.println("valore inserito non valido");
                    break;
            }

        }while(sel!=5);
            
            
    }

}
