package org.example;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    // Defining Variables
    private String name;
    private String id;
    private int maxBooksAllowed = 5;
    private final List<Book> borrowedBooks = new ArrayList<>();

    //Constructor to create a Patron
    public Patron(String name, String id) {
        this.name = name;
        this.id = id;
    }

    //Getter and Setter for the name variable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter for ID, once a patron has an ID, there will not be a need to change it
    public String getId() {
        return id;
    }

    public void borrowBook(Book book) {
        if (borrowedBooks.size() >= maxBooksAllowed) {
            System.out.println("You can't borrow more than" + maxBooksAllowed + "books");
        } else if (book.getIsBorrowed()) {
            System.out.println("Sorry, this book is already borrwed.");
        } else {
            borrowedBooks.add(book);
            System.out.println("You have successfully borrowed the book: " + book.getTitle());
            book.setIsBorrowed();
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setIsBorrowed();
        } else {
            System.out.println("Sorry, this book is not borrowed.");
        }
    }

    public void listBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("You have not borrowed any books");
        } else {
            System.out.println("These are the books you have borrowed:");
            for (Book book : borrowedBooks) {
                System.out.println("Title: " + book.getTitle());
            }
        }
    }




}
