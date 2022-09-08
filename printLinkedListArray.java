public class printLinkedListArray {
    public static void main(String[] args) {
        /*
         * print all the listnode values in a singly-linked-list
         */
        ListNode lists[] = {new ListNode(1, new ListNode(4, new ListNode(5))),
            new ListNode(1, new ListNode(3, new ListNode(4))),
            new ListNode(2, new ListNode(6))
        }; 

        for(ListNode ln : lists){
            System.out.print(ln.val + ", ");
            ListNode ln2 = ln.next;
            while (ln2 != null) {
                System.out.print(ln2.val + ", ");
                ln2 = ln2.next;
            }
        }
    }
}
