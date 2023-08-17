package algo.problems;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {

    public static void main(String[] args) {
        System.out.printf("Input: %s \nOutput: %s", "Just Do It", reverse("Just Do It"));
        System.out.printf("\nInput: %s \nOutput: %s", " Just Do It ", reverse(" Just Do It "));
        System.out.printf("\nInput: %s \nOutput: %s", "Just Do   It", reverse("Just Do   It"));
        System.out.printf("\nInput: %s \nOutput: %s", " ", reverse(" "));

        System.out.printf("Input: %s \nOutput: %s", "Just Do It", reverseUsingSplit("Just Do It"));
        System.out.printf("\nInput: %s \nOutput: %s", " Just Do It ", reverseUsingSplit(" Just Do It "));
        System.out.printf("\nInput: %s \nOutput: %s", "Just Do   It", reverseUsingSplit("Just Do   It"));
        System.out.printf("\nInput: %s \nOutput: %s", " ", reverseUsingSplit(" "));

    }

    public static String reverse(String input) {
        StringBuilder reversedString = new StringBuilder();
        List<String> words = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        for (Character currentChar : input.toCharArray()) {
            if (Character.isWhitespace(currentChar) && (currentWord.length() > 0)) {
                words.add(currentWord.toString());
                currentWord = new StringBuilder();
            } else if (!Character.isWhitespace(currentChar)) {
                currentWord.append(currentChar);
            }
        }

        if (currentWord.length() > 0) {
            words.add(currentWord.toString());
        }
        for (int i = words.size() - 1; i > -1; i--) {
            if (reversedString.length() > 0) {
                reversedString.append(" ");
            }
            reversedString.append(words.get(i));
        }

        return reversedString.toString();
    }

    public static String reverseUsingSplit(String input) {
        StringBuilder reversedString = new StringBuilder();
        List<String> words = List.of(input.split(" "));

        for (int i = words.size() - 1; i > -1; i--) {

            if (words.get(i).isEmpty()) continue;

            if (reversedString.length() > 0) {
                reversedString.append(" ");
            }

            reversedString.append(words.get(i).trim());
        }

        return reversedString.toString();
    }
}
