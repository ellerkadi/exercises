import java.util.Arrays;

public class ArraysNäide {
    public static void main(String[] args) {
        String[] carBrand = {"Tesla", "Honda", "Audi"};
        String[] carModel = {"Model S", "Civic", "A3"};

        carModel[0] = "Model 3"; // kirjutab carModelis kohal 0 teksti üle

        Arrays.sort(carBrand);
        System.out.println(Arrays.toString(carBrand));

        carBrand[0] = "BMW"; // kirjutab carBrand kohal 0 teksti üle

        System.out.println(carBrand[0] + " " + carModel[0]);

        int[] m = new int[5];
        int length = m.length;
        System.out.println(length);
        System.out.println(m[0]);
        System.out.println(m[1]);
        System.out.println(m[2]);
        System.out.println(m[3]);
        System.out.println(m[4]);
        // System.out.println(m[5]); // out of bounds, sest array on 5 mitte 6

        int []  firstArray = new int[5];
        firstArray[0]++; // 0+1
        System.out.println(firstArray[0]);

        String [] secondArray = {"Tesla", "Honda", "Opel"};
        secondArray[0] = "BMW";
        System.out.println(secondArray[0]);
        System.out.println("Array: " +  Arrays.toString(secondArray));

    }
}
