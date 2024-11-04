public class IfConditions {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;

        // TASK 1 - IF, ELSE IF, ELSE

        if (b > a) {
            System.out.println("b is bigger than a");
        } else if (a > b) {
            System.out.println("a is bigger than b");
        } else {
            System.out.println("a and b are equal");
        }

        // TASK 2 - && (AND) // (OR)

        if (a<b && a>0) {
            System.out.println("b is bigger than a, and a is positive");
        } else if (a>b && b>0) {
            System.out.println("a is bigger than b, and b is positive");
        } else if (a==b || (a<0 && b<0)) {
            System.out.println("a and b are either equal or both are negative");
        } else {
            System.out.println("No conditions were met");
        }

    }
}
