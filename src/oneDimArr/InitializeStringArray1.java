package oneDimArr;

public class InitializeStringArray1 {
    public static void main(String[] args) {
        //declare String array of 5 elements
        String[] arr = new String[5];

        //assign values to each index
        arr[0] = "Object";
        arr[1] = "mutable";
        arr[2] = "binary";
        arr[3] = "Navigate";
        arr[4] = "Help";

        //print out each element, relative to array's length
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array[" + i + "]: "+ arr[i]);
        }
    }
}
