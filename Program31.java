import java.awt.*;
import java.awt.event.*;

public class ColorButtons extends Frame implements ActionListener {
    Button redButton, greenButton, blueButton;

    public ColorButtons() {
        setTitle("Color Buttons");
        setSize(300, 200);
        setLayout(new FlowLayout());

        redButton = new Button("Red");
        greenButton = new Button("Green");
        blueButton = new Button("Blue");

        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);

        add(redButton);
        add(greenButton);
        add(blueButton);

        setVisible(true);

        // Closing the frame when window is closed
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String buttonLabel = e.getActionCommand();
        Color bgColor = null;

        // Setting the background color based on the clicked button
        switch (buttonLabel) {
            case "Red":
                bgColor = Color.RED;
                break;
            case "Green":
                bgColor = Color.GREEN;
                break;
            case "Blue":
                bgColor = Color.BLUE;
                break;
        }

        if (bgColor != null) {
            setBackground(bgColor);
            repaint(); // Refreshing the frame to reflect the color change
        }
    }

    public static void main(String[] args) {
        new ColorButtons();
    }
}
