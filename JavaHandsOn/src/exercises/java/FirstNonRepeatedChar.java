package exercises.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String s1 = "aabbccddefgh";

        Character result = findFirstNonRepeatedChar(s1);
        if (result != null) {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }

    public static Character findFirstNonRepeatedChar(String str) {
        // Use LinkedHashMap to maintain insertion order
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Convert to char array and populate map
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Iterate through the map entries
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey(); // First non-repeated char
            }
        }

        return null; // No non-repeated char found
    }
}