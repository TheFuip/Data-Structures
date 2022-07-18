public class zipperLists {
    public static void main(String[] args) {
        /*
         * merge two lists together
         * node1 = [a,b,c,d,e,f] | node2 = [q,r] ->   [a,q,b,r,c,d,e,f]
         */
        Node node1 = new Node('a', new Node('b', new Node('c', new Node('d', new Node('e', new Node('f'))))));
        Node node2 = new Node('q', new Node('r'));

        //Node merge = mergeNode(node1, node2);
        Node merge = mergeNodeRecursively(node1, node2);


        printNode(merge);

    }

    //print node vals out
    public static void printNode(Node head){
        if(head == null){
             return;
        }

        System.out.print(head.val + ", ");

        printNode(head.next);
    }

    //iterative approach
    public static Node mergeNode(Node list1, Node list2){
        Node current1 = list1.next;
        Node current2 = list2;
        Node tail = list1;

        //depending on whether count is even or odd it will determine whether we select a node from list1 or list2
        int count = 0;

        while(current1 != null && current2 != null){
            //check if count is even take the node from list2, otherwise it must be odd so take it from list1
            if(count % 2 == 0){
                tail.next = current2;

                //move to the next node inside of current2
                current2 = current2.next;
            }else{
                tail.next = current1;

                //move on to the next node inside of current1
                current1 = current1.next;
            }

            //increment tail
            tail = tail.next;

            //incremenet count
            count ++;
        }

        //in the event where a one list contains less nodes than the other add the rest of the nodes to the merged list
        if(current1 != null){
            tail.next = current1;
        }else if(current2 != null){
            tail.next = current2;
        }

        return list1;
    }

    //recursive approach
    public static Node mergeNodeRecursively(Node list1, Node list2){
        if(list1 == null && list2 == null){
            return null;
        }

        if(list2 == null){
            return list1;
        }

        if(list1 == null){
            return list2;
        }

        Node next1 = list1.next;
        Node next2 = list2.next;

        list1.next = list2;

        list2 = mergeNode(next1, next2);

        return list1;
    }
}
