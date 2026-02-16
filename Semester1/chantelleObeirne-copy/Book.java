/**
 * The Book class manages a single book in the system.
 */
public class Book {

    // 1. Attributes
    private String title;
    private String author;
    private String isbn;
    private boolean onLoan;
    private double rating;

    /**
     * Constructor for objects of class Book.
     * Applies truncation to title/author and validation to ISBN.
     */
    public Book(String title, String author, String isbn, boolean onLoan, double rating) {
        // Apply Validation
        // If input for title is greater than 10 the excess is cut off (truncated)
        if (title.length() > 10) {
            this.title = title.substring(0, 10);
        } else {
            this.title = title;
        }
        // If input for author is greater than 20, the excess is cut off (truncated)
        if (author.length() > 20) {
            this.author = author.substring(0, 20);
        } else {
            this.author = author;
        }

        // Apply ISBN Validation
        if (isbn == null || isbn.length() != 13) {
            this.isbn = "0000000000000";
        } 

        // onLoan is stored as a boolean, so doesnt need further validation
        this.onLoan = onLoan;
        
        // Ensure rating is valid (between 0.0 and 5.0 inclusive)
        if (rating >= 0.0 && rating <= 5.0) {
            this.rating = rating;
        }
    }

    // ====================================================================================
    // 2. Getter and Setter methods
    // getters are returning the value of the corresponding private attribute
    // setters are basically replicating the validation & truncation from the constructor
    // =====================================================================================

    public String getTitle() {
        return title;
    }

    // .substring is truncating (cuting off) excess after length of 10 
    public void setTitle(String newTitle) {
        if (newTitle.length() > 10) {
            this.title = newTitle.substring(0, 10);
    }
    }

    public String getAuthor() {
        return author;
    }

    // .substring is truncating (cuting off) excess after length of 20
    public void setAuthor(String newAuthor) {
        if (newAuthor.length() > 10) {
            this.author = newAuthor.substring(0, 20);
        } else {
            this.author = newAuthor;
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String newIsbn) {
        if (newIsbn != null && newIsbn.length() == 13) {
            this.isbn = newIsbn;

        }
    }
    
    public boolean isBookOnLoan() {
        return onLoan;
    }
    
    public void setBookOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }

    public double getAverageRating() {
        return rating;
    }

    public void setRating(double newRating) {
        if (newRating >= 0.0 && newRating <= 5.0) {
            this.rating = newRating;
        }
    }
    

}