class StringOperations {

    private String string;

    public StringOperations(String string) {
        this.string = string;
    }

    public boolean equal(String otherString) {
        return this.string.equals(otherString);
    }

    public String reverse() {
        return new StringBuilder(this.string).reverse().toString();
    }

    public String changeCase(String caseType) {
        switch (caseType) {
            case "upper":
                return this.string.toUpperCase();
            case "lower":
                return this.string.toLowerCase();
            default:
                throw new IllegalArgumentException("Invalid case type: " + caseType);
        }
    }

    public String trim() {
        return this.string.strip();
    }
}

public class Program22 {
    public static void main(String[] args) {
        String str = "This is a test string.";
        StringOperations stringOperations = new StringOperations(str);

        String reversedString = stringOperations.reverse();

        System.out.println(reversedString); // Output: .gnirts tset a si sihT

    }
}