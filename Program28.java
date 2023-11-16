import java.awt.*;

public class Program28 {
    public static void main(String[] args) {
        // Creating a Frame object
        Frame frame = new Frame("My Frame");

        // Setting the size of the frame
        frame.setSize(400, 300);

        // Setting the layout manager (Optional, default is BorderLayout)
        frame.setLayout(new FlowLayout());

        // Adding components (buttons, labels, etc.) to the frame (not added in this example)

        // Making the frame visible
        frame.setVisible(true);
    }
}
