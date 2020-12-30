/** This class implements singly linked list with more use of pointers
 * @author M. Kashwah
 */

public class linkedListWithPointers {

    private node theNode;   //node created in the append function
    private node head;      //head node
    private node tail;      //tail node
    private int len = 0;    //length of the list
    private int tailAt = 0; //this variable stores length of the list - 1 (where the tail is relative to the head)
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
        tailAt++;
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
        tailAt++;
    }

    /** This method helps insert(index, value) traversing through the linked list
     * @param index index for insert(index, value)
     * @return preAft array with the nodes' references surrounding the inserted new node
     */
    private node[] traversePreAft(int index){
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
            System.out.println("insert(int index, int value) failed. Index out of bound. Exiting to System");
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
            tailAt++;
        }

    }

    /**
     * This method removes a node at index int index
     * @param index index of the node to be removed
     */
    public void remove(int index){

        //if statement to check the validity of the passed int index
        if (index < 0 || index > tailAt){
            System.out.println("remove(int index) failed. Index out of bound. Exiting to System ");
            System.exit(-2);
        } else if(index == 0){
            node newHead = head.getNextNode();
            head = newHead;
            len--;
            tailAt--;
        } else if(index == tailAt){
            node[] preAft = traversePreAft(index);
            tail = preAft[0];
            tail.setNextNode(null);
            preAft[1] = null;
            len--;
            tailAt--;
            System.gc();                                        //call JVM garbage collector
            System.runFinalization();

        }

        else {
            node[] preAft = traversePreAft(index);              //retrieve the references of the node to be deleted and its predecessor
            preAft[0].setNextNode(preAft[1].getNextNode());     //step over the deleted node. node[0].next = next node of the deleted one
            preAft[1] = null;                                   //nullify the deleted node for garbage collector
            len--;
            tailAt--;
            System.gc();                                        //call JVM garbage collector
            System.runFinalization();
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

    //create a method which reverses the original linkedlist
    //going to reverse all the nodes connection (.nextNode) of the linked list
    //call the old head --> tail & the old tail --> head
    //make an array that will contain the reference to each node in order

    public void reverse(){
        node[] allNodes = new node[this.getLen()];
        node currentNode = head;

        //fill this array with the references by traversing through the list
       for(int i = 0; i <= this.getTailAt(); i++){
           allNodes[i] = currentNode;
           currentNode = currentNode.getNextNode();
       }
       for (int i = this.getTailAt(); i > 0; i--){
           allNodes[i].setNextNode(allNodes[i-1]);
       }
       head = allNodes[getTailAt()];
       tail = allNodes[0];
      tail.setNextNode(null);


    }



    /** returns the length of the linked list
     *  counting from 0
     * @return length of the linked list
     */
    public int getLen() {
        return len;
    }


    public int getTailAt() {
        return tailAt;
    }
}
