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

    /** This method helps insert(index, value) traversing through the linked list
     * @param index index for insert(index, value)
     * @return preAft array with the nodes' references surrounding the inserted new node
     */
    public node[] traversePreAft(int index){
        node[] preAft = new node[2];        //holds references of the nodes around the newly inserted nodes
        node currentNode = head;            //setting current node to refer to first node
        int i = 0;

        //traversing loop
        while( i < index){
            preAft[0] = currentNode;
            preAft[1] = currentNode.getNextNode();
            currentNode = currentNode.getNextNode();    //traverse the pointer
            i++;
        }
        return preAft;
    }

    /**
     * This method inserts a new node at index int index and has a value of int value
     * @param index index of the inserted node
     * @param value value of the inserted node
     */
    public void insert(int index, int value){
        node newNode = new node(value);

        if (index > this.len || index < 0){
            System.out.println("Insertion failed. Index out of boundary. Exiting to System");
            System.exit(-1);
        } else if(index == this.len){
            append(value);
        } else if(index == 0){
            prepend(value);
        }else{
            node[] preAft = traversePreAft(index);  //get the two nodes surrounding newNode
            preAft[0].setNextNode(newNode);         //set the newNode as the nextNode for the node(i-1)
            newNode.setNextNode(preAft[1]);         //set the nextNode for newNode to node(i+1) --previously node(i)
            len++;
        }

    }

    /**
     * This method prints out the full list
     */
    public void printList(){
        String printedList = new String();
        node currentNode = head;

        //traversing loop
        while(currentNode != null){
            printedList += " " + currentNode.getValue() + " --> ";
            currentNode = currentNode.getNextNode();    //move currentNode pointer to next node
        }

        System.out.println(printedList.substring(0,printedList.length()-5));    //prints the string without extra "-->" at the end
    }



    /** returns the length of the linked list
     *
     * @return length of the linked list
     */
    public int getLen() {
        return len;
    }
}
