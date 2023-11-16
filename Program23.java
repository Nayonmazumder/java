public class Program23 {
    public static void main(String[] args) {
        try {
            // Some code that might throw exceptions
            int[] numbers = {1, 2, 3};
            int index = 4; // Trying to access an index that doesn't exist
            int result = numbers[index]; // This line might throw an ArrayIndexOutOfBoundsException

            // This line might throw an ArithmeticException
            int divisionResult = 10 / 0; // Trying to divide by zero
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block for handling ArrayIndexOutOfBoundsException
            System.out.println("Array index is out of bounds: " + e.getMessage());
        } catch (ArithmeticException e) {
            // Catch block for handling ArithmeticException
            System.out.println("Cannot divide by zero: " + e.getMessage());
        } catch (Exception e) {
            // Catch block for handling any other exceptions that might occur
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Optional finally block that always executes, regardless of whether an exception occurred
            System.out.println("This block always executes, whether an exception occurred or not.");
        }
    }
}
