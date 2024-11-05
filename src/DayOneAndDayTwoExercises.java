import java.util.Scanner;

public class DayOneAndDayTwoExercises {
    public static void main(String[] args) {
        // Hello World

        System.out.println("Hello, World!");

        // Simple Calculator (scanner)

        Scanner userInput1 = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = userInput1.nextInt();

        Scanner userInput2 = new Scanner(System.in);
        System.out.println("Enter second number: ");
        int secondNumber = userInput2.nextInt();

        int addTogether = firstNumber + secondNumber;
        int subtract = firstNumber - secondNumber;
        int divide = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;
        int multiply = firstNumber * secondNumber;

        System.out.println("firstNumber + secondNumber = " + addTogether);
        System.out.println("firstNumber - secondNumber = " + subtract);
        System.out.println("firstNumber / secondNumber = " + divide);
        System.out.println("firstNumber % secondNumber = " + remainder);
        System.out.println("firstNumber / secondNumber = " + multiply);

        // ODD or EVEN (scanner)

        Scanner userInput3 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int thirdNumber = userInput3.nextInt();

        if (thirdNumber % 2 == 0) {
            System.out.println("Number " + thirdNumber + " is even.");
        } else {
            System.out.println("Number " + thirdNumber + " is odd.");
        }
    }
}
