/*
 * Autore: Tonello Samuele
 * Oggetto: event Listener
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AscoltatoreNuovoOrdine implements ActionListener{
    
    MainWindow e;
    FrameNuovoOrdine frm1;

    public AscoltatoreNuovoOrdine(MainWindow e){
        this.e=e;
    }

    @Override
    public void actionPerformed(ActionEvent event){

        e.frm_main.setVisible(false);
        frm1 = new FrameNuovoOrdine(e);
    }

}
