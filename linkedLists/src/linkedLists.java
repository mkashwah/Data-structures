import java.lang.management.ManagementFactory;

public class linkedLists {
    public static void main(String[] args) {
        //testing linked lists


//        //the CPU time and USER time for each linked list will be tested to determine which one performs better
//        //this is done by creating threads for each of them
//
//        Thread list1_thread = new Thread(){
//            public void run(){
//                //creating linked list object
//                linkedList list1 = new linkedList();
//
//                //creating node objects
//                node node1 = new node(2);
//                node node2 = new node(4);
//                node node3 = new node(8);
//                node node4 = new node(10);
//                node node0 = new node(0);
//                node node_1 = new node(-2);
//                node node_2 = new node(-4);
//
//                //appending the nodes into the linked list
//                list1.append(node1);
//                list1.append(node2);
//                list1.append(node3);
//                list1.append(node4);
//
//                //prepending the nodes to the linked list
//                list1.prepend(node0);
//                list1.prepend(node_1);
//                list1.prepend(node_2);
//
//                //length of the linked list;
//                System.out.println("\ntest the first linked list " + list1.getLen());
//                System.out.println("\nlinked list with arraylist to keep references: ThreadCpuTime = " + ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime()/1000000000d);
//                System.out.println("\nlinked list with arraylist to keep references: UserTime = " + ManagementFactory.getThreadMXBean().getCurrentThreadUserTime()/1000000000d);
//
//            }
//
//        };
//        list1_thread.start();
//
//
//        Thread list2_thread = new Thread(){
//            public void run(){
//                //test linkedListWithPointers
//                linkedListWithPointers list2 = new linkedListWithPointers(2);
//                list2.append(4);
//                list2.append(6);
//                list2.append(8);
//
//                list2.prepend(0);
//                list2.prepend(-2);
//                list2.prepend(-4);
//
//                System.out.println("\ntest second linked list " + list2.getLen());
//                System.out.println("\nlinked list with emphasis on pointers: ThreadCpuTime = " + ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime()/1000000000d);
//                System.out.println("\nlinked list with emphasis on pointers: UserTime = " + ManagementFactory.getThreadMXBean().getCurrentThreadUserTime()/1000000000d);
//
//            }
//
//        };
//        list2_thread.start();



        //test linkedListWithPointers
        linkedListWithPointers list2 = new linkedListWithPointers(2);
        list2.append(4);
        list2.append(6);
        list2.append(8);

        list2.printList();
        System.out.println(list2.getLen());

        list2.prepend(0);
        list2.prepend(-2);
        list2.prepend(-4);

        list2.printList();
        System.out.println(list2.getLen());

        list2.insert(3, 20);        //inserting at index 3
        list2.insert(0,-20);        //inserting at the head
        list2.insert(list2.getLen(), 222);      //inserting at the tail
        list2.printList();
        System.out.println(list2.getLen());

        //testing remove(int index)
        System.out.println("testing remove(int index)");
        list2.remove(2);                   //deleting at index 2
        list2.remove(0);                   //deleting the head
        list2.remove(0);                   //deleting the head
        list2.remove(list2.getTailAt());           //deleting the tail
        list2.printList();


        //testing reverse
        System.out.println("testing reverse");
        list2.reverse();
        list2.printList();

       



//        //testing foolproofing of remove()
//        list2.remove(list2.getTailAt()+1);      //trying to remove past the tail

//        //testing foolproofing of insert()
//        list2.insert(list2.getLen()+1, 1000);     //the program successfully shuts down after when encountered with index out of bound
//        System.out.println(list2.getLen());
//        list2.printList();




    }
}
