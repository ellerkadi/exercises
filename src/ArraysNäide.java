import java.util.Arrays;

public class ArraysNäide {
    public static void main(String[] args) {
        String[] carBrand = {"Tesla", "Honda", "Audi"};
        String[] carModel = {"Model S", "Civic", "A3"};

        carModel[0] = "Model 3"; // kirjutab carModelis kohal 0 teksti üle

        Arrays.sort(carBrand);
        System.out.println(Arrays.toString(carBrand));

        carBrand[0] = "BMW"; // kirjutab carBrand kohal 0 teksti üleZ

        System.out.println(carBrand[0] + " " + carModel[0]);

    }
}
