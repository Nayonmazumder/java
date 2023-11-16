import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SystemClock extends JFrame {
    private JLabel timeLabel;

    public SystemClock() {
        setTitle("System Clock");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        timeLabel = new JLabel("", JLabel.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(timeLabel);

        // Create a Timer to update the time every second
        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTime();
            }
        });
        timer.start(); // Start the timer

        setVisible(true);
    }

    private void updateTime() {
        // Get the current time and update the label
        String time = new java.util.Date().toString();
        timeLabel.setText(time);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SystemClock());
    }
}
