import java.util.Scanner;

public class StringAndScannerAndStringBuilder {
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

        // TASK 5 - Immutible string

        /* StringBuilder sb = new StringBuilder("Hello");
        sb.append("!");
        System.out.println(sb);

        String string = String.valueOf(sb);
        String string = sb.toString();
        System.out.println(string);

         */

        String aadress = "Aadress Tallinn, kesklinn";
        StringBuilder sb = new StringBuilder(aadress);
        sb.append(", tänav");

        String string = sb.toString();
        System.out.println(string);

    }
}