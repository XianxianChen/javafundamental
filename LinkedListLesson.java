import java.util.*;

public class LinkedListLesson {

    public static void main(String[] args) {

        // Creating object of class linked list
        LinkedList<String> object = new LinkedList<String>();

        // Adding elements to the linked list
        object.add("A");
        object.add("B");


        String[] things = {"apple", "noobs", "pwnge", "bacon", "goAts"};
        List<String> list1 = new LinkedList<String>();

        for(String x: things) {
            list1.add(x);
        }

       String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
        List<String> list2 = new LinkedList();

        for(String y: things2) {
            list2.add(y);
        }

        list1.addAll(list2);
        list2 = null;

        System.out.print("List1 is: ");
        printMe(list1);
        System.out.println();

        System.out.println("After removing 2-5: ");
        removeStuff(list1, 2, 5);
        printMe(list1);
        System.out.println("=============");

        reverseMe(list1);
    }

    // printMe method
    private static void printMe(List<String> l) {
        for(String b: l) {
            System.out.println(b);
        }
    }

    // removeStuff method
    private static void removeStuff(List<String> l, int start, int end) {
        l.subList(start, end).clear();
    }

    // reverseMe method
    private static void reverseMe(List<String> l) {
        ListIterator<String> bobby = l.listIterator(l.size());
        while(bobby.hasPrevious()) {
            System.out.println(bobby.previous());

        }
    }



}
