public class Book {
//Initializing Variables
    private String title;
    private String author;
    private int yearPublished;
    private boolean isBorrowed = false;

    //Constructor Function
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    //Title Getter and Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Author Getter and Setter
    public String Author() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //YearPublished Getter and Setter
    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    //Method to borrow a book
    public String borrowBook() {
        if (isBorrowed) {
            return("This book is already borrowed");
        } else {
            isBorrowed = true;
            return("You have successfully borrowed the book");
        }
    }

    //Method to return a book
    public String returnBook() {
        if (!isBorrowed) {
            return("You did not borrow this book.");
        } else {
            isBorrowed = false;
            return("You have successfully returned the book");
        }
    }
}
