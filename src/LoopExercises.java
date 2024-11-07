public class LoopExercises {
    public static void main(String[] args) {

        // Print numbers 1 to 10 using for
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Print out each car brand using foreach
        String [] cars = {"Ford", "Honda", "Audi"};
        for (String car : cars) {
            System.out.println(car);
        }

        // Sum of Numbers using while loop
        int count = 1;
        int sum = 0;
        while (count <=100) {
            sum = sum + count;
            count++;
        }
        System.out.println(sum);

        // Even Numbers Between 1 and 20 using
        for (int i = 0; i <= 20; i = i + 2) {
            System.out.println("Even number are " + i);
        }

        // Multiplication Table
        int a = 7;
        for (int b = 1; b <= 10; b++) {
            System.out.println(a + " * " + b + " = " + (a * b));
            }
        }
    }
