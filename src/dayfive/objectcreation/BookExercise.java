package dayfive.objectcreation;

public class BookExercise {

    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert Cecil Martin", 2008);
        Book book2 = new Book("Code Complete", "Steve McConnell", 1993);
        Book book3 = new Book();

        book1.displayDetails();
        System.out.println(" ");
        book2.displayDetails();
        System.out.println(" ");
        book3.displayDetails();
    }
}
