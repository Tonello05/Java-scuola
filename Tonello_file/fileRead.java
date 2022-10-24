package Tonello_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileRead {

    public static void main(String[] args) {

        try {

            File myfile = new File("fileTesto.txt");
            Scanner myReader = new Scanner(myfile);

            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch (FileNotFoundException e){
            System.out.println("c'e' stato un errore!!");
        }


    }

}
