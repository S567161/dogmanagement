package book;

public class BookDriver {
    public static void main(String[] args) {
        // Create two Book objects using the default constructor
        Book book1 = new Book("", ""); // Default constructor
        Book book2 = new Book("", ""); // Default constructor

        // Set data for book1 using setter methods
        book1.setTitle("The Catcher in the Rye");
        book1.setAuthor("J.D. Salinger");
        book1.setNbPages(224);

        // Set data for book2 using setter methods
        book2.setTitle("To Kill a Mockingbird");
        book2.setAuthor("Harper Lee");
        book2.setNbPages(346);

        // Displaying data for each book
        System.out.println("Book 1:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Number of Pages: " + book1.getNbPages());

        System.out.println("\nBook 2:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Number of Pages: " + book2.getNbPages());
    }
}

