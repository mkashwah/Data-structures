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

    /**Polymorphic constructor that doesn't require value
     *
     */
    public node(){
        this.nextNode = null;
    }

    /** This method sets the next node of a node object
     *
     * @param nextNode node object
     */
    public void setNextNode(node nextNode) {
        this.nextNode = nextNode;
    }

    /** This method sets the value in a node object
     *
     * @param value integer value
     */
    public void setValue(int value) {
        this.value = value;
    }
}
