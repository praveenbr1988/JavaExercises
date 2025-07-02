package exercises.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharsInString {

    public static void main(String[] args) {

        String s = "HelloWorld";

        Map<Character,Integer> lettercount = new LinkedHashMap<>();

        for(char c: s.toCharArray()){
            lettercount.put(c,lettercount.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : lettercount.entrySet()){
            System.out.println(entry.getKey() +","+ entry.getValue());
        }

        //Another way of printing the HashMap
        lettercount.forEach((k, v) -> System.out.println(k + " → " + v));

    }

}
