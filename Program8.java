import java.util.StringTokenizer;

public class Program8 {
    public static void main(String[] args) {
        String expression = "2 + 3 * 4 - 6 / 2";

        // Remove all whitespace characters from the expression
        expression = expression.replaceAll("\\s", "");

        // Create a StringTokenizer to separate the arithmetic operations
        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/", true);

        int result = 0;
        int num1 = 0;
        int num2 = 0;
        char operator = ' ';

        // Perform the arithmetic operations
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().trim();

            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                operator = token.charAt(0);
            } else {
                int number = Integer.parseInt(token);

                if (operator == ' ') {
                    result = number;
                } else {
                    num1 = result;
                    num2 = number;

                    switch (operator) {
                        case '+':
                            result = num1 + num2;
                            break;
                        case '-':
                            result = num1 - num2;
                            break;
                        case '*':
                            result = num1 * num2;
                            break;
                        case '/':
                            result = num1 / num2;
                            break;
                    }
                }
            }
        }

        System.out.println("Result: " + result);
    }
}