import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChangeApp extends JFrame {
    
    private JLabel[] redLabels;
    private JLabel[] blueLabels;
    private JButton redButton;
    private JButton blueButton;
    
    public ColorChangeApp() {
        // Inizializzazione della finestra
        super("Color Change App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        
        // Creazione dei componenti
        redLabels = new JLabel[3];
        blueLabels = new JLabel[3];
        for (int i = 0; i < 3; i++) {
            redLabels[i] = new JLabel("Red Label " + (i+1));
            redLabels[i].setBackground(Color.WHITE);
            redLabels[i].setOpaque(true);
            blueLabels[i] = new JLabel("Blue Label " + (i+1));
            blueLabels[i].setBackground(Color.WHITE);
            blueLabels[i].setOpaque(true);
        }
        redButton = new JButton("Start Red");
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startRed();
            }
        });
        blueButton = new JButton("Start Blue");
        blueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startBlue();
            }
        });
        
        // Aggiunta dei componenti alla finestra
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        for (int i = 0; i < 3; i++) {
            panel.add(redLabels[i]);
            panel.add(blueLabels[i]);
        }
        panel.add(redButton);
        panel.add(blueButton);
        getContentPane().add(panel);
    }
    
    private void startRed() {
        // Cambio del colore delle JLabel rosse
        for (int i = 0; i < 3; i++) {
            redLabels[i].setBackground(Color.RED);
        }
        // Cambio del colore delle JLabel blu a bianco
        for (int i = 0; i < 3; i++) {
            blueLabels[i].setBackground(Color.WHITE);
        }
    }
    
    private void startBlue() {
        // Cambio del colore delle JLabel blu
        for (int i = 0; i < 3; i++) {
            blueLabels[i].setBackground(Color.BLUE);
        }
        // Cambio del colore delle JLabel rosse a bianco
        for (int i = 0; i < 3; i++) {
            redLabels[i].setBackground(Color.WHITE);
        }
    }
    
    public static void main(String[] args) {
        // Creazione dell'istanza dell'applicazione
        ColorChangeApp app = new ColorChangeApp();
        // Visualizzazione della finestra
        app.setVisible(true);
    }
}
