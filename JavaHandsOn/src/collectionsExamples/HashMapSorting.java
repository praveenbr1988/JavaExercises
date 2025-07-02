package collectionsExamples;


import java.util.*;

public class HashMapSorting {

    public static void main(String[] args) {


        sortByKey();
        sortByValue();;


    }

    public static void sortByKey(){

        // Sample HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Banana", 3);
        map.put("Apple", 2);
        map.put("Orange", 1);

        // Sort by keys
        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);

        // Print sorted map
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }



    public static void sortByValue(){

        // Sample HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Banana", 3);
        map.put("Apple", 2);
        map.put("Orange", 1);

        // Sort by values


        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println("List of MAP values: "+list);
        list.sort(Map.Entry.comparingByValue());

        // Reinsert entries into LinkedHashMap to maintain order
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print sorted map
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


    }

}
