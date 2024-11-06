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
        String lowercase = original1.toLowerCase();
        System.out.println(lowercase);

        // Check if String Contains a Substring

        String original2 = "Hello, world!";
        boolean stringContains = original2.contains("world");
        System.out.println(stringContains);

        // Get the First Character of a String

        String original3 = "Hello";
        char firstCharacter = original3.charAt(0);
        System.out.println(firstCharacter);

        // Replace a Character in a String

        String original4 = "Hello, world!";
        String regex = "o";
        String replacedCharacter = original4.replaceAll(regex, "a");
        System.out.println(replacedCharacter);

        // Check if a String Starts and Ends with a Specific Character
        String original5 = "Hello, world!";
        boolean specificCharacter = original5.startsWith("Hello") && original5.endsWith("world!");
        System.out.println(specificCharacter);

        // Extract a Substring Between Two Indices
        String original6 = "Hello, world!";
        String substring = original6.substring(7, 12);
        System.out.println(substring);

        // Find the First and Last Occurence of a Character

        String original7 = "abracadabra";
        char searchChar = 'a';

        int firstPosition = original7.indexOf(searchChar);
        int lastPosition = original7.lastIndexOf(searchChar);

        System.out.println("First position: " + firstPosition + " , Last position: " + lastPosition);

        // Replace a Word in a Sentence

        String original8 = "Java is fun";
        String target = "fun";
        String replacement = "awesome";
        String replaced = original8.replace(target, replacement);
        System.out.println(replaced);

    }
}
