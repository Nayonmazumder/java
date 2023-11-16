import javax.swing.*;
import java.awt.*;

public class Program27 extends JFrame {

    public Program27() {
        setTitle("Drawing Shapes");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Drawing a line
        g.setColor(Color.BLUE);
        g.drawLine(50, 50, 200, 50);

        // Drawing a rectangle
        g.setColor(Color.RED);
        g.drawRect(50, 100, 150, 100);

        // Drawing a filled rectangle
        g.setColor(Color.GREEN);
        g.fillRect(250, 100, 150, 100);

        // Drawing an oval
        g.setColor(Color.MAGENTA);
        g.drawOval(50, 250, 150, 100);

        // Drawing a filled oval
        g.setColor(Color.ORANGE);
        g.fillOval(250, 250, 150, 100);

        // Drawing text
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString("Hello, Shapes!", 150, 350);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Program27();
        });
    }
}
