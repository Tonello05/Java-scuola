public class Main {
    
    public static void main(String[] args) {
        
        Bar bar1 = new Bar("Bar Lume");
        int sel=0;
        Scanner input = new Scanner();

        do {
            
            System.out.println("|--- " + bar1.getNome() + " ---|");
            System.out.println("1- nuovo ordine");
            System.out.println("2- ordine completato ");
            System.out.println("3- visualizza coda");
            System.out.println("7- chiudi");
            sel = input.nextInt();

            switch (sel) {
                case 1:
                    bar1.nuovoOrdine();
                    break;
                case 2:
                    bar1.completaOrdine();
                    break;
                case 3:
                    bar1.stampaCoda();
                    break;

                default:
                    break;
            }

        } while (sel!=7);

    }

}

//TODO correggere bug