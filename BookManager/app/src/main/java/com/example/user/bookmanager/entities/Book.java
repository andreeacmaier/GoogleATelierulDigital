package com.example.user.bookmanager.entities;

import java.time.LocalDateTime;

public class Book {

    private String title;
    private String author;
    private int noOfPages;
    private int lastPage;
    private LocalDateTime startDate;

    public Book(String title, String author, int noOfPages, int lastPage, LocalDateTime startDate) {
        this.title = title;
        this.author = author;
        this.noOfPages = noOfPages;
        this.lastPage = lastPage;
        this.startDate = startDate;
    }

    public Book(){}

    public int getNoOfPages() {
        return noOfPages;
    }

    public int getLastPage() {
        return lastPage;
    }
}
