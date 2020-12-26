import java.util.Arrays;
import java.util.ArrayList;


public class hashTables {

    //array of arraylists holds list of phoneEntry objects
    //the size of this array is equal to the size of the hash table as each hash is connected to an arraylist that contain
    //phoneEntry objects
    private ArrayList<phoneEntry>[] phoneBook;


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
        for (int i = 0; i < phoneBook[tableAddress].size(); i++){
            if (name == phoneBook[tableAddress].get(i).getName()){
                number = phoneBook[tableAddress].get(i).getNumber();
                return number;
            }

        }
        return 1;
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
        System.out.println(phoneBook.get("Morty"));

        //there's an issue with the length of the number once it hits 10 digits.. to be investigate later
        //for now this issue can be fixed by adding another parameter to phoneEntry() objects to contain the extra digits


    }
}
