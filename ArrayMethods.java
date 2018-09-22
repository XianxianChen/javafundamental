import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {

        // declare an array:

        int[] randomArray;

        int[] numberArray = new int[10];

        randomArray = new int[20];
        randomArray[1] = 1;

        String[] stringArray = {"just", "random", "array"};

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
            System.out.print("|" + i + " ");
        }

        System.out.println(numberArray); // printing the memory index of the numberArray

         // Two dimensional Array
        String[][] multiArray = new String[10][10];
        for (int i = 0; i < multiArray.length; i++) {
           for(int j = 0; j < multiArray[i].length; j++) {

               multiArray[i][j] = i + " " + j;
              // System.out.println("|" + multiArray[i][j] + " ");
           }

        }

        for(int row: numberArray) {
            System.out.println(row);
        }

        for (String[] rows: multiArray) {
            for (String column: rows) {
                System.out.println(column);
            }
        }

       String str;
        //str = 1; //errer: 1 can not convert to java.lang.String
        str = 1 + "";
        System.out.println(str); // string type 1

        int[] numberCopy = Arrays.copyOf(numberArray, 5);
        int[] anotherCopy = Arrays.copyOf(numberArray, 8);

        int[] copyArr = Arrays.copyOfRange(numberArray, 3, 6);
        System.out.println(Arrays.toString(copyArr));

        int[] numberTwos = new int[10];
        Arrays.fill(numberTwos, 2);

        //int[] unknownLength = new int[]; //Error: java: array dimension missing

        char[][] boardGame = new char[10][10];
        for(char[] row: boardGame) {
            Arrays.fill(row, '*');
        }
        System.out.println(Arrays.toString(boardGame[0]));

        int[] numToSort = new int[10];
        for(int i = 0; i < 10; i++) {
            numToSort[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numToSort));
        Arrays.sort(numToSort);
        System.out.println(Arrays.toString(numToSort));

        int whereIs50 = Arrays.binarySearch(numToSort, 50); // if 50 exists in the array then assign positive number; other wise negative number
        System.out.println(whereIs50);








    }



}
