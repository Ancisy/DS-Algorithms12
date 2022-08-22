public class Main {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head.next;

        if (head == null || head.next == null) {
            return false;
        }

        while(first != second){
            if(second == null || second.next == null)
                return false;
            first = first.next;
            second = second.next.next;
        }
        return true;
    }
}
