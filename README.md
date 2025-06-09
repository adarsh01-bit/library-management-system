# Library Management System (Java Console-Based)

A simple and structured **console-based Java application** to manage books and users in a library. This project supports adding, deleting, issuing, returning, and searching books,
along with basic user management. It uses in-memory data structures for book operations and SQLite for user data persistence.

---

##  Features

- Add, Delete, Issue, Return Books
- Search Book by ID
- List all books
- Register and List Users
- Basic input validation
- Persistent storage for users using **SQLite**
- Modular package-based architecture

---

##  Project Structure

```
com.librarymanagement
│
├── model         # Contains core model classes: Book, User
│
├── service       # Business logic for managing books and users
│
├── dao           # Database access classes for user persistence (SQLite)
│
├── util          # Utility classes for input validation and formatting
```

---

##  Technologies Used

- Java 8+
- SQLite (via JDBC)
- Console I/O
- Object-Oriented Programming Principles

---

##  Requirements

- JDK 8 or higher
- SQLite JDBC Driver (`sqlite-jdbc-<version>.jar`)
- Basic terminal/command-line usage

---

## How to Run

1. **Clone or Download** the project source.

2. **Compile** all files:
   ```bash
   javac -cp ".;sqlite-jdbc-3.36.0.3.jar" com/librarymanagement/**/*.java
   ```

3. **Run Main Class** (you need a `Main` class to run — assumed implemented separately):
   ```bash
   java -cp ".;sqlite-jdbc-3.36.0.3.jar" com.librarymanagement.Main
   ```

---

## Key Classes Explained

| Class / Package | Description |
|-----------------|-------------|
| `Book`, `User` (model) | Represent library items and registered users |
| `BookService` | Manages book operations (add, delete, issue, return, list) |
| `UserService` | Handles in-memory user list operations |
| `UserDAO` | Handles SQLite persistence for users |
| `DBConnection` | Provides reusable database connection |
| `InputValidator` | Validates input data (IDs, names, etc.) |
| `ConsolePrinter` | Prints styled headers and lines for better UI experience |

---

##  Example Operations

### Adding a Book
```java
bookService.addBook(new Book(1, "The Alchemist", "Paulo Coelho"));
```

### Issuing a Book
```java
bookService.issueBook(1);
```

### Registering a User
```java
userService.addUser(new User(101, "Alice"));
```

---

##  Notes

- Book data is not persisted — it's held in memory during the session.
- User data is stored in `library.db` via SQLite.
- Exception handling is basic and can be extended further.

---

##  To-Do / Improvements

- Add full database integration for books.
- Build a `Main` menu-driven interface (if not done).
- Add logging and error tracking.
- Extend `UserDAO` to support user queries and updates.
- Implement unit testing using JUnit.

---

##  License

This project is for educational use only. Feel free to use and modify it for learning or demonstrations.
