package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println(book + " added successfully");
    }
    public void listBooks(){
        if(books.isEmpty()){
            System.out.println("No books available");
            return;
        }
        books.forEach(b -> System.out.println(b.toString()));
    }
    public void getBookById(Long id){

        books.stream().filter(b -> b.getId().equals(id)).findFirst().ifPresent(System.out::println);
        System.out.println("Book not found");
    }

    public void removeBook(Long id){
        Book book = books.stream().filter(b -> b.getId().equals(id)).findFirst().orElse(null);
        if(book != null){
            books.remove(book);
            System.out.println(book + " removed successfully");
            return;
        }
        System.out.println("Book not found");
    }

}
