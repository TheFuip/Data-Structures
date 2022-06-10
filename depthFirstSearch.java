import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class depthFirstSearch {

    private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();

    public static class Node {
        private int id;

        //linked list of type Node
        LinkedList<Node> adjacent = new LinkedList<Node>();

        //constructor for the static class, make each instance require a numeric id;
        private Node(int id){
            this.id = id;
        }
    }

    private Node getNode(int id){
        Node focusNode = new Node(id);
        return focusNode;
    }

    public void addEdge(int source, int destination){
        Node s = getNode(source); //first get the source of the Node
        Node d = getNode(destination); //create a new node with the destination

        //grabs the adjacent value, the value right beside the s aka the source node and fills it with the value of d aka the destination value passed in by getNode method
        s.adjacent.add(d);
    }

    public boolean hasPathDFS(int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);

        //create new hashset of type integer
        HashSet<Integer> visited = new HashSet<Integer>();

        //call the recursive method
        return hasPathDFS(s, d, visited);
    }

    private boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited){
        if(visited.contains(source.id)) return false;

        visited.add(source.id);

        if(source==destination) return true;

        for(Node child : source.adjacent){
            if(hasPathDFS(child, destination, visited)) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        /*
         * Mainly a recursive algorithm. 
         * Imagine a diagram of nodes - A, B, C, D, E, F, G (in this order)
         * A depth first search will ask if Node A has a path to Node D.
         * Node A does not have a direct path to Node D,
         * the next step is to examine the children, since Node B is the parent of Node A, we will ask if Node B has a path to Node D,
         * Node B does not have a path to Node D, so we will move on and examine the child of Node B which is Node C
         * We will ask if Node C has a path to Node D. Since Node C is not Node D, we will move on to the child of C, Node D
         * We will then ask Node D if there is a path to Node D. Since Node D is Node D the program ends.
         * 
         * Think of it like this
         * A, B, C, D, E, F, G 
         * (A,D)!=D, (B,D)!=D, (C,D)!=D, (D,D) = D (correct!)
         * 
         * i.e DFS goes deep to children before going broad to neighbours
         * important to add a flag, so you dont get an infinite loop
         */
    }    
}/*
 * A graph is a collection of Nodes. Where other Nodes may point to other nodes, i.e, one-way streets, two streets, etc.
         * Mainly used for path finding. Whether or not there is a path to another Node.
*/
