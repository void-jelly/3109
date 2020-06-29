import java.util.ArrayList;
import java.util.HashSet;

/**
 * The Node class for representing blocks in the Control-Flow Graph.
 */
public class Node {

    String name;                // Name of the block (eg. B0, B1, B2)
    String label;               // Label of the block if the block has one
    ArrayList<String> stmts;    // Statements in the block
    HashSet<Node> preds;        // Predecessor of the node
    HashSet<Node> succs;        // Successors of the node

    public Node(String name) {
        this.name = name;
        this.label = null;
        this.stmts = new ArrayList<>();
        this.preds = new HashSet<>();
        this.succs = new HashSet<>();
    }
}