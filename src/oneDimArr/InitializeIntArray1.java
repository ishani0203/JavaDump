package oneDimArr;

public class InitializeIntArray1 {
    public static void main(String[] args) {

        //declare an array of 5 integers
        int [] arr = new int[5];

        // initialize: assign values to each index
        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 19;
        arr[3] = 23;
        arr[4] = 12;

        // for-loop to print each index-value
        for (int i = 0; i < 5; i++) {
            System.out.println("Array[" + i + "]: " + arr[i]);
        }
        System.out.println();


        //for loop to find sum of array
        int sum = 0;
        for (int j = 0; j < 5 ; j++) {
            sum += arr[j];
            //print out sum at each addition
            System.out.println("sum of array at arr[" + arr[j] + "] = " + sum);
        }
        System.out.println();
        System.out.println("sum of entire array = "+ sum);

        /**
         * for-each loop: find total of all values in an array
         * temp var 'k' must be same type as array type
         */
        int total = 0;
        for(int k : arr)
            total += k;
        System.out.println("array total = " + total);
        System.out.println("pushing a change on git");
    }
}
