package leetcodePractice;


public class MergeSortedList {


   public static void main(String[] args){

       ListNode l1 = new ListNode(1, new ListNode(3, new ListNode(5)));

       // Creating second sorted list: 2 -> 4 -> 6
       ListNode l2 = new ListNode(2, new ListNode(4, new ListNode(6)));


       System.out.println("Merged list:");
       printList(mergeTwoLists(l1,l2));

   }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode tail = head;

        while (l1 != null || l2 != null) {
            if (l2 == null || (l1 != null && l1.val < l2.val)) {
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            }
        }

        return head.next;
    }


    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
