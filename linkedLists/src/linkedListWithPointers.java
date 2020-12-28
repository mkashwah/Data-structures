/** This class implements linked list with more use of pointers
 * @author M. Kashwah
 */

public class linkedListWithPointers {

    private node theNode;   //node created in the append function
    private node head;      //head node
    private node tail;      //tail node
    private int len = 0;    //length of the list

    /**
     * Default constructor. Sets up the first node , head ,
     * @param value sets the value of the first node
     */
    public linkedListWithPointers(int value){
        head = new node(value);
        tail = head;
        len++;
    }

    /** Creates node then append it to the tail of the linked list
     *
     * @param value Integer value of the node to be created then appended
     */
    public void append(int value){
        this.theNode = new node(value);     //create node reference
        tail.setNextNode(theNode);  //set the next node to the current node
        tail = theNode;     //make tail refer to the current node now
        len++;
    }

    /** returns the length of the linked list
     *
     * @return length of the linked list
     */
    public int getLen() {
        return len;
    }
}
