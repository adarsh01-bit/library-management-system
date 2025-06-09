package com.librarymanagement;

import com.librarymanagement.model.Book;
import com.librarymanagement.service.BookService;
import com.librarymanagement.util.InputValidator;
import com.librarymanagement.util.ConsolePrinter;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final BookService bookService = new BookService();

    public static void main(String[] args) {
        int choice;
        do {
            ConsolePrinter.printHeader("Library Menu");
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. List All Books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> deleteBook();
                case 3 -> issueBook();
                case 4 -> returnBook();
                case 5 -> searchBook();
                case 6 -> bookService.listBooks();
                case 0 -> System.out.println("Exiting the application. Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    private static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (!InputValidator.isValidId(id)) {
            System.out.println("Invalid Book ID.");
            return;
        }

        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        if (!InputValidator.isValidString(title)) {
            System.out.println("Invalid title.");
            return;
        }

        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();
        if (!InputValidator.isValidString(author)) {
            System.out.println("Invalid author name.");
            return;
        }

        Book book = new Book(id, title, author);
        bookService.addBook(book);
    }

    private static void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        int id = scanner.nextInt();
        bookService.deleteBook(id);
    }

    private static void issueBook() {
        System.out.print("Enter Book ID to issue: ");
        int id = scanner.nextInt();
        bookService.issueBook(id);
    }

    private static void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int id = scanner.nextInt();
        bookService.returnBook(id);
    }

    private static void searchBook() {
        System.out.print("Enter Book ID to search: ");
        int id = scanner.nextInt();
        bookService.searchBook(id);
    }
}