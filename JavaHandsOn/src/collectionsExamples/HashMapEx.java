package collectionsExamples;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {

    public static void main(String[] args) {

        String gnSentence = "This is a test. This test is simple and it is a test.";
        String[] arr = gnSentence.toLowerCase().split("\\s+");
        HashMap<String,Integer> wordMap = new HashMap<>();

            for(String word : arr){
                word= word.replaceAll("[^a-z0-9]","");
                if (!word.isEmpty())
                    wordMap.put(word,wordMap.getOrDefault(word,0)+1);
        }


         //get,put,remove,replace,containskey, containsvalue, size,clear,isempty, putAll


        //Iterate HashMap using EntrySet
        System.out.println("Iterate HashMap using EntrySet ");
        for(Map.Entry<String,Integer> entry : wordMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() +" : "+entry.getValue());
            }
        }


        //Iterate HashMap using Keyset
        System.out.println("Iterate HashMap using Keyset ");
        for(String s : wordMap.keySet()){
            System.out.println(s + " : "+ wordMap.get(s));
        }

        //Iterate the values only
        System.out.println("Iterate the values only ");
        for(Integer i : wordMap.values()){
            System.out.println(i);
        }

        //Using Iterator
        System.out.println("Using Iterator ");
        Iterator<Map.Entry<String,Integer>> it = wordMap.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


        //Using Java8 Lambda
        System.out.println("Using Java8 Lambda ");
        wordMap.entrySet().forEach(entry ->
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));

        // Using Java8 forEach method of Map
        System.out.println("Using Java8 forEach ");
        wordMap.forEach((key, value) ->
                System.out.println("Key: " + key + ", Value: " + value));

    }


}
