/*
Autore : Tonello Samuele
Oggetto: prova classe Triangolo
 */

public class MainTriangolo {

    public static void main(String[] args) {

        Triangolo triangolo1;
        Punto vertici[];
        vertici = new Punto[3];
        Scanner input = new Scanner();
        double x, y;

        for (int i = 0; i < 3 ; i++) {  //input dei vertici
            
            System.out.println("inserisci il " + (i+1) + "punto:");

            System.out.println("x: ");
            x = input.nextDouble();
            System.out.println("y: ");
            y = input.nextDouble();
            vertici[i]= new Punto(x, y, "");

        }

        triangolo1 = new Triangolo(vertici);


        System.out.println(triangolo1.toString());
        System.out.println("Area (dai lati):" + triangolo1.areaDaLati());
        System.out.println("Area (dai vertici):" +triangolo1.areaDaVertici());
        System.out.println("Perimetro: " + triangolo1.perimetro());
        System.out.println("altezza: " + triangolo1.altezza());
        if (triangolo1.isRettangolo()) {
            System.out.println("questo triangolo è un rettangolo");
        }
        if (triangolo1.isEquilatero()) {
            System.out.println("questo triangolo è euilatero");
        }
        if (triangolo1.isIsoscele()) {
            System.out.println("questo triangolo è isoscele");
        }
        if (triangolo1.isScaleno()) {
            System.out.println("questo triangolo è scaleno");
        }



    }



}