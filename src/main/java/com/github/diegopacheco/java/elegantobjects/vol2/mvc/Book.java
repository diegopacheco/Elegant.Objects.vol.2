package com.github.diegopacheco.java.elegantobjects.vol2.mvc;

public class Book implements Manuscript {

    private String author;
    private String title;
    private String isbn;

    public Book(String author, String title,String isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public Book(String isbn) {
        this("","",isbn);
    }

    @Override
    public String print() {
        return "book: " + title + " by " + author + " isbn: " + isbn;
    }
}
