package book;

public class Book {
   
	private String title;
    private String author;
    private int nbPages;

    // Constructor to initialize title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
 // Getter method for title
    public String getTitle() {
        return title;
    }

    // Setter method for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter method for author
    public String getAuthor() {
        return author;
    }

    // Setter method for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter method for nbPages
    public int getNbPages() {
        return nbPages;
    }

    // Setter method for nbPages
    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }
    
}
