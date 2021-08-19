package oneDimArr;
import java.util.Scanner;

public class UserInputStringArray {
    public static void main(String[] args) {
        //new object "ip"  of scanner class
        Scanner ip = new Scanner(System.in);

        //user-chosen array size will be stored in var n
        System.out.println("Enter size of array: ");
        int n = ip.nextInt();
        ip.nextLine(); //to read an input with spaces in between

        //declare new String array, w/ user input size [n]
        String[] arr = new String[n];

        /**
         * for loop to have user enter element value.
         * for the loop's boundary, can use var n OR arr.length
         */
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter String Array[" + i + "]: ");
            arr[i] = ip.nextLine();
        }

        System.out.println("Printing out array elements...");

        for (int j = 0; j < arr.length; j++) {
            System.out.println("Array[" + j + "]: "+ arr[j]);
        }
        ip.close();

    }



}
