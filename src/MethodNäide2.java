public class MethodNäide2 {
    public static void main(String[] args) {
        int age = 30;
        getPerson(age);
    }

    private static void getPerson(int age) {
        System.out.println("Checking user details: ");
        getName();
        checkUserAge(age);
    }

    private static void getName() {
        System.out.println("John");
    }

    private static void checkUserAge(int age) {
        if (age < 18) {
            System.out.println("You are younger than 18 years. Can't drive!");
        } else {
            boolean canDrive = true;
            getPermissionInfo(age, canDrive, "You can drive!");
        }
    }

    private static void getPermissionInfo(int age, boolean canDrive, String text) {
        if (canDrive) {
            System.out.println("Age is: " + age + ". " + text);
        }
    }

}
