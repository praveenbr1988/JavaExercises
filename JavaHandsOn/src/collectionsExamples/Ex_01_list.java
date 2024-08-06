package collectionsExamples;

import java.util.*;

public class Ex_01_list {

    public static void main(String[] args) {

        listExampleMethod();
    }

    static void listExampleMethod() {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // Add elements to the end of the list
        arrayList.add("A");
        arrayList.add("B");
        linkedList.add("A");
        linkedList.add("B");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // Add elements at a specific index
        arrayList.add(1, "C");
        linkedList.add(1, "C");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);


        // Add a collection of elements to the end of the list
        List<String> moreElements = List.of("D", "E");
        arrayList.addAll(moreElements);
        linkedList.addAll(moreElements);
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // Add a collection of elements at a specific index
        arrayList.addAll(2, moreElements);
        linkedList.addAll(2, moreElements);
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);


        // Remove element at a specific index
        arrayList.remove(2);
        linkedList.remove(2);
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

// Remove a specific element (first occurrence)
        arrayList.remove("A");
        linkedList.remove("A");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

// Remove a collection of elements
        List<String> toRemove = List.of("B", "D");
        arrayList.removeAll(toRemove);
        linkedList.removeAll(toRemove);
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

// Get element at a specific index
        String elementFromArrayList = arrayList.get(1);
        String elementFromLinkedList = linkedList.get(1);
        System.out.println("elementFromArrayList: " + elementFromArrayList);
        System.out.println("elementFromLinkedList: " + elementFromLinkedList);


// Set element at a specific index
        arrayList.set(1, "F");
        linkedList.set(1, "F");
        System.out.println("elementFromArrayList: " + elementFromArrayList);
        System.out.println("elementFromLinkedList: " + elementFromLinkedList);

        // Get the size of the list
        int sizeOfArrayList = arrayList.size();
        int sizeOfLinkedList = linkedList.size();
        System.out.println("sizeOfArrayList: " + sizeOfArrayList);
        System.out.println("sizeOfLinkedList: " + sizeOfLinkedList);


        // Using a for-each loop
        for (String element : arrayList) {
            System.out.println(element);
        }

        for (String element : linkedList) {
            System.out.println(element);
        }

// Using an iterator
        Iterator<String> arrayListIterator1 = arrayList.iterator();
        while (arrayListIterator1.hasNext()) {
            System.out.println(arrayListIterator1.next());
        }

        Iterator<String> linkedListIterator1 = linkedList.iterator();
        while (linkedListIterator1.hasNext()) {
            System.out.println(linkedListIterator1.next());
        }

        // Using Listiterator
        ListIterator<String> arrayListIterator2 = arrayList.listIterator();
        while (arrayListIterator2.hasNext()) {
            System.out.println(arrayListIterator1.next());
        }


        // Checking if the list contains a specific element
        boolean containsInArrayList = arrayList.contains("F");
        boolean containsInLinkedList = linkedList.contains("F");
        System.out.println("containsInArrayList: " + containsInArrayList);
        System.out.println("containsInLinkedList: " + containsInLinkedList);

// Getting a sublist
        List<String> sublistFromArrayList = arrayList.subList(0, 2);
        List<String> sublistFromLinkedList = linkedList.subList(0, 2);
        System.out.println("sublistFromArrayList: " + sublistFromArrayList);
        System.out.println("sublistFromLinkedList: " + sublistFromLinkedList);

// Clearing the list
        arrayList.clear();
        linkedList.clear();
        System.out.println("arrayList: " + arrayList);
        System.out.println("linkedList: " + linkedList);

    }
}
