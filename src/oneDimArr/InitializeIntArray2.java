package oneDimArr;

public class InitializeIntArray2 {

    public static void main(String[] args) {

        //alternate way: declare and initialize array in same step
        int[] arr = {1, 3, 5, 7, 3, 4, 2, 56, 4, 2, 3 };

        /*
        to print out elements of array, can use relative for-loop
        (ie: arr.length in loop-boundary)
        */
        for(int i = 0; i < arr.length; i++)
            System.out.println("Array[" + i + "]: "+ arr[i]);
    }
}
