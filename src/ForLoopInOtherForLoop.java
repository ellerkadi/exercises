public class ForLoopInOtherForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(j);
                for (int k = 1; k <= 10; k++) {
                    System.out.println(k);
                }
            }
        }
    }
}
