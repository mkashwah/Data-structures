public class linkedLists {
    public static void main(String[] args) {
        //testing linked lists

        //creating linked list object
        linkedList list1 = new linkedList();

        //creating node objects
        node node1 = new node(2);
        node node2 = new node(4);
        node node3 = new node(8);
        node node4 = new node(10);

        //appending the nodes into the linked list
        list1.append(node1);
        list1.append(node1);
        list1.append(node1);
        list1.append(node1);

        //length of the linked list;
        System.out.println("test the first linked list " + list1.getLen());


        //test linkedListWithPointers
        linkedListWithPointers list2 = new linkedListWithPointers(2);
        list2.append(4);
        list2.append(6);
        list2.append(8);

        System.out.println("\ntest second linked list " + list2.getLen());

    }
}
