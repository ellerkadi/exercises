public class MethodNäide1 {
    public static void main(String[] args) {
    printHello();
    }

    //Korduvad koodi osad võiks panna eraldi meetodisse

    private static void printHello() {
        boolean isTrue = true;
        System.out.println("Hello");
        if (isTrue) {
            getName();
        }
    }

    private static void getName() {
        boolean isTrue = false;
        int number = 5;
        String text = "Sinu õige parool";
        System.out.println("Kadi");
        if (isTrue) {
            System.out.println("Is true");
            getPassword();
        } else {
            System.out.println("Is false");
            getPassword(number, text);
        }
    }

    private static void getPassword() {
        System.out.println("Password");
    }

    // METHOD OVERLOADING
    private static void getPassword(int number, String text) {
        System.out.println("Password: " + number);
        System.out.println(text);
    }
}
