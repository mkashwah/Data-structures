/** This class implements a linked list and its relevant methods
 * @author M. Kashwah
 */
import java.util.ArrayList;
public class linkedList {
    private int len = 0;     //length of the linked list
    private ArrayList <node> nodesRef = new ArrayList<>();       //array list to hold the references to the nodes
    private boolean isAtHead;     //this boolean is used to keep track of the head of the linked list
    /**
     *  Linked list constructor
     */
    public linkedList(){
        isAtHead = true;      //instantiate to true when the linked list object is created to tell test if the linked list is at head
    }

    /**
     * This is an appending method. It appends a node object to the end of the linked list
     * @param node
     */
    public void append(node node){
        nodesRef.add(node);

        //this if statement checks if the current node is head or internal node to append the node with the tail node
        if (isAtHead == false){
            nodesRef.get(len-1).setNextNode(node);      //point node(i- 1) to node (i)
        } else {
            //in the case that we are at the head node, change isAtHead to false for the next appended node
            isAtHead = false;
        }
        len++;
    }

    /** This methods prepends a node to the linked list
     *
     * @param node node object to prepend to the linked list
     */
    public void prepend(node node){
        if (isAtHead == true){      //the case that this is the first node
            nodesRef.add(node);
            isAtHead = false;
        } else {
            node.setNextNode(nodesRef.get(0));      //next node of the prependded node to be set to the head node
            nodesRef.add(0, node);            //change the reference of the head node in the array list
        }
        len++;

    }

    /** returns the length of the linked list
     * @return length of the linked list
     */
    public int getLen() {
        return len;
    }
}
