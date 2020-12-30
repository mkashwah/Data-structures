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
        tail.setNextNode(theNode);          //set the next node to the current node
        tail = theNode;                     //change pointer of tail to the new node
        len++;                              //length + 1
    }

    /**
     * This methods prepends a node to the linked list
     * @param value Integer value of the node to be created then prepended
     */
    public void prepend(int value){
        this.theNode = new node(value);     //create node reference
        theNode.setNextNode(head);          //make head node be referred to as the new node's next node
        head = theNode;                     //change pointer of head to the new node
        len++;                              //length + 1
    }

    public node[] traversePreAft(int index){
        node[] preAft = new node[2];        //holds references of the nodes around the newly inserted nodes
        int i = 0;
        while( i <= index){
            preAft[0] = 
        }



        return preAft;
    }



    /** returns the length of the linked list
     *
     * @return length of the linked list
     */
    public int getLen() {
        return len;
    }
}
