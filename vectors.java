//import the vector package
import java.util.Enumeration;
import java.util.Vector;

public class vectors {
    public static void main(String[] args) {
        /*
         * implements a growable array of objects. Much like an array it contains data accessible through indexes.
         * The size of a vector can grow or shrink as needed to accomodate adding and removing items after the Vector has been created.
         */
        Vector v = new Vector();

        /*
         * The 'add' method inserts an element at a given position of a vector
         * The 'addElement' method adds an object at the end of the vector and increases the size of the vector by one.
         */
        v.addElement(1); 
        v.addElement("a");

        //adds 'b' towards index 1, the result is that 'a' is pushed back by one index
        v.add(1, "b");
        
        //System.out.println(v);

        //get certain index values within a vector
        System.out.println(v.get(1)); //returns b

        //get the total size of the vector
        System.out.println(v.size());

        /*
        alternative to printing out all elements within a vector
        Enumeration e = v.elements();

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        */
        //call the recusrive method to print out all elements of the vector, beginning at index 0
        test(v, 0);
    }

    //recursive method to implement all index values in a vector
    public static void test(Vector v, int n){
        if(n==v.size()) return;

        System.out.println(v.get(n));

        test(v, n+1);
    }

}
