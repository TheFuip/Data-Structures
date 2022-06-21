import java.util.Stack;

/**
 * stacksRFun
 */
public class stacksRFun {

    public static void main(String[] args) {
       // Stack<String> games = new Stack<String>();
        //can also do it like this, works just fine
        //Stack<String> games = new Stack();

        //the actual visualization of a stack would look like this in order -> super money ball (top), guitar hero(middle), call of duty (bottom)
        //games.add("call of duty");
       // games.add("guitar hero");
        //games.add("super money ball");

        //System.out.println(games);

        //removes the top of the stack
        //System.out.println(games.pop()+"\n");

        //System.out.println(games.pop()+"\n");

        //peek prints out the top of the stack but leaves it within the stack
       // System.out.println(games.peek());

        //lamda expression to print out each game title
        //games.forEach(game -> System.out.println(game));

        /*Example #2 */
        //Y
        //B
        //R
        Stack<String> lego = new Stack<String>();

        //remember we always add from the top down, so red comes first than blue, than yellow
        lego.add("red");
        lego.add("blue");
        lego.add("yellow");

        //push a green lego to the top of the stack
        lego.push("green");

        //return true/false if the queue is empty
        //System.out.println(lego.empty());

        //return boolean value depending on whether the stack contains a certain value
        //System.out.println(lego.contains("purple"));

        //get the specific index of lego's 
        //System.out.println(lego.get(1));

        //replace the value of an index 
        lego.set(lego.size()-1, "purple"); //replaces the value of green with purple

        lego.forEach(colour -> System.out.println(colour + ", "));
        
    }
}