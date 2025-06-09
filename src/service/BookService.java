package com.librarymanagement.service;

import com.librarymanagement.model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookService {
    private List<Book> books;

    public BookService() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(" Book added successfully.");
    }

    public void deleteBook(int id) {
        Book book = findBookById(id);
        if (book != null) {
            books.remove(book);
            System.out.println(" Book deleted successfully.");
        } else {
            System.out.println(" Book not found.");
        }
    }

    public void issueBook(int id) {
        Book book = findBookById(id);
        if (book != null) {
            if (!book.isIssued()) {
                book.setIssued(true);
                System.out.println(" Book issued successfully.");
            } else {
                System.out.println(" Book is already issued.");
            }
        } else {
            System.out.println(" Book not found.");
        }
    }

    public void returnBook(int id) {
        Book book = findBookById(id);
        if (book != null) {
            if (book.isIssued()) {
                book.setIssued(false);
                System.out.println(" Book returned successfully.");
            } else {
                System.out.println("ℹ Book was not issued.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }

    public void searchBook(int id) {
        Book book = findBookById(id);
        if (book != null) {
            System.out.println(" Book found:\n" + book);
        } else {
            System.out.println(" Book not found.");
        }
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println(" No books in the library.");
        } else {
            System.out.println("All Books in Library:");
            books.forEach(System.out::println);
        }
    }

    private Book findBookById(int id) {
        return books.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElse(null);
    }
}