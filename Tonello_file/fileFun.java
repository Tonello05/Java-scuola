package Tonello_file;

import java.io.FileWriter;
import java.io.IOException;

public class fileFun {
   
    public static void main(String[] args) {

        try {
            FileWriter myFile = new FileWriter("./Tonello_file/fileTesto.txt");
            myFile.write("scrivere sui file è facile");
            myFile.close();
            System.out.println("scritto con successo nel file");
        } catch (IOException e) {
            System.out.println("an error occured");
        }

    }


}
