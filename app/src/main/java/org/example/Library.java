package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    //Arraylist to store list of booksInStore
    private final List<Book> booksInStore = new ArrayList<>();

    //Method to add a book object
    public void addBook(Book book) {

        //Checking for no duplicates
        for (int i = 0; i < booksInStore.size(); i++) {
            if (booksInStore.get(i).getTitle().equals(book.getTitle()) && booksInStore.get(i).getAuthor().equals(book.getAuthor()) && booksInStore.get(i).getYearPublished() == book.getYearPublished()) {
                booksInStore.remove(i);
                booksInStore.add(book);
                System.out.println("This book has been added to the library");
                return;
            }
        }
        //adding a book if no duplicates are found
        booksInStore.add(book);
    }

    //Method to remove a book object
    public void removeBook(Book book) {
        boolean found = false;

        for (int i = 0; i < booksInStore.size(); i++) {
            if (booksInStore.get(i).getTitle().equals(book.getTitle()) && booksInStore.get(i).getAuthor().equals(book.getAuthor()) && booksInStore.get(i).getYearPublished() == book.getYearPublished()) {
                booksInStore.remove(i);
                System.out.println("This book has been removed from the library");
                found = true;
                return;
            }
        }

        if (!found) System.out.println("This book does not exist in the library");
    }

    //Method to search for a book
    public void searchBook(Book book) {
        boolean found = false;

        for (int i = 0; i < booksInStore.size(); i++) {
            if (booksInStore.get(i).getTitle().equals(book.getTitle()) && booksInStore.get(i).getAuthor().equals(book.getAuthor()) && booksInStore.get(i).getYearPublished() == book.getYearPublished()) {
                // print out the details of the found book
                System.out.println("Title: " + booksInStore.get(i).getTitle());
                System.out.println("Author: " + booksInStore.get(i).getAuthor());
                System.out.println("Year Published: " + booksInStore.get(i).getYearPublished());

                found = true;
                return;
            }
        }

        if (!found) System.out.println("This book does not exist in the library");
    }

    //Method to list all books
    public void listAllBooks() {
        for (Book book : booksInStore) {
        System.out.println(book); 
    }
    }

}
