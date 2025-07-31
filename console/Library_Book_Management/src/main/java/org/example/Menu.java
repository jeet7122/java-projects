package org.example;

import java.util.Scanner;

public class Menu {
    private final Library library;
    private final Scanner scanner;

    public Menu(Library library) {
        this.library = library;
        this.scanner = new Scanner(System.in);
    }
    public void show(){
        int choice;
        do {
            System.out.println("\n Library Management System");
            System.out.println("1. Add Books");
            System.out.println("2. List Books");
            System.out.println("3. Search Book By ID");
            System.out.println("4. Delete Book By ID");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 -> addBook();
                case 2 -> library.listBooks();
                case 3 -> searchBook();
                case 4 -> removeBook();
                case 5 -> System.out.println("Exiting......");
                default -> System.out.println("Invalid Input please try again!");
            }
        }
        while (choice != 5);
    }

    private void addBook(){
        System.out.print("Enter Book ID: ");
        long id = scanner.nextLong();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();

        Book book = new Book(title, id, author, true);
        library.addBook(book);
    }
    private void searchBook(){
        System.out.println("Enter the id of book");
        long id = scanner.nextLong();
        library.getBookById(id);
    }
    private void removeBook() {
        System.out.print("Enter Book ID: ");
        long id = scanner.nextLong();
        library.removeBook(id);
    }
}
