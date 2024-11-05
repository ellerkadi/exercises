import java.util.Scanner;

public class DayOneAndDayTwoExercises {
    public static void main(String[] args) {
        // Hello World

        /* System.out.println("Hello, World!");

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

        // Greatest Number (scanner, if)

        Scanner userInput4 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int fourthNumber = userInput4.nextInt();

        Scanner userInput5 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int fifthNumber = userInput5.nextInt();

        Scanner userInput6 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int sixthNumber = userInput6.nextInt();

        if (fourthNumber > fifthNumber && fourthNumber > sixthNumber) {
            System.out.println("Greatest number is " + fourthNumber);
        } else if (fifthNumber > fourthNumber && fifthNumber > sixthNumber) {
            System.out.println("Greatest number is " + fifthNumber);
        } else {
            System.out.println("Greatest number is " + sixthNumber);
        }
        */

        /* int suurimNumber = fourthNumber > fifthNumber && fourthNumber > sixthNumber ? fourthNumber : fifthNumber > fourthNumber && fifthNumber > sixthNumber ? fifthNumber : sixthNumber;
            System.out.println("Greatest number is: " + suurimNumber);

         */

        // Convert to Uppercase

        String original = "hello world";
        System.out.println(original.toUpperCase());

        // Convert to Lowercase

        String original1 = "HELLO WORLD";
        System.out.println(original1.toLowerCase());

        // Check if String Contains a Substring

        String original2 = "Hello, world!";
        System.out.println(original2.contains("world"));

        // Get the First Character of a String

        String original3 = "Hello";
        System.out.println(original3.charAt(0));

        // Replace a Character in a String

        String original4 = "Hello, world!";
        String regex = "o";
        System.out.println(original4.replaceAll(regex, "a"));

        // Check if a String Starts and Ends with a Specific Character
        String original5 = "Hello, world!";
        System.out.println(original5.startsWith("Hello") && original5.endsWith("world!"));

        // Extract a Substring Between Two Indices
        String original6 = "Hello, world!";
        System.out.println(original6.substring(7, 12));

        // Find the First and Last Occurence of a Character

        String original7 = "abracadabra";
        System.out.println("First position: " + original7.indexOf("a") + " , Last position: " + original7.lastIndexOf("a"));

        // Replace a Word in a Sentence

        String original8 = "Java is fun";
        System.out.println(original8.replace("fun", "awesome"));

    }
}
