import java.util.Scanner;

public class StringAndScanner {
    public static void main(String[] args) {

        // TASK 3 - String and variables

        String manager = "Kadi";
        String manager1 = "Aivi";
        String manager2 = "Merit";

        System.out.println(manager);
        int lengthOfManager = manager.length();
        System.out.println(lengthOfManager);

        // TASK 4 - Importing classes (kõige üleval), scanner

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = inputNumber.nextInt();
        System.out.println(n);

        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String m = inputName.next();
        System.out.println(m);
    }
}