package Tonello_gui;

import javax.swing.JOptionPane;

public class Hello_gui {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("inserisci il tuo nome");

        int age = Integer.parseInt(JOptionPane.showInputDialog("inserisci la tua eta"));

        JOptionPane.showMessageDialog(null,"ciao " + name + "hai " + age + " anni.");

    }

}
