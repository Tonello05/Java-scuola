/*
 * Autore: TonelloSamuele
 * Oggetto: finestra per l'inserimento di un nuovo ordine
 */

import javax.swing.*;
import java.awt.*;

public class FrameNuovoOrdine {
    
    JFrame frm_novoOrdine;
    JTextField txt_nomePanino, txt_prezzoPanino, txt_ingrediente1, txt_ingrediente2, txt_nomeCliente, txt_cognomeCliente;
    JButton btn_fine;
    Container c;
    Servizio servizioErogato;
    MainWindow mainWindow;


    public FrameNuovoOrdine(MainWindow mainWindow){

        this.mainWindow=mainWindow;
        frm_novoOrdine = new JFrame("nuovo Ordine");
        c = frm_novoOrdine.getContentPane();
        txt_cognomeCliente = new JTextField("cognome cliente");
        txt_prezzoPanino = new JTextField("prezzo panino"); 
        txt_ingrediente1 = new JTextField("ingrediente");
        txt_ingrediente2 = new JTextField("ingrediente");
        txt_nomeCliente = new JTextField("nome cliente");
        txt_nomePanino = new JTextField("nome panino");
        btn_fine = new JButton("Fine");

        c.setLayout(new GridLayout(4,2));
        c.add(txt_nomePanino);
        c.add(txt_prezzoPanino);
        c.add(txt_ingrediente1);
        c.add(txt_ingrediente2);
        c.add(txt_nomeCliente);
        c.add(txt_cognomeCliente);
        c.add(btn_fine);



        servizioErogato = null;
        btn_fine.addActionListener(new AscoltatoreFineOrdine(this, mainWindow));

        frm_novoOrdine.setSize(500,500);
        frm_novoOrdine.setVisible(true);
 
    }

    public void FineOrdine(){

        

    }

}
