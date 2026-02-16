/**
 * Book: The responsibility for this class is to -
 * manage a single book in the System
 *
 * Matthew O'Connell Cantillon
 */
public class Book
{
    private String title = "Unknown";
    private String author = "Unknown";
    private String isbn = "Unknown";
    private boolean onLoan = false;
    public double rating = 0.0;
    public Book(String title, String author, String isbn){
        if (title.length() >10) {
            this.title = title.substring(0,10);
        }else{
            this.title = title;
        }
        if (author.length() > 20){
            this.author = author.substring (0,20);
        }else{
            this.author = author;
        }
        if (isbn.length() ==13){
            this.isbn = isbn;
        }else {
            this.isbn = "000000000000000";
        }
    }
    public void setTitle(String title){
        if (title.length() <=10) {
        this.title = title;
    }
}
    public void setAuthor(String author){
        if (author.length() <=20){
        this.author = author;
    }
}
    public void setIsbn(String isbn){
        if (isbn.length () == 13){
        this.isbn = isbn;
    }
}
    public void setRating(double rating){
        if (rating >= 0 && rating <=5){
        this.rating = rating;
    }
}
    public void setOnLoan(boolean onLoan){
        this.onLoan = onLoan;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }
    public double getRating(){
        return rating;
    }
    public boolean isOnLoan(){
        return onLoan;
    }
    
    public void returnBook(){
        onLoan = false;
    }
    public String toString(){
        return "Title: " + title + ", Author: " + author + ", ISBN: " +isbn + ", Rating: " + rating + ", On loan: " + onLoan;
    }
    
}
