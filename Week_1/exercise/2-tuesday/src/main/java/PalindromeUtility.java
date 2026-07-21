/**
 * Utility class providing palindrome-related methods.
 */
public class PalindromeUtility {

    /**
     * Determine whether the provided string is a palindrome.
     *
     * <p>Rules:
     * - {@code null} input returns {@code false}.
     * - Comparison ignores capitalization.
     * - All non-alphanumeric characters are ignored (spaces, punctuation, etc.).
     * - An empty string (or a string that becomes empty after removing
     *   non-alphanumeric characters) is considered a palindrome and returns
     *   {@code true}.
     *
     * Implementation uses a simple two-pointer algorithm (no Java Streams)
     * and runs in O(n) time with O(1) extra space.
     *
     * @param s the input string to test
     * @return {@code true} if {@code s} is a palindrome under the rules above;
     *         {@code false} if {@code s} is {@code null} or not a palindrome
     */
    public static boolean isPalindrome(String s) {
        // Explicitly handle null per specification.
        if (s == null) {
            return false;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char cl = s.charAt(left);
            // Skip non-alphanumeric characters from the left.
            if (!Character.isLetterOrDigit(cl)) {
                left++;
                continue;
            }

            char cr = s.charAt(right);
            // Skip non-alphanumeric characters from the right.
            if (!Character.isLetterOrDigit(cr)) {
                right--;
                continue;
            }

            // Case-insensitive comparison of the current characters.
            if (Character.toLowerCase(cl) != Character.toLowerCase(cr)) {
                return false;
            }

            left++;
            right--;
        }

        // All characters matched (or string is empty after filtering).
        return true;
    }

    /**
     * Simple manual test harness for the {@link #isPalindrome(String)} method.
     * Prints input, result, and expected outcome for quick verification.
     */
    public static void main(String[] args) {
        System.out.println("isPalindrome(null) -> " + isPalindrome(null) + "  (expected: false)");
        System.out.println("isPalindrome(\"\") -> " + isPalindrome("") + "  (expected: true)");
        System.out.println("isPalindrome(\"a\") -> " + isPalindrome("a") + "  (expected: true)");
        System.out.println("isPalindrome(\"racecar\") -> " + isPalindrome("racecar") + "  (expected: true)");
        System.out.println("isPalindrome(\"RaceCar\") -> " + isPalindrome("RaceCar") + "  (expected: true)");
        System.out.println("isPalindrome(\"A man, a plan, a canal: Panama\") -> " + isPalindrome("A man, a plan, a canal: Panama") + "  (expected: true)");
        System.out.println("isPalindrome(\"No lemon, no melon\") -> " + isPalindrome("No lemon, no melon") + "  (expected: true)");
        System.out.println("isPalindrome(\"Hello, world!\") -> " + isPalindrome("Hello, world!") + "  (expected: false)");
        System.out.println("isPalindrome(\"12321\") -> " + isPalindrome("12321") + "  (expected: true)");
        System.out.println("isPalindrome(\"12 3 21\") -> " + isPalindrome("12 3 21") + "  (expected: true)");
    }

}
