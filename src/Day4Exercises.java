import java.util.Arrays;

public class Day4Exercises {
    public static void main(String[] args) {

        // Find the First Even Number in a List
        int[] numbers = {1, 3, 7, 4, 9, 10};
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
                break;
            }
        }

        // Print Odd Numbers from 1 to 20, skip multiples of 5
        for (int j = 1; j <= 20; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
            if (j == 5 || j == 10 || j == 15 || j == 20) {
                continue;
            }
            System.out.println(j);
        }

            // Print Multiples of 3 up to 30, skip multiples of 6

        for () {

        }
    }
}

