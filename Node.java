public class Node {

    char val;
    Node next;

    //blank constructor
    public Node(){}

    //constructor with just val
    public Node(char val){
        this.val = val;
    }

    //constructor with both val and next
    public Node(char val, Node next) {
        this.val = val;
        this.next = next;
    }
}
