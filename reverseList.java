public class reverseList {
    public static void main(String[] args) {
        /*
         * Given a linked list reverse the order of it
         * a - b - c - d =
         * d - c - b - a
         */
        Node list = new Node('a', new Node('b', new Node('c', new Node('d'))));

        //list = iterativeReverse(list);
        list = recursiveReverse(list, null);

        printNode(list);
    }

    // iterative approach
    public static Node iterativeReverse(Node head) {
        // 2 pointer approach
        Node reverse = null;
        Node temp = null;

        while (head != null) {   
            temp = head.next;

            head.next = reverse;

            reverse = head;

            head = temp;
        }

        return reverse;
    }

    // recursive approach
    public static Node recursiveReverse(Node head, Node prev) {
        if(head == null) return prev;

        Node next = head.next;

        head.next = prev;

        return recursiveReverse(next, head);
    }

    //print node vals
    public static void printNode(Node head){
        while(head != null){
            System.out.print(head.val + " -> ");

            head = head.next;
        }
    }
}
