public class sumList {
    // given a linked list of values, return the total sum of all the values

    public static void main(String[] args) {
        ListNode ln = new ListNode(2, new ListNode(8, new ListNode(3, new ListNode(7)))); //22

        //System.out.println(sumListValues(ln));
        System.out.println(recursiveSum(ln));
    }

    //non-recursive solution
    public static int sumListValues(ListNode head) {
        int sum = 0;

        while(head != null){
            sum += head.val;

            head = head.next;
        }

        return sum;
    }

    //recursive solution
    public static int recursiveSum(ListNode head){
        return head == null ? 0 : head.val + recursiveSum(head.next);
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
