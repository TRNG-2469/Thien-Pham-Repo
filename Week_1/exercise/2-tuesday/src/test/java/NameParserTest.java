public class NameParserTest {
    public static void main(String[] args) {
        // Test 1: Null input
        System.out.println("Test 1 - Null input: " + NameParser.getInitials(null));

        // Test 2: Empty string
        System.out.println("Test 2 - Empty string: '" + NameParser.getInitials("") + "'");

        // Test 3: Single name
        System.out.println("Test 3 - Single name: " + NameParser.getInitials("John"));

        // Test 4: Multiple spaces
        System.out.println("Test 4 - Multiple spaces: " + NameParser.getInitials("John   Doe"));

        // Test 5: Normal case
        System.out.println("Test 5 - Normal case: " + NameParser.getInitials("Mary Jane Watson"));

        // Test 6: Leading/trailing spaces
        System.out.println("Test 6 - Leading/trailing spaces: " + NameParser.getInitials("  Alice Bob  "));
    }
}

