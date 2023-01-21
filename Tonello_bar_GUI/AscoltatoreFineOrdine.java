import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AscoltatoreFineOrdine implements ActionListener{

    FrameNuovoOrdine e;
    MainWindow mainWindow;

    public AscoltatoreFineOrdine(FrameNuovoOrdine e, MainWindow mainWindow){
        this.e=e;
        this.mainWindow=mainWindow;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
        String ingredienti[] = new String[2];
        ingredienti[0]=e.txt_ingrediente1.getText();
        ingredienti[1]=e.txt_ingrediente2.getText();

        Panino panini[] = new Panino[1];
        panini[0] = new Panino(e.txt_nomePanino.getText(), ingredienti, Double.parseDouble(e.txt_prezzoPanino.getText()));
        Persona cliente = new Persona(e.txt_nomeCliente.getText(), e.txt_cognomeCliente.getText());
        e.servizioErogato= new Servizio(panini, cliente);
        mainWindow.bar1.nuovoOrdine(e.servizioErogato);
        e.frm_novoOrdine.setVisible(false);
        mainWindow.frm_main.setVisible(true);

    }
    


}
