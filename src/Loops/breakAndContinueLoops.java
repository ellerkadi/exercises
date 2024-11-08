package Loops;

public class breakAndContinueLoops {
    public static void main(String[] args) {

        firstEvenNumber();

        skipMultiplesOfFive();

        skipMultiplesOfSix();

        sumOfNonNegativeNumbers();

        firstNumberGreaterThan50();
    }

    private static void skipMultiplesOfSix() {
        // Print Multiples of 3 up to 30, skip multiples of 6

        int i = 3;
        for (int k = 1; (i * k) <= 30; k++) {
            int multiples = i * k;
            if (multiples % 6 != 0) {
                System.out.println(multiples);
                continue;

                // for (i = 3; i <=30; i += 3) - saab ühe if'i ära jätta ja korrutise ka // k % 6 == 0
            }
        }
    }

    private static void skipMultiplesOfFive() {
        // Print Odd Numbers from 1 to 20, skip multiples of 5
        for (int j = 1; j <= 20; j++) {
            if (j % 2 != 0) {
                if (j % 5 != 0) {
                    System.out.println(j);
                    continue;

                    // for (int i = 1; i <=20; i += 2) - saab ühe if'i ära jätta
                }
            }
        }
    }

    private static void firstEvenNumber() {
        // Find the First Even Number in a List
        int[] numbers = {1, 3, 7, 4, 9, 10};
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("First even number: " + number);
                break;
            }
        }
    }

    private static void sumOfNonNegativeNumbers() {
        // Print the Sum of Non-Negative Numbers Until a Negative Number is Found

        int[] numbers1 = {5, 12, 3, 7, -4, 8, 2};
        int sum = 0;
        for (int num : numbers1) {
            if (num < 0) {
                break;
            }
            sum += num;
        }
        System.out.println("Sum of non-negative numbers: " + sum);
    }

    private static void firstNumberGreaterThan50() {
        // Find the First Number Greater Than 50 in an Array

        int[] numbers2 = {23, 45, 39, 51, 48, 60};
        for (int num1 : numbers2) {
            if (num1 > 50) {
                System.out.println("First number greater than 50: " + num1);
                break;
            }
        }
    }
}

