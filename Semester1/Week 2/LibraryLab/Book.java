
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Book
{
    // Fields (attributes)
    private String title;
    private String author;
    private int pages;
    private int booksales;

    //Constructor and methods to be added
    //Constructor 
public Book()
{
    title = "Unknown";
    author = "Unknown";
    pages = 0;
    booksales = 0;
}

//method to print details
public void printDetails()
{
    System.out.println("Title: " + title + ", Author: "
     + author + ", Pages: " + pages + "BookSales: " +booksales);
}

//method to update Book
public void updateBookDetails(String bookTitleNew, String bookAuthorNew, int numPagesNew, int bookSalesNew)
{
    title = bookTitleNew;
    author = bookAuthorNew;
    pages = numPagesNew;
    booksales = bookSalesNew;
}

public String getTitle() {
    return title;
}
public void setTitle(String booktitleNew){
    title = booktitleNew;
}
public String getAuthor(){
    return author;
}
public void setAuthor(String authorNew){
    author = authorNew;
}
public int getPages(){
    return pages;
}
public void setPages(int pagesNew){
    pages = pagesNew;
}
public int getBookSales(){
    return booksales;
}
public void setBookSales(int booksalesNew){
    booksales = booksalesNew;
}
}

