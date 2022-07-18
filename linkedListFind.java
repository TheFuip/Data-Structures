public class linkedListFind {
    public static void main(String[] args) {
        /*
         * given a linked list -> a - b - c - d,
         * return true or false whether the target value is contained in the linked list
         * i.e -> [a,b,c,d] target = c | true || [e,f,g] target = i | false
         */
        Node list = new Node('a', new Node('b', new Node('c', new Node('d'))));

        //System.out.println(findTarget(list, 'e'));
        System.out.println(        recursiveFind(list, 'e'));

    }

    //non-recursive approach
    public static boolean findTarget(Node head, Character target){
        while(head != null){
            if(head.val == target){
                return true;
            }

            head = head.next;
        }

        return false;
    }

    //recursive approach
    public static boolean recursiveFind(Node head, Character target){
        if(head == null){
            return false;
        }

        return head.val == target ? true : recursiveFind(head.next, target);
    }
}
