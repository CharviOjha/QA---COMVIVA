package com.junit;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class LibraryCatalogTest {

    @Test
    public void testAddBook() {
        LibraryCatalog library = new LibraryCatalog();
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        library.addBook(book);

        List<Book> books = library.getBooks();
        assertEquals(1, books.size());
        assertEquals(book, books.get(0));
    }

    @Test
    public void testBorrowBook() {
        LibraryCatalog library = new LibraryCatalog();
        Book book = new Book("To Kill a Mockingbird", "Harper Lee");

        library.addBook(book);
        library.borrowBook("To Kill a Mockingbird");

        assertFalse(library.getBooks().get(0).isAvailable());
    }

    @Test
    public void testReturnBook() {
        LibraryCatalog library = new LibraryCatalog();
        Book book = new Book("1984", "George Orwell");

        library.addBook(book);
        library.borrowBook("1984");
        library.returnBook("1984");

        assertTrue(library.getBooks().get(0).isAvailable());
    }

    @Test
    public void testReturnNonBorrowedBook() {
        LibraryCatalog library = new LibraryCatalog();
        Book book = new Book("Pride and Prejudice", "Jane Austen");

        library.addBook(book);
        library.returnBook("Pride and Prejudice");

        // No change in availability since the book was not borrowed
        assertTrue(library.getBooks().get(0).isAvailable());
    }

    @Test
    public void testBorrowNonExistingBook() {
        LibraryCatalog library = new LibraryCatalog();

        // Borrowing a non-existing book should have no effect
        library.borrowBook("Nonexistent Book");

        assertTrue(library.getBooks().isEmpty());
    }
}
