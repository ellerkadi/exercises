public class CarExercise {
    public static void main(String[] args) {
        Car carInOtherClass = new Car();
        System.out.println(carInOtherClass.brand);

        Car carInOtherClass2 = new Car("Tesla", "", 2020);
        System.out.println(carInOtherClass2.brand);
    }
}
