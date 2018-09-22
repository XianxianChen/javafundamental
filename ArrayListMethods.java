import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
public class ArrayListMethods {
    public static void main(String[] args){

        // You can create an ArrayList variable
        ArrayList arrayListOne;

        // Then create an ArrayList object
        // You don't have to declare the ArrayList size like you
        // do with arrays (Default Size of 10)

        arrayListOne = new ArrayList();

        // You can create the ArrayList on one line

        ArrayList arrayListTwo = new ArrayList();

        System.out.println(arrayListTwo);

        // You can also define the type of elements the ArrayList
        // will hold

        ArrayList<String> names = new ArrayList<String>();

        // This is how you add elements to an ArrayList

        names.add("John Smith");
        names.add("Mohamed Alami");
        names.add("Oliver Miller");
        System.out.println(names);

        // You can also add an element in a specific position
        names.add(2, "Jack Ryan");

        // You can also use the enhanced for with an ArrayList
        for(String i : names)
        {
            System.out.println(i);
        }
        System.out.println(); // Creates a newline
        // Before the enhanced for you had to use an iterator
        // to print out values in an ArrayList

        // Creates an iterator object with methods that allow
        // you to iterate through the values in the ArrayList
        Iterator indivItems = names.iterator();
        // When hasNext is called it returns true or false
        // depending on whether there are more items in the list
        while(indivItems.hasNext())
        {
            // next retrieves the next item in the ArrayList
            System.out.println(indivItems.next());

        }

        // I create an ArrayList without stating the type of values
        // it contains (Default is Object)
        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();

        // addAll adds everything in one ArrayList to another
        nameCopy.addAll(names);
        System.out.println(nameCopy);

        String paulYoung = "Paul Young";

        // You can add variable values to an ArrayList
        names.add(paulYoung);

        // contains returns a boolean value based off of whether
        // the ArrayList contains the specified object

        if(names.contains(paulYoung))
        {
            System.out.println("Paul is here");
        }

        // containsAll checks if everything in one ArrayList is in
        // another ArrayList
        if(names.containsAll(nameCopy))
        {
            System.out.println("Everything in nameCopy is in names");
        }
        // Clear deletes everything in the ArrayList
        names.clear();
        // isEmpty returns a boolean value based on if the ArrayList
        // is empty
        if (names.isEmpty())
        {
            System.out.println("The ArrayList is empty");

        }

        Object[] moreNames = new Object[4];

        // toArray converts the ArrayList into an array of objects
        moreNames = nameCopy.toArray();

        // toString converts items in the array into a String
        System.out.println(Arrays.toString(moreNames));







    }
}
