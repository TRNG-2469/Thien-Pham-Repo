package com.revature.oopdesign;

public class StringProcessor {
    public static String reverse(String input){

        // return empty string if input is null or empty
        if (input == null || input.isEmpty()){
            return "";
        }

        // build the reversed string one character at a time
        String reverseString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseString += input.charAt(i);
        }

        return reverseString;
    }

    public static int countVowels(String input){

        //counter variable to keep track of the number of vowels
        int vowelCount = 0;

        // condition to check if input is null or empty
        if (input == null || input.isEmpty()){
            return 0;
        
        //condition to covert string to lower case and check if it contains vowels
        } else {
            String lowerCaseInput = input.toLowerCase();
            for (int i = 0; i < lowerCaseInput.length(); i++){
                char c = lowerCaseInput.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    vowelCount++;
                }
            }
        }

        return vowelCount;

    }

    public static boolean isPalindrome(String input) {

        // Handle null or empty input
        if (input == null || input.isEmpty()) {
            return false;
        }

        // Ignore spaces and make everything lowercase
        String cleanedInput = input.replace(" ", "").toLowerCase();

        // Compare characters from both ends
        for (int i = 0; i < cleanedInput.length() / 2; i++) {

            if (cleanedInput.charAt(i) != cleanedInput.charAt(cleanedInput.length() - 1 - i)) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Reverse: " + reverse("hello"));
        System.out.println("Vowels: " + countVowels("Java Programming"));
        System.out.println("Palindrome: " + isPalindrome("A man a plan a canal Panama"));
    }
}
