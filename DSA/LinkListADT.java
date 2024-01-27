import java.util.LinkedList;

/**
 * LinkedList ADT implementation
 * 
 */
public class LinkListADT {
   public static void main(String[] args) {
        // LinkedList creation 
        // LinkedList<E - Type of data> name = new LinkedList<E - Same as before>();
        LinkedList<String> ll_String = new LinkedList<String>();

        // Adding elements to each list
        ll_String.add("Hello");
        ll_String.add(". This ");    
        ll_String.add("is a ");    
        ll_String.add("test ");
        ll_String.add("String");

        // Printing the elements in the list
        System.out.println("This prints out all the elements in the form of list: " + ll_String);
        System.out.println("This prints each elements seperately: ");
        for (String string : ll_String) {
            System.out.print(string);
        }

        // Operations on this

        // 1. Adding an element
        ll_String.add("testString");                                //Gets added at the end of the list
        System.out.println("List elements: " + ll_String);

        // 2. Adding an element at a position
        ll_String.add(3, "testString at 3rd position");
        System.out.println("List elements: " + ll_String);

        // 3. Adding elements from a different collection at the beginning and at the end.
        LinkedList<String> temp = (LinkedList<String>) ll_String.clone();
        LinkedList<String> ll_first, ll_last;
        ll_first.add("null")
    } 
}
