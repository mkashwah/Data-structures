/** This class implements a node in a linked list
 * @author M. Kashwah
 */
public class node {

    private int value;      //value stored
    private node nextNode;      //node object for the next node


    /** Public constructor for this class
     * @param value integer stored at this node
     */
    public node(int value){
        this.value = value;
        this.nextNode = null;

    }

    public void setNextNode(node nextNode) {
        this.nextNode = nextNode;
    }
}
