    //Approach 2: Create Two Separate Lists (In-Place)
    
    class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class PartitionLinkedList {

    public static ListNode partitionList(ListNode head, int x) {
        ListNode lessThanX = new ListNode(0);
        ListNode greaterThanOrEqualX = new ListNode(0);
        ListNode lessThanXCurrent = lessThanX;
        ListNode greaterThanOrEqualXCurrent = greaterThanOrEqualX;

        while (head != null) {
            if (head.val < x) {
                lessThanXCurrent.next = head;
                lessThanXCurrent = lessThanXCurrent.next;
            } else {
                greaterThanOrEqualXCurrent.next = head;
                greaterThanOrEqualXCurrent = greaterThanOrEqualXCurrent.next;
            }
            head = head.next;
        }

        greaterThanOrEqualXCurrent.next = null; // Set the end of the greaterThanOrEqualX list
        lessThanXCurrent.next = greaterThanOrEqualX.next;

        return lessThanX.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage
        ListNode linkedList = new ListNode(1);
        linkedList.next = new ListNode(1);
        linkedList.next.next = new ListNode(2);

        System.out.println("Original List: ");
        printList(linkedList);

        int x = 2;
        ListNode modifiedList = partitionList(linkedList, x);

        System.out.println("Modified List: ");
        printList(modifiedList);
    }
}

