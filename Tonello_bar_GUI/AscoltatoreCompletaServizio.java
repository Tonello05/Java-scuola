/*
 * Autore: Tonello Samuele
 * Oggetto: ascoltatore completa ordine
 */

 import java.awt.event.*;

public class AscoltatoreCompletaServizio implements ActionListener{

    MainWindow e;

    public AscoltatoreCompletaServizio(MainWindow e){
        this.e=e;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        e.bar1.completaOrdine();
        
    }
    
}
