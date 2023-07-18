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
        this(null,null,isbn);
    }

    @Override
    public String print() {
        String message = "book: ";
        if (null!=title){
            message += title;
        }
        if (null!=author){
            message += " by " + author + " ";
        }
        message += "isbn: " + isbn;
        return message;
    }
}
