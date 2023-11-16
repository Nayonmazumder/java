import java.util.StringTokenizer;

public class Program18 {

    public static void main(String[] args) {
        // Get the input string from the user
        System.out.print("Enter the input string: ");
        String inputString = System.console().readLine();

        // Create a StringTokenizer object
        StringTokenizer st = new StringTokenizer(inputString, "\" ");

        // Declare variables to store the data types
        int intVal = 0;
        double doubleVal = 0.0;
        String stringVal = "";

        // Iterate over the tokens
        while (st.hasMoreTokens()) {
            // Get the next token
            String token = st.nextToken();

            // Check the data type of the token
            if (token.matches("[0-9]+")) {
                // The token is an integer
                intVal = Integer.parseInt(token);
            } else if (token.matches("[0-9]+\\.[0-9]+")) {
                // The token is a double
                doubleVal = Double.parseDouble(token);
            } else {
                // The token is a string
                stringVal = token;
            }
        }

        // Print the values of the data types
        System.out.println("The integer value is: " + intVal);
        System.out.println("The double value is: " + doubleVal);
        System.out.println("The string value is: " + stringVal);
    }
}
