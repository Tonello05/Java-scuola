import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * Tabelle
 */
public class Tabelle {

    JTable tabella;
    JFrame frame;
    JScrollPane sp; //scroll pane
    File file;

    public Tabelle(){

        file = new File("Dati.txt");
        String[] col = {"codice", "nome", "descrizione", "prezzo"};
        frame = new JFrame("tabella");
        tabella = new JTable(getData(), col);
        tabella.setEnabled(false);
        sp = new JScrollPane(tabella);
        frame.add(sp);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        tabella.setGridColor(Color.ORANGE);
        tabella.setBackground(Color.cyan);
        

    }

    public String[][] getData(){
        
        try {
            String[][] dati = new String[100][100];
            FileReader fr =new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            String temp;
            temp = bf.readLine();
            int cont = 0;
            while (temp!=null) {
                    dati[cont] = temp.split(";");
                    temp = bf.readLine();
                    cont++;
            }
            return dati;


        } catch (Exception e) {
            // TMCH
        }
        
        return null;

    }

    public static void main(String[] args) {
        new Tabelle();
    }


}