import java.util.ArrayList;
import java.util.List;

public class Library {
    //Arraylist to store list of booksInStore
    private final List<Book> booksInStore = new ArrayList<>();

    //Method to add a book object
    public void addBook(Book book) {

        //Checking for no duplicates
        for (int i = 0; i < booksInStore.size(); i++) {
            if (booksInStore.get(i).getTitle().equals(book.getTitle())) {
                booksInStore.remove(i);
                booksInStore.add(book);
                return;
            }
        }
        //adding a book if no duplicates are found
        booksInStore.add(book);
    }


}
