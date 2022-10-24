public class Frazione_main {
    
    public static void main(String[] args) {
        
        //attributi
        Frazione frz1;
        Frazione frz2;
        double tempNom, tempDen;        //numerotre e denominatore temporanei per l'input
        int sel, sel2;
        Frazione tempfrz = new Frazione(0, 0);  //frazione temporanea pe ri risultati

        FixedScanner input = new FixedScanner();

        //algoritmo

        //input prima frazione
        System.out.println("inserire il nominatore della prima frazione");
        tempNom = input.nextDouble();
        System.out.println("inserire il denominatore della prima frazione");
        tempDen = input.nextDouble();

        frz1 = new Frazione(tempNom, tempDen);

        //input seconda frazione

        System.out.println("inserire il nominatore della seconda frazione");
        tempNom = input.nextDouble();
        System.out.println("inserire il denominatore della seconda frazione");
        tempDen = input.nextDouble();

        frz2 = new Frazione(tempNom, tempDen);


        do {
            
            //menu
            System.out.println(" 1- risultato divisione");
            System.out.println(" 2- somma delle frazioni");
            System.out.println(" 3- sottrazione delle frazioni");
            System.out.println(" 4- moltiplicazione delle frazioni");
            System.out.println(" 5- divisione delle frazioni");
            System.out.println(" 7- uscire dal programma");

            sel = input.nextInt();

            switch (sel) {
                case 1:
                        System.out.println("di quale frazione si vuole visualizzare il risultato? 1/2");
                        sel2 = input.nextInt();
                        switch (sel2) {
                            case 1:
                                System.out.println("risultato: " + frz1.risultato());
                                break;
                            case 2:
                                System.out.println("risultato: " + frz2.risultato());
                                break;

                            default:
                                System.out.println("valore inserito non valido");
                                break;
                        }
                    break;
            
                case 2:
                    tempfrz = frz1.somma(frz2);
                    System.out.println("somma delle frazioni =" + tempfrz.getNom() + "/" + tempfrz.getDen());
                    break;

                case 3:
                        System.out.println("quali frazioni si vuole sottrarre");
                        System.out.println("1 fraz - 2 fraz (1)");
                        System.out.println("2 fraz - 1 fraz (2)");
                        sel2 = input.nextInt();

                        switch (sel2) {
                            case 1:
                                tempfrz = frz1.sottrazione(frz2);
                                System.out.println("sottrazione delle frazioni =" + tempfrz.getNom() + "/" + tempfrz.getDen());
                                break;
                            case 2:
                                tempfrz = frz2.sottrazione(frz1);
                                System.out.println("sottrazione delle frazioni =" + tempfrz.getNom() + "/" + tempfrz.getDen());
                                break;
                            default:
                                System.out.println("valore inselito non valide");
                                break;
                        }

                    break;
                
                case 4:
                        tempfrz = frz1.moltiplicazione(frz2);
                        System.out.println("moltiplicazione delle frazioni =" + tempfrz.getNom() + "/" + tempfrz.getDen());
                    break;

                case 5:
                    System.out.println("quali frazioni si vogliono dividere");
                    System.out.println("frz1 / frz2 (1)");
                    System.out.println("frz2 / frz1 (2)");
                    sel2 = input.nextInt();

                    switch (sel2) {
                        case 1:
                            tempfrz = frz1.divisione(frz2);
                            System.out.println("divisione delle frazioni =" + tempfrz.getNom() + "/" + tempfrz.getDen());
                            break;
                    
                        case 2:
                            tempfrz = frz2.divisione(frz1);
                            System.out.println("divisione delle frazioni =" + tempfrz.getNom() + "/" + tempfrz.getDen());
                            break;
                        default:
                            System.out.println("valore inserito non valido");
                            break;
                    }

                    break;

                default:
                    if(sel!=7){
                        System.out.println("valore inserito non valido");
                    }
                    break;
            }

        } while (sel!=7);
    }

}