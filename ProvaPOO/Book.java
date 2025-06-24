package ProvaPOO;

import java.time.LocalDate;

public class Book {
    
    private String author;
    private Integer pages;
    private BookCategory category;
    private LocalDate registrationDate;
    private Publisher publisher;
    
    public Book(String author, Integer pages, BookCategory category, LocalDate registrationDate, Publisher publisher) {
        this.author = author;
        this.pages = pages;
        this.category = category;
        this.registrationDate = registrationDate;
        this.publisher = publisher;
    }

    public Book() {
        this.author = null;
        this.pages = null;
        this.category = null;
        this.registrationDate = null;
        this.publisher = null;
    }

    public void incrementPages(int extra){
        this.pages += extra;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Integer getPages() {
        return pages;
    }
    public void setPages(Integer pages) {
        this.pages = pages;
    }
    public BookCategory getCategory() {
        return category;
    }
    public void setCategory(BookCategory t) {
        this.category = t;
    }
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }
    public Publisher getPublisher() {
        return publisher;
    }
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

}
