public class MethodAndLoopExercise {
    public static void main(String[] args) {
        printNumbers1to10();
        printCarBrandsForeach();
        sumOfNumbersFrom1to100();
        evenNumbersBetween1to20();
        multiplicationTableUntil7x10();
    }

    private static void printNumbers1to10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    private static void printCarBrandsForeach() {
        String[] cars = {"Ford", "Honda", "Audi"};
        for (String car : cars) {
            System.out.println(car);
        }
    }

    private static void sumOfNumbersFrom1to100() {
        int count = 1;
        int sum = 0;
        while (count <= 100) {
            sum = sum + count;
            count++;
        }
        System.out.println(sum);
    }

    private static void evenNumbersBetween1to20() {
        for (int i = 0; i <= 20; i = i + 2) {
            System.out.println("Even number are " + i);
        }
    }

    private static void multiplicationTableUntil7x10() {
        int a = 7;
        for (int b = 1; b <= 10; b++) {
            System.out.println(a + " * " + b + " = " + (a * b));
        }
    }
}