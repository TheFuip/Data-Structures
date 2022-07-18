public class printAllLinkedListValues {
    public static void main(String[] args) {
        Node node = new Node('a',new Node('b', new Node('c', new Node('d'))));

        //printLoop(node);

        recursivePrintNode(node);
    }   

    //print out node using loops
    public static void printLoop(Node head){
        while(head != null){
            System.out.print(head.val + " -> ");

            head = head.next;
        }
    }

    //print out node recursively
    public static void recursivePrintNode(Node head){
        if(head == null){
            return;
        }

        System.out.print(head.val + ", ");

        recursivePrintNode(head.next);
    }
}


