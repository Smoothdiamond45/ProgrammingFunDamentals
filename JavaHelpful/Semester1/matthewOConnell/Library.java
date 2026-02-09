/**
 * Library: The responsibility for this class is to -
 * manage a collection of books in the library system
 *
 * Matthew O'Connell Cantillon
 */
public class Library {
    private String libraryName;
    private Book[] books;
    private int bookCount;
    private int maxBooks;
    // i had forgotten that we had to name everything exactly the same as the brief, im 98% everything is correct
    public Library(String libraryName, int maxBooks) {
        this.libraryName = libraryName;
        this.maxBooks = maxBooks;
        this.books = new Book[maxBooks];
        this.bookCount = 0;
    }
    
    public int maxBooks(){
        return maxBooks;
    }
    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
    
    public String getLibraryName() {
        return libraryName;
    }
    
    public int getBookCount() {
        return bookCount;
    }
    
    public Book[] getBooks() {
        return books;
    }
    
    public void setBooks(Book[] books) {
        this.books = books;
    }
    
     public boolean addBook(Book book) {
        if (isFull()) {
            return false;
        }
        books[bookCount] = book;
        bookCount++;
        return true;
        }
    
    public Book findBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (isbn.equalsIgnoreCase(books[i].getIsbn())) {
                return books[i];
            }
        }
        return null;
    }
    
    public boolean borrowBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            book.setOnLoan(true);
            return true;
        }
        return false;
    }
    public boolean returnBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            book.setOnLoan(false);
            return true;
        }
        return false;
    }
    public boolean findaBook(String isbn){
        Book book = findBook(isbn);
        if (book != null) {
            return true;
        }
        return false;
    }
    
   public int countBooksOnLoan() {
    int count = 0;
    for (int i = 0; i < bookCount; i++) {
        if (books[i].isOnLoan()) {
            count++;
        }
    }
    return count;
}

public void listAvailableBooks() {
    System.out.println("Available Books in " + libraryName + ":");
    System.out.println("------------------------");
    for (int i = 0; i < bookCount; i++) {
        if (!books[i].isOnLoan()) {
            System.out.println(books[i]);
        }
    }
}
    
    public double calculateAverageRating() {
        if (bookCount == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (int i = 0; i < bookCount; i++) {
            sum += books[i].getRating();
        }
        return sum / bookCount;
    }
    
    public Book findHighestRatedBook() {
        if (bookCount == 0) {
            return null;
        }
        Book highest = books[0];
        for (int i = 1; i < bookCount; i++) {
            if (books[i].getRating() > highest.getRating()) {
                highest = books[i];
            }
        }
        return highest;
    }
    
    public String listAllBooks() {
        String listAllBooks = "";
        System.out.println("Library: " + libraryName);
        System.out.println("Total Books: " + bookCount);
        System.out.println("------------------------");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
        return listAllBooks;
    }
    
    public String toString() {
        return "Library: " + libraryName + 
               " | Books: " + bookCount + "/" + maxBooks;
    }
    
    public boolean isEmpty() {
        return bookCount == 0;
    }
    
    public boolean isFull() {
        return bookCount == maxBooks;
    }
}