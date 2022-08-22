public class Main {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode firstNode = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = firstNode;
            firstNode = head;
            head = temp;
        }
        return firstNode;
    }
}
