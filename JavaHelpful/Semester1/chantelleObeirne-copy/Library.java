/**
 * This class is essentially, the library 'manager' 
 * This class is responsible for adding and finding books in our library
 * It turns all the single book objects into a fully-functioning library system
 */
public class Library {

    // 1. Instance Variables (Fields)
    public String libraryName;
    private Book[] books;     // The fixed-size array of Book objects
    private int bookCount;    // The number of books currently in the library
    private int maxBooks;     // The maximum number of books that can be stored

    /**
     * Constructor for objects of class Library.
     */
    public Library(String libraryName, int maxBooks) {
        this.libraryName = libraryName;
        this.maxBooks = maxBooks;
        this.books = new Book[maxBooks];  
        this.bookCount = 0;    // Library starts empty
    }
    
    // =========================================================
    // 2. getter and setter methods
    // =========================================================

    // Getters and setters
    public void setLibraryName(String libraryName){
        this.libraryName = libraryName;
    }
    public String getLibraryName() {
        return libraryName;
    }
    
    public int maxBooks(){
        return maxBooks;
    }
    
    public int getBookCount() {
        return this.bookCount;
    }
    
    public Book[] getBooks() {
        return this.books;
    }
    
        public void setBooks(Book [] newBooks) {
        this.books = newBooks;
    }
    
    // other methods
    public boolean addBook(Book book) {
        if (book != null && !isFull()) {
            this.books[this.bookCount] = book;
            this.bookCount++;
            return true;
        }
        return false;
    }

    // finding book using isbn, returns null if isbn doesn't match to a book
    public Book findBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            if (book.getIsbn() == isbn) {
                return book;
            }
        }
        return null;
    }

    public boolean borrowBook(String isbn) {
        Book bookToBorrow = findBook(isbn);
        if (bookToBorrow != null && !bookToBorrow.isBookOnLoan()) {
            bookToBorrow.setBookOnLoan(true);
            return true;
        }
        return false;
    }
    public boolean returnBook(String isbn) {
        Book bookToBorrow = findBook(isbn);
        if (bookToBorrow != null && !bookToBorrow.isBookOnLoan()) {
            bookToBorrow.setBookOnLoan(false);
            return false;
        }
        return true;
    }
     public boolean findtheBook(String isbn){
        Book book = findBook(isbn);
        if (book != null) {
            return true;
        }
        return false;
    }
    
    public int countBooksOnLoan() {
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isBookOnLoan()) {
                count++;
            }
        }
        return count;
    }
    
    // calculating and returning the avg rating of all books that have rating of 1.0 or higher
    // returns 0.0 if no books have been rated 
    public double calculateAverageRating() {
        double total = 0; // sum of all valid book ratings 
        int ratedCount = 0; // int to count how many books actually have a valid rating
        for (int i = 0; i < bookCount; i++) {
            double rating = books[i].getAverageRating();

            if (rating >= 1.0) { // Only counting books with a valid rating
                total += rating;
                ratedCount++;
            }
        }
        return ratedCount > 0 ? total / ratedCount : 0.0;
    }
    
    // goes through all books to find and return specific book object that has highest avg rating
    public Book findHighestRatedBook() {
        Book highest = null; // holds highest rating so far, null because no books have been checked yet
        double maxRating = -1.0; // stores acyual highest rating, -1.0 beacuse its lower than the lowest valid rating
        for (int i = 0; i < bookCount; i++) { // i is first book (index i = 0)
            // loop continues as long as i is less than bookCount, which is n.o. valid books in books array
            double rating = books[i].getAverageRating();
            if (rating > maxRating) {
                maxRating = rating;
                highest = books[i];
            }
        }
        return highest;
    }

    // 
    public String listAllBooks() {
        if (isEmpty()) { // checking if library has any books
         return "\nLibrary is empty. There are no books.";
        }
        String result = "\nAll Books in " + libraryName + " \n";
        for (int i = 0; i < bookCount; i++) { // ensures every valid book is counted 
         result = result + (i + 1) + books[i].toString() + "\n";
         // takes current list text and adds new line containing a string representation of the book at the current index
        }
        return result;
    }
    
    // creates and returns string that lists only books in the library that are not currently on loan
    public String listAvailableBooks() {
        String result = "\nAvailable Books in " + libraryName + "\n";
        boolean found = false;
        for (int i = 0; i < bookCount; i++) { // checks every book in the library, continuing up to total count of books
            if (!books[i].isBookOnLoan()) { //the code inside if only runs if the book is nt on loan
              result = result + books[i].toString() + "\n";
             found = true; // indicates at least one available book haas been found
            }
        }
        return result;
    }
    
    public boolean isEmpty() {
        return bookCount == 0;
    }

    public boolean isFull() {
        return bookCount == this.maxBooks;
    }

    
}