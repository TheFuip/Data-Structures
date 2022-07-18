public class getNodeValue {
    public static void main(String[] args) {
        /*
         * Take in a linked list and accept an index as input.
         * ex: [a,b,c,d] index = 2 | return c
         */
        Node node = new Node('a', new Node('b', new Node('c', new Node('d'))));

        //System.out.println(getNodeValue(node, 0));
        System.out.println(recursiveGetNodeValue(node, 3));
    }

    //niterative approach
    public static Character getNodeValue(Node head, int index){
        for(int i = 0; i < index; i++){
            head = head.next;
        }

        return head.val;
    }

    //recursive approach
    /*
     * The logic here is to decrease index by 1 each time until it equals 0, while incrementing each node value by 1
     */
    public static Character recursiveGetNodeValue(Node head, int index){
        return index == 0 ? head.val : recursiveGetNodeValue(head.next, index-1);
    }
}
