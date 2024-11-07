import java.util.Arrays;

public class ArraysExercise {
    public static void main(String[] args) {

        // Declare and Initialize an Array

        int[] Array1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(Array1));

        // Access Specific Elements
        int[] Array2 = {10, 20, 30, 40, 50};
        System.out.println(Array2[2]);

        // Modify an Element
        int[] Array3 = {5, 10, 15, 20};
        Array3[1] = 12;
        System.out.println(Arrays.toString(Array3));

        // Array Length Property
        int[] Array4 = {8, 6, 7, 5, 3, 0, 9};
        int length = Array4.length;
        System.out.println(length);

        // Sum of Elements (Without Loop)
        int[] Array5 = {4, 2, 8, 1, 6};
        int sum = Array5[0] + Array5[1] + Array5[2] + Array5[3] + Array5[4];
        System.out.println(sum);

    }
}
