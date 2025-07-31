package org.example;

public class Book {
    private String title;
    private Long id;
    private String author;
    private boolean isAvailable;

    public Book(String title, Long id, String author, boolean isAvailable) {
        this.title = title;
        this.id = id;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
