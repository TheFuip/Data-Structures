import java.util.*;

public class linkListTraversal {
    public static void main(String[] args) {
        /*
         * Traversal in a linked list
         */
        LinkedList<Node> list = new LinkedList<>();
        list.add(new Node('e'));
        list.add(new Node('f'));
        list.add(new Node('g'));
        list.add(new Node('h'));

        Node a = new Node('a');
        Node b = new Node('b');
        Node c = new Node('c');
        Node d = new Node('d');

        //a - b - c - d - null
        a.next = b;
        b.next = c;
        c.next = d;

        //printLinkedList(a);
        printRecursive(a);
    }

    //the head node will always be the node we wish to start at
    public static void printLinkedList(Node head){
        Node current = head;

        //until the current node is equal to null, print out the data inside the node (char), and update current node to the next node
        while(current != null){
            System.out.print(current.val + ", ");
            current = current.next;
        }

    }

    //recursive option to print each node
    public static void printRecursive(Node head){
        if(head == null){
            return;
        }

        System.out.print(head.val + " -> ");

        printRecursive(head.next);
    }
}


