public class MethodHarjutus {
    public static void main(String[] args) {
        int ristkülikuKülg1 = 4;
        int ristkülikuKülg2 = 5;
        getArea(ristkülikuKülg1, ristkülikuKülg2);
    }

        private static void getArea(int ristkülikuKülg1, int ristkülikuKülg2) {
        int ristkülikuPindala = ristkülikuKülg1 * ristkülikuKülg2;
        checkArea(ristkülikuPindala);
    }

    private static void checkArea(int ristkülikuPindala) {
        if (ristkülikuPindala > 20) {
            System.out.println("Area is bigger than 20");
        } else {
            System.out.println("Area is smaller than 20");
        }
    }
}
