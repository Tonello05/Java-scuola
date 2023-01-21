/*
 * Autore: Tonello Samuele
 * Oggetto: classe ascoltatore per vedere la coda degli ordini
 */

 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;

public class AscoltatoreVediCoda implements ActionListener{

    MainWindow e;

    public AscoltatoreVediCoda(MainWindow e){
        this.e=e;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
        for (int i = 0; i < e.bar1.getServizi().size(); i++) {
            
            e.txtArea.append("\n" + e.bar1.getServizi().get(i).toString());

        }
        
    }
    
}
