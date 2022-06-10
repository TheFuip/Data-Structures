import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class breadthFirstSearch {

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
    
    public boolean hasPathBFS(Node source, Node destination){
        LinkedList<Node> nextToVisit = new LinkedList<Node>();

        HashSet<Integer> visited = new HashSet<Integer>();
        nextToVisit.add(source);

        while(!nextToVisit.isEmpty()){
            Node node = nextToVisit.remove();

            if(node == destination) return true;

            if(visited.contains(node.id)) continue;
            visited.add(node.id);

            for(Node child : node.adjacent){
                nextToVisit.add(child);
            } 
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        /*
         * Breadth First Search (BFS),
         * goes BROAD to neighbours before going deep
         * 
         * A BFS can quickly access the children from one parent Node.
         * i,e - A - B - C - D
         *       E - F - G - H
         *       I - J - K - L
         * 
         * Lets say we are trying to find the path to Node D, we can see that Node A is the parent of Node D
         * Node A's children are B, C, D so we could have onbtained a very quick connection.
         * 
         * You use a queue for BFS - i.e, a queue to add the parents of a node followed by their children. i.e, (A,B,C,D)
         */
    }
}
