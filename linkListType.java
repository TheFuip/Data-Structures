import java.util.*;

public class linkListType {
    public static void main(String[] args) {
        LinkedList<Character> ll = new LinkedList<>();

        ll.add('a');
        ll.add('b');
        ll.add('c');
        ll.add('d');

        ll.add(2, 'v');

        //prints out value found in index 2
        System.out.println(ll.get(2));
        //c is shifted to the next element | changes the references b points to c and changed v which now points to c
        System.out.println(ll);

    }
    //array list is better at getting an element at a certain position
    //link list is better and much faster than array list at removing elements and adding them
}
