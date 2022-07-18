import java.util.ArrayList;
import java.util.LinkedList;

public class linkedListTutorial {
    public static void main(String[] args) {
        /*
         * A linked list is a data structure.
         * Each element within the linked list knows the front, and the next element within the list.
         * Made up of many nodes.
         * A node is essentially a container for some data.
         * also have to use an iterator to get elements at specific indexes
         */
        LinkedList<String> ll = new LinkedList<>();

        // A - B - C - D - null | A is the head, D is the tail 
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");

        //will remove from the front
        //ll.remove();

        /*insert elements within a linked list are costly 
        (o (n) insertion time)
        since each element after the insertion must be shifted
        ex: adding 'q' to index 2, replaces the element currently there (c) -> but if we wanted to add 'q' to index 2 and not change any data it would look like this
        (A) - (B) - (q) - (C) - (D)
        */
        ll.set(2, "q");
        

        System.out.println(ll);
    }
}
