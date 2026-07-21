public class MathUtils {

    // 1. Factorial Calculator
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    // 2. Prime Number Validator
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // 3. Temperature Converter
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    // 4. Maximum Value Searcher for int arrays
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Warning: Integer array is null or empty.");
            return 0;
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    // 5. Overloaded Maximum Value Searcher for double arrays
    public static double findMax(double[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Warning: Double array is null or empty.");
            return 0.0;
        }

        double max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    // Runner code
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + MathUtils.factorial(5));
        System.out.println("Factorial of 1: " + MathUtils.factorial(1));

        System.out.println("Is 17 prime? " + MathUtils.isPrime(17));
        System.out.println("Is 20 prime? " + MathUtils.isPrime(20));

        System.out.println(
                "25 Celsius in Fahrenheit: "
                        + MathUtils.celsiusToFahrenheit(25)
        );

        int[] integerNumbers = {4, 12, 7, 25, 3};
        System.out.println(
                "Largest integer: "
                        + MathUtils.findMax(integerNumbers)
        );

        double[] decimalNumbers = {4.5, 12.7, 3.14, 25.9, 8.2};
        System.out.println(
                "Largest double: "
                        + MathUtils.findMax(decimalNumbers)
        );
    }
}