import javax.swing.*;
import java.awt.event.*;

public class TimerApp extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel label;
    private Timer timer;
    private int counter;

    public TimerApp() {
        setTitle("Timer App");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        label = new JLabel("0");
        panel.add(label);
        add(panel, "North");

        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startTimer();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stopTimer();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        add(buttonPanel, "South");

        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText(String.valueOf(counter));
                counter++;
            }
        });
    }

    public void startTimer() {
        timer.start();
    }

    public void stopTimer() {
        timer.stop();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TimerApp app = new TimerApp();
                app.setVisible(true);
            }
        });
    }
}
