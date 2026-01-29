import java.util.Scanner;
/**
 * This driver class is just reading in all the data, and outputting to the user
 * It is the only class that has a System.out.print, and it runs and prints our menu
 */
public class LibraryDriver2 {

    // 1. Attributes
    private Scanner input = new Scanner(System.in);       // Scanner object for reading from the user
    private Library lib;         // The Library object (the main logic/data holder)
    
    public static void main(String[] args) {
        new LibraryDriver2();
    }
    
    public LibraryDriver2() {
       chooseOption();
       optionChoice();
    }
    
    private void chooseOption() {
        System.out.println("Welcome, Please enter the name of the Library: ");
        String libraryName = input.nextLine();
        int capacity = 0;
        System.out.println("Enter the maximum number of books that the library can hold: ");
        int maxBooks = input.nextInt();
        lib = new Library(libraryName, maxBooks);
    }
    
    private int displayMenu() {
        System.out.println("\n==== " + lib.libraryName + " Menu ====");
           System.out.println("""
        1. Add a new book
        2. Borrow a book
        3. Return a book
        4. Rate a book
        5. List all books
        6. List available books
        7. Show average rating
        8. Show highest-rated book
        9. Exit
        Enter option: 
        """);
        int option = input.nextInt();
        return option;
    }

    public void optionChoice() {
        int option = displayMenu();
        while (option !=9) {
            switch(option){
                case 1 -> addBook();
                case 2 -> borrowBook();
                case 3 -> returnBook();
                case 4 -> rateBook();
                case 5 -> listAllBooks();
                case 6 -> listAvailableBooks();
                case 7 -> showAvgRating();
                case 8 -> showHighRating();
            }
            option = displayMenu();
        }

    }
    public void addBook(){
            System.out.println("\n--- Add New Book ---");
            
            System.out.print("Enter book title: ");
            String title = input.nextLine();

            System.out.print("Enter book author: ");
            String author = input.nextLine();

            System.out.print("Enter ISBN: ");
            String isbn = input.nextLine();

            Book newBook = new Book(title, author, isbn, false, 0.0);

            if (lib.addBook(newBook)) {
                System.out.println("Book '" + newBook.getTitle() + "' added successfully.");
            } else {
                System.out.println("Error: Could not add book. The library might be full (Max: " + lib.maxBooks() + " books).");
            }

        }
    public void borrowBook(){

            System.out.println("\n--- Borrow a Book ---");
            
            System.out.print("Enter ISBN of the book to borrow: ");
            String isbn = input.nextLine();
            
            if (lib.borrowBook(isbn)) {
                System.out.println("Book with ISBN " + isbn + " successfully borrowed.");
            } else {
                System.out.println("Error: Book not found or already on loan.");
            }
        }
    public void returnBook(){
            System.out.println("\n--- Return a Book ---");
            
            System.out.print("Enter ISBN of the book to return: ");
            String isbn = input.nextLine();
            
            if (lib.returnBook(isbn)) {
                System.out.println("Book with ISBN " + isbn + " successfully returned.");
            } else {
                System.out.println("Error: Book not found or was not on loan.");
            }

        } 
        public void rateBook(){
            System.out.println("\n--- Rate a Book ---");
            System.out.println(lib.listAllBooks());
            System.out.println("Enter the ISBN of the book you want to rate: ");
            String isbn = input.nextLine();
            System.out.println("Enter new rating (0.0 to 5.0): ");
            double rating = input.nextDouble();
            boolean success = lib.findtheBook(isbn);
            if (rating >= 0.0 && rating <= 5.0) {
                if (success) {
                    System.out.println("Successfully updated the rating for the book with ISBN: " + isbn);
                } else {
                    System.out.println("Error: Book not found with ISBN: " + isbn);
                }
            } else {
                System.out.println("Error: Rating must be between 0.0 and 5.0.");
            }

        }
    public void listAllBooks(){
            System.out.println(lib.listAllBooks()); 

        }
    public void listAvailableBooks(){
        System.out.println(lib.listAvailableBooks());
           
    }
        public void showAvgRating(){
            System.out.println("\n--- Average Rating ---");
            double avg = lib.calculateAverageRating();
            System.out.println("The average rating for the library is: " + String.format("%.2f", avg) + " stars.");
            
        } 
     public void showHighRating(){
            System.out.println("\n--- Highest-Rated Book ---");
            Book highest = lib.findHighestRatedBook();
            
            if (highest != null) {
                System.out.println("The highest rated book is:");
                System.out.println(highest.toString());
            } else {
                System.out.println("No books found or rated in the library.");
            }

        }
        // Note: Option 9 (Quit) is handled by the runMenu() loop itself.
    }
