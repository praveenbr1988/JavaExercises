package collectionsExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Iterator
//Usage: Used to iterate over collections like List, Set, and Map.
//Traversal: Can only traverse the collection in the forward direction.
//        Capabilities:
//boolean hasNext(): Returns true if the iteration has more elements.
//        E next(): Returns the next element in the iteration.
//void remove(): Removes the last element returned by the iterator (optional operation).


public class Ex_02_IteratorEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String element = iterator.next();
//            System.out.println(element);
//            if ("B".equals(element)) {
//                iterator.remove(); // Removes "B" from the list
//            }
//        }

        iterator.forEachRemaining(obj->{
            System.out.println(obj);
        });

        System.out.println(list); // Output: [A, C]

        //Using Streams
        // Iterate and print elements
        list.forEach(obj->{
            System.out.println(obj);
        });




    }
}

