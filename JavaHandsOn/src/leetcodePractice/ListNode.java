package leetcodePractice;

public class ListNode {
    int val;          // Value of the node
    ListNode next;    // Reference to the next node

    // Constructor to initialize the node with a value
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    // Constructor to initialize the node with a value and a reference to the next node
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
