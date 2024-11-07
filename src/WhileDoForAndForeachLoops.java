public class WhileDoForAndForeachLoops {
    public static void main(String[] args) {

        // WHILE LOOP
        int count = 1;
        /* while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
            System.out.println("Count is after count++: " + count);
        }
         */

        // DO LOOP
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count <= 5);

        // FOR LOOP
        for (int count1 = 1; count1 <=5; count1++) {
            System.out.println("Count is: " + count1);
        }

        // FOREACH LOOP
        String[] fruits = {"Apple", "Banana", "Orange", "Pineapple"};
        for (String fruit : fruits) {
            System.out.println("Fruit is: " + fruit);
        }
    }
}
