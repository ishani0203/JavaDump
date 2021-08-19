package oneDimArr;
import java.util.Scanner;

public class UserInputIntArray {
    public static void main(String[] args) {
        //new object "ip"  of scanner class
        Scanner ip = new Scanner(System.in);

        //user-chosen array size will be stored in var n
        System.out.println("Enter size of array: ");
        int n = ip.nextInt();

        //declare new integer array, w/ user input size [n]
        int[] arr = new int[n];

        //user will also choose values for array (upto index < n)
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Array[" + i + "]: ");
            arr[i] = ip.nextInt();
        }

        System.out.println("Printing out array elements...");

        for (int j = 0; j < arr.length; j++) {
            System.out.println("Array[" + j + "]: "+ arr[j]);
        }
    }
}
