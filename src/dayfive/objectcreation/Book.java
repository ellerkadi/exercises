package dayfive.objectcreation;

public class Book {
    String title;
    String author;
    int yearPublished;

    public Book() {
        title = "Unknown";
        author = "Unknown";
        yearPublished = 1900;
    }

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    /*public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert Cecil Martin", 2008);
        Book book2 = new Book("Code Complete", "Steve McConnell", 1993);
        Book book3 = new Book();

        book1.displayDetails();
        System.out.println(" ");
        book2.displayDetails();
        System.out.println(" ");
        book3.displayDetails();
    }*/

    public void displayDetails() {
        System.out.println("Book details: ");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year published: " + yearPublished);

    }
}


