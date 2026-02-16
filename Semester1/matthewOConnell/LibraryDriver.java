import java.util.Scanner;
/**
 * LibraryDriver: The responsibility for this class is to -
 * manage the User Interface (UI) i.e. the menu and user input/output.
 *
 * Matthew O'Connell Cantillon
 */
public class LibraryDriver
{
    private Scanner input = new Scanner(System.in);
    public Library library;
    public static void main(String[] args){
        new LibraryDriver();
    }
    
    public LibraryDriver() {
        bookAmount();
        runMenu();
    }
    
    private int mainMenu(){
        System.out.println("""
        ==== Library Menu ====
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
        input.nextLine();
        return option;
    }
    private void bookAmount(){
        System.out.println("Whats the name of the libray");
        String libraryName = input.nextLine();
        
        System.out.println("How many books would you like");
        int maxBooks = input.nextInt();
        library = new Library(libraryName, maxBooks);
    }
    private void runMenu(){
        int option = mainMenu();
        while (option != 9){
            switch (option){
                case 1 -> addBook();
                case 2 -> borrowBook();
                case 3 -> returnBook();
                case 4 -> rateBook();
                case 5 -> listBook();
                case 6 -> listavailBook();
                case 7 -> showavgBook();
                case 8 ->showhighBook();
            }
            System.out.println("\nPlease press enter to continue");
            input.nextLine();
            option = mainMenu();
    }
    System.out.println("Shutting down");
}
private void addBook(){    
    System.out.println("Entering Book Details");
    System.out.println("------------------------");
    
    System.out.print("Enter the Book's name: ");
    String title = input.nextLine();
    
    System.out.print("Enter the Books author: ");
    String author = input.nextLine();
    
    System.out.print("Enter the Books ISBN (13 characters): ");
    String isbn = input.nextLine();
    
    boolean isAdded = library.addBook(new Book(title, author, isbn));
    
    if (isAdded){
        System.out.println("Book Added Successfully");
    }
    else{
        System.out.println("No Book Added - Library is Full");
    }
}

private void borrowBook(){
    System.out.println("Entering Book Details");
    System.out.println("------------------------");
    
    System.out.println("Enter the ISBN of the book you want to borrow");
    String isbn = input.nextLine();
    
    boolean success = library.borrowBook(isbn);
    if (!success){
        System.out.println("Sorry no book was found or its on loan");
    } else {
        System.out.println("Book borrowed sucessfully");
    }
}
private void returnBook(){
    System.out.println("Returning Books");
    System.out.println("------------------------");
    
    System.out.println("Enter the ISBN of the book you want to return");
    String isbn = input.nextLine();
    
    boolean success = library.returnBook(isbn);
    if (success){
        System.out.println("Book returned successfully");
    } else {
        System.out.println("Book not returned, please try again");
    }
}
private void rateBook(){
    System.out.println("Rating Books");
    System.out.println("------------------------");
    
    System.out.println(library.listAllBooks());
    System.out.println("Enter the ISBN of the book you want to rate");
    String isbn = input.nextLine();
    
    boolean success = library.findaBook(isbn);
    if (success){
         System.out.print("Enter your rating for this book 1-5: ");
        double rating = input.nextDouble();
        library.findBook(isbn).setRating(rating);
    } else {
        System.out.println("Book not found");
    }
    
}
private void listBook(){
    System.out.println("Listing all Books");
    System.out.println("------------------------");
    
    System.out.println(library.listAllBooks());
}
private void listavailBook(){
    System.out.println("Listing Available Books");
    System.out.println("------------------------");
    
    library.listAvailableBooks();
}
private void showavgBook(){
    System.out.println("Average rated Books ");
    System.out.println("------------------------");
    
    System.out.println(library.listAllBooks());
    System.out.println(library.calculateAverageRating());
}
private void showhighBook(){
    System.out.println("Highly rated Books");
    System.out.println("------------------------");
    
    System.out.println(library.listAllBooks());
    System.out.println(library.findHighestRatedBook());
}
}
