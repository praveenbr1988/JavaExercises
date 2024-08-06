package collectionsExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//ListIterator
//Usage: Specifically used for iterating over List implementations (ArrayList, LinkedList, etc.).
//Traversal: Can traverse the list in both forward and backward directions.
//Capabilities:
//Inherits all methods from Iterator.
//Additional methods:
//boolean hasPrevious(): Returns true if the list iterator has more elements when traversing in the reverse direction.
//E previous(): Returns the previous element in the list.
//int nextIndex(): Returns the index of the element that would be returned by a subsequent call to next().
//int previousIndex(): Returns the index of the element that would be returned by a subsequent call to previous().
//void set(E e): Replaces the last element returned by next() or previous() with the specified element (optional operation).
//void add(E e): Inserts the specified element into the list (optional operation).

public class Ex_03_ListIteratorEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> listIterator = list.listIterator();

        // Forward traversal
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.println(element);
            if ("B".equals(element)) {
                listIterator.set("D"); // Replaces "B" with "D"
            }
        }

        // Backward traversal
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println(element);
            if ("A".equals(element)) {
                listIterator.add("E"); // Adds "E" before "A"
            }
        }

        System.out.println(list); // Output: [E, A, D, C]
    }
}

