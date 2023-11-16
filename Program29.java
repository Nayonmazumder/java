import java.awt.*;

public class Program29 {
    public static void main(String[] args) {
        // Creating a Frame object
        Frame frame = new Frame("UI Components on Frame");

        // Creating a Label
        Label label = new Label("Hello, I'm a Label!");

        // Creating a Button
        Button button = new Button("Click Me!");

        // Setting the layout manager (FlowLayout)
        frame.setLayout(new FlowLayout());

        // Adding components to the frame
        frame.add(label);
        frame.add(button);

        // Setting the size of the frame
        frame.setSize(300, 200);

        // Making the frame visible
        frame.setVisible(true);
    }
}
