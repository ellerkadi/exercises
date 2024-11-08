public class Car {
    String brand;
    String model;
    int year;

    public Car() { // default constructor, väärtusi saab hiljem üle kirjutada
        brand = "Not specified";
        model = "Unknown";
        year = 2000;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "Model S", 2020);

        Car car2 = new Car("Honda", "CRV", 2018);

        car1.displayDetails();
        System.out.println(" ");
        car2.displayDetails();
    }

    /* TEINE VARIANT EELNEVA KIRJUTAMISEKS
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Honda";
        car1.model = "CRV";
        car1.year = 2018;

        Car car2 = new Car();
        car2.brand = "Tesla";
        car2.model = "Model S";
        car2.year = 2020;

        car1.displayDetails();
        System.out.println(" ");
        car2.displayDetails();
    }*/

    private void displayDetails() {
        System.out.println("Car details: ");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);

    }

    @Override // põgusalt vaatasime
    public String toString() {
        return "Car [Brand=" + brand + ", Model=" + model + ", Year=" + year + "]";
    }

}
