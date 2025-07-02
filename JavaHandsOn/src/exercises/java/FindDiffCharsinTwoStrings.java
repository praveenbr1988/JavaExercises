package exercises.java;

import java.util.HashSet;
import java.util.Set;

public class FindDiffCharsinTwoStrings {

    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "pineapple";

        // Find different characters
        Set<Character> differentCharacters = findDifferentCharacters(str1, str2);

        // Print result
        System.out.println("Different characters: " + differentCharacters);
    }


    public static Set<Character> findDifferentCharacters(String str1, String str2) {
        Set<Character> uniqueCharacters = new HashSet<>();

        // Process first string
        for (char c : str1.toCharArray()) {
            if (!uniqueCharacters.add(c)) {
                uniqueCharacters.remove(c);
            }
        }

        // Process second string
        for (char c : str2.toCharArray()) {
            if (!uniqueCharacters.add(c)) {
                uniqueCharacters.remove(c);
            }
        }

        return uniqueCharacters;
    }

}
