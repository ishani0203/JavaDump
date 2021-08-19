package oneDimArr;

public class InitializeStringArray2 {
    public static void main(String[] args) {

        //declare and assign values in array in the same step
        //use backslash(\") to include quotes in output
        String[] arr = { "outline", "arrays", "mixed", "no idea", "\"Hello\"" };

        //output values
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array[" + i + "]: "+ arr[i]);
        }
    }
}
