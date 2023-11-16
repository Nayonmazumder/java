
// Program20.java
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.awt.*;
import javax.swing.*;

public class Program20 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addMouseListener(new MyMouseHandler(frame));
        frame.add(new MyComponent());
        frame.pack();
        frame.setVisible(true);
    }
}

class MyComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.drawArc(100, 100, 200, 200, 0, 360);
        g2d.dispose();
    }
}

class MyMouseHandler implements MouseListener {
    private final JFrame frame;

    public MyMouseHandler(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released at (" + e.getX() + ", " + e.getY() + ")");
    }
}