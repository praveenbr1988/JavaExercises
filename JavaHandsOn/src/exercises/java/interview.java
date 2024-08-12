package exercises.java;

import java.util.ArrayList;
import java.util.List;

public class interview {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("pine");

        String inputString = "applepineapple";
        List<String> result = extractWords(wordList, inputString);

        System.out.println(result);
    }

    public static List<String> extractWords(List<String> wordList, String inputString) {
        List<String> extractedWords = new ArrayList<>();
        for (String word : wordList) {
            if (inputString.contains(word)) {
                extractedWords.add(word);
                inputString = inputString.replaceFirst(word, "");
            }
        }
        return extractedWords;
    }
}

