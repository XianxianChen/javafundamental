import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hello World".toUpperCase());

        String gotToQuote = "He said, \"I'm here\"";
        String otherQuoteSimbol = "hi, new line \nhow are you? back space\b back slash\\I'm fine";
        System.out.println(otherQuoteSimbol);
        String s = "WORD";
        String s1 = "word";
        System.out.println(s.toLowerCase());

        if (s1.startsWith("word")) // case sensitive
        {
            System.out.println("s1 starts with word lolowole");
        }
        if (s1.endsWith("hello")) {
            System.out.println("s1 ends with hello");
        }

        if (s.equals(s1)) { //case sensitive
            System.out.println("s is equal to s1");
        }
        if (s.equalsIgnoreCase(s1)) { //case sensitive
            System.out.println("s is equal to s1 ignoring case");
        }

        // adding string to string
        System.out.println(s.concat(s1));

        System.out.println(s.charAt(3)); // return 'd'

        s.indexOf('r'); // return the first index of char

        String helloWorld = "Helo lo lo world";

        int index = helloWorld.indexOf('l', 4) ; // the first index of l after index 4
        System.out.println("the first index of l after index 4  " + index);

       System.out.println(helloWorld.substring(3)); //return "o lo lo world"  cut substring from index 3

        System.out.println(helloWorld.substring(2, 10)); // substring from startIndex to endIndex

        System.out.println(helloWorld.replace('l', 'r'));

        System.out.println("     hello  there    ".trim()); // cut space of the front, and the end

        String letters = "abcde";
        String moreLetters = "fghijk";

        System.out.println(letters.compareTo(moreLetters));// compare base on alphabetical order

        letters.contains("abc");

        String[] letterArray = "a,b,c,d,e".split(",");

        System.out.println(Arrays.toString(letterArray));

        char[] charArray = letters.toCharArray();
        System.out.println(Arrays.toString(charArray));


        // String: every time when modifying the string, the computer would just create a new copy and make change to the new copy. this is time consuming.

        // StringBuilder: reference type - doesn't recreate the string, just use it over and over again; Everytime when changes made to the string, it will change the original indexed string.

        // create a StringBuilder it will provide a centain amount of space in memory.
        StringBuilder randSB = new StringBuilder("A random value");

        System.out.println(randSB.append(" again")); //out: A random value again

        System.out.println(randSB); //out: A random value again

        System.out.println(randSB.delete(10, 21)); //out: A random v

        // create a StringBuilder it will provide a centain amount of space in memory.
        // To find out how much the memory:
        System.out.println(randSB.capacity()); // 30:  is different from the length
        System.out.println(randSB.length()); // 10
        randSB.ensureCapacity(60); // ensure at least 60 bytes size amount of memory is allocated for ranSB
        System.out.println(randSB.capacity()); // 62
        randSB.trimToSize(); //
        System.out.println(randSB.capacity()); // 10

        // insert string to a stringBuilder
        System.out.println(randSB.insert(1, "nother"));

        // convert stringBuilder to a string
        String oldS = randSB.toString();
        System.out.println("last index of v is " + oldS.lastIndexOf('o'));
    }
}
