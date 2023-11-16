import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class SmileyFace extends Applet {
    public void paint(Graphics g) {
        // Set background color
        setBackground(Color.lightGray);

        // Set face color
        g.setColor(Color.yellow);
        g.fillOval(100, 50, 200, 200); // Draw face

        // Draw eyes
        g.setColor(Color.black);
        g.fillOval(155, 100, 10, 20); // Left eye
        g.fillOval(230, 100, 10, 20); // Right eye

        // Draw smile
        g.drawArc(150, 160, 100, 50, 180, 180); // Arc for smile
    }
}
