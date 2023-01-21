/*
 * Autore: tonello Samuele
 * Oggetto: finestra principale
 */

import javax.swing.*;
import java.awt.*;


public class MainWindow {
    

    //OGGETTI
    JFrame frm_main;
    Container c;
    JPanel pnl_centro, pnl_sud;
    JButton btn_nuovoOrdine, btn_completaOrdine, btn_vediCoda, btn_fileSalvati;
    JTextArea txtArea;
    JScrollPane scrollPane;
    BorderLayout layout;
    Bar bar1;

    //COSTANTI

    final Dimension frameDimension = new Dimension(1000,500);
    final Dimension textAreaDimension = new Dimension(600, 300);

    public MainWindow(){

        //Istanzia elementi
        istanziaElementi();

        frm_main.setDefaultCloseOperation(frm_main.EXIT_ON_CLOSE);
        frm_main.setResizable(false);
        frm_main.setTitle("Servizio Bar");
        frm_main.setSize(frameDimension);
        c = frm_main.getContentPane();
        
        pnl_centro.add(scrollPane);
        pnl_sud.add(btn_nuovoOrdine);
        pnl_sud.add(btn_completaOrdine);
        pnl_sud.add(btn_vediCoda);
        pnl_sud.add(btn_fileSalvati);

        c.add(pnl_centro, BorderLayout.CENTER);
        c.add(pnl_sud, BorderLayout.SOUTH);

        btn_nuovoOrdine.addActionListener(new AscoltatoreNuovoOrdine(this));
        btn_vediCoda.addActionListener(new AscoltatoreVediCoda(this));
        btn_completaOrdine.addActionListener(new AscoltatoreCompletaServizio(this));

        frm_main.setVisible(true);

    }



    private void istanziaElementi(){        //metodo per raggruppare tulle le istanziazioni

        bar1 = new Bar("bar 1");
        frm_main = new JFrame();
        pnl_centro = new JPanel();
        pnl_sud = new JPanel(new GridLayout(1,4));
        btn_completaOrdine = new JButton("completa ordine");
        btn_fileSalvati = new JButton("vedi servizi erogati");
        btn_nuovoOrdine = new JButton("nuovo ordine");
        btn_vediCoda = new JButton("vedi coda");
        txtArea = new JTextArea("\\qui apparira la coda degli ordini //");
        txtArea.setColumns(40);
        txtArea.setRows(15);
        scrollPane = new JScrollPane(txtArea);
        layout = new BorderLayout();

    }


}
