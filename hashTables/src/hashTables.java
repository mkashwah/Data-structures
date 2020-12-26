import java.util.Arrays;
import java.util.ArrayList;


public class hashTables {

    //array of arraylists holds list of phoneEntry objects
    //the size of this array is equal to the size of the hash table as each hash is connected to an arraylist that contain
    //phoneEntry objects
    private ArrayList<phoneEntry>[] phoneBook;
    private static int totalEnteries = 0;

    public hashTables(int size){
        phoneBook = new ArrayList[size];
    }

    /** This method is the hash creator. It is a simple function created for the purpose of demoing what hash function are
     *
     * @param name ==> This is the 'key' to be stored in the hash table
     * @return hash
     */
    private int hash(String name){
        int hash = 0;

        //this loop returns the sum of the unicodes to all the letters in the given name
        //the hash returned is of the value 0 < hash < size of hashTable
        for (int i = 0; i < name.length(); i++){
            hash = (hash + name.codePointAt(i) * i) % this.phoneBook.length;
        }
    return hash;
    }

    /**This method fills the hashTable
     *
     * @param name Name to be stored
     * @param number associated number
     */
    private void set(String name, int number){
        int tableAddress = hash(name); //get the hash code (tableAddress)

        if(this.phoneBook[tableAddress] == null){
            phoneBook[tableAddress] = new ArrayList<>();
        }

        //create phoneEntry object
        phoneEntry entry = new phoneEntry(name, number);

        //add the created phone entry to the adjacent arraylist
        phoneBook[tableAddress].add(entry);

        //increase totalEnteries tally
        totalEnteries++;
    }

    /** This method returns the number associated with the passed passed name
     *
     * @param name Name to be looked up
     * @return number associated with name
     */
    private int get(String name){
        int number;
        int tableAddress = hash(name);

        if (phoneBook[tableAddress] == null){
            System.out.println("Entry does not exist");
            return (-1);
        }

        //in the case if there's collision this loop solves it
        for (int i = 0; i < phoneBook[tableAddress].size(); i++){
            if (name == phoneBook[tableAddress].get(i).getName()){
                number = phoneBook[tableAddress].get(i).getNumber();
                return number;
            }

        }
        return 1;
    }

    /** This method loops through only occupied hashTable buckets (!= null) and returns all the keys ('names') of the hashtable.
     *
     * @return Array of Strings containing all the keys ('names') of the hashtable
     */
    public String[] names(){
        String[] allEnteries = new String[totalEnteries];
        int index = 0;
        for(int i = 0; i < phoneBook.length; i++){
            if(phoneBook[i] != null){
                for(int n = 0; n < phoneBook[i].size(); n++){
                    System.out.println("Name: " + phoneBook[i].get(n).getName());
                    allEnteries[index] = phoneBook[i].get(n).getName();
                }
            }

        }
        return allEnteries;
    }




    public static void main(String[] args) {
       //testing hashTable
        hashTables phoneBook = new hashTables(10);
        phoneBook.set("Joe", 647111111); //hashcode = 3
        phoneBook.set("Doe", 647222222);    //hashcode = 3
        phoneBook.set("Kashwah", 647333333); //hashcode = 4
        phoneBook.set("Peter", 647444444); //hashcode = 2
        phoneBook.set("Griffin", 647555555); //hashcode = 3
        phoneBook.set("Rick", 647666666); //hashcode = 4
        phoneBook.set("Sanchez", 647777777); //hashcode = 7

        //testing get(String name)
        System.out.println(phoneBook.get("Doe"));
        System.out.println(phoneBook.get("Kashwah"));
        System.out.println(phoneBook.get("Sanchez"));
        System.out.println(phoneBook.get("Morty")); //this entry does not exist and will return -1


        //testing names
        System.out.println("Testing names() \n");
        phoneBook.names();

        //there's an issue with the length of the number once it hits 10 digits.. to be investigate later
        //for now this issue can be fixed by adding another parameter to phoneEntry() objects to contain the extra digits

        //testing firstRecurringCharacter
        System.out.println("\nTesting firstRecurringCharacter");
        int[] array1 = {0,4,3,5,2,4,3,1,0};
        int[] array2 = {0,3,4,3,2,4,3,1,0};
        int[] array3 = {9,1,2,3,4,5,6,7,8};

        firstRecurringCharacter frc1 = new firstRecurringCharacter();
        System.out.println("\nrecurring in array 1: "+ frc1.firstRecurring(array1));

        firstRecurringCharacter frc2 = new firstRecurringCharacter();
        System.out.println("\nrecurring in array 2: "+ frc2.firstRecurring(array2));

        firstRecurringCharacter frc3 = new firstRecurringCharacter();
        System.out.println("\nrecurring in array 3: "+ frc3.firstRecurring(array3));
        
    }
}
