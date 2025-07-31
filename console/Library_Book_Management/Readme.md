# 📚 Library Book Management System (Java Console App)

This is a **console-based Java application** that allows users to manage a library of books. It provides functionality to **add**, **list**, **search**, and **remove** books using simple menu-driven interaction.

## 🧠 Features

- Add a new book with title, author, and ID
- View a list of all books
- Search for a book by its ID
- Remove a book by its ID
- Interactive command-line interface
- Clean object-oriented structure with `Book`, `Library`, and `Menu` classes

## 🏗️ Project Structure

org.example/


├── Book.java # Book class with attributes and toString override

├── Library.java # Logic to manage the collection of books

├── Menu.java # Console-based menu system for user interaction

└── Main.java # Entry point of the application


## 🛠️ How to Run

### 1. Clone or Download

Clone the repository or download the `.java` files into a directory.

### 2. Compile the Java files

Make sure you're inside the directory containing the `.java` files:

```bash
javac org/example/*.java
```

### Sample Console Interaction
```bash

Library Management System
1. Add Books
2. List Books
3. Search Book By ID
4. Delete Book By ID
5. Exit
   Enter your choice: 1

Enter Book ID: 1001
Enter Book Title: Java Basics
Enter Book Author: Andrew Steele
Book{title='Java Basics', id=1001, author='Andrew Steele', isAvailable=true} added successfully

```

###  Example Book Object
```bash

   Book{title='Java Basics', id=1001, author='Jeet Thakkar', isAvailable=true}
```
### Technologies Used

Java 21 (or compatible versions)

Console/Terminal (no GUI or frameworks)

### ✍️ Author

Jeet Thakkar

Web Applications Development Student, St. Clair College

