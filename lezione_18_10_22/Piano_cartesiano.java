import java.io.*;

public class Piano_cartesiano {
    
    public static void main(String[] args) {
        
        double x=0;  //ascisse
        double y=0;  //ordinate
        String nome="a";    //nomi dei punti
        String temp;
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);

        try{
            //input dati del primo punto
            System.out.println("inserisci l'ascissa del primo punto: ");
            temp = input.readLine();
            x = Integer.parseInt(temp);
            System.out.println("inserisci l'ordinata del primo punto: ");
            temp = input.readLine();
            y = Integer.parseInt(temp);
            System.out.println("inserisci il nome del primo punto: ");
            nome = input.readLine();
        
        }catch(Exception e){    //controllo errore

            System.out.println("errore nell'input");

        }

        Punto a = new Punto(x, y, nome); //creazione e assegnazione dei valori al primo punto

        try{
            //input dati del secondo punto
            System.out.println("inserisci l'ascissa del secondo punto: ");
            temp = input.readLine();
            x = Integer.parseInt(temp);

            System.out.println("inserisci l'ordinata del secondo punto: ");
            temp = input.readLine();
            y = Integer.parseInt(temp);

            System.out.println("inserisci il nome del secondo punto: ");
            nome = input.readLine();

        }catch(Exception e){        //controllo errore

            System.out.println("errore nell'input");

        }

        Punto b = new Punto(x,y,nome);   //creazione e assegnazione dei valori al secondo punto


        //output
        System.out.println("distanza tra i due punti: " + a.distanza(b));

    }


}
