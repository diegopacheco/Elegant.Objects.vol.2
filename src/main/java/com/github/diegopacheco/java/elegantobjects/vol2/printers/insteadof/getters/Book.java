package com.github.diegopacheco.java.elegantobjects.vol2.printers.insteadof.getters;

import org.json.simple.JSONObject;
import java.util.Objects;

/**
 * Principles:
 *  Volume 1:
 *    + Immutable Objects
 *    + Primary ctor
 *  **
 *  Volume 2:
 *    + Printers instead of Getters
 *    + Utility Objects (JSONObject)
 */
public class Book {

    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String printToJson(){
        JSONObject obj = new JSONObject();
        obj.put("title", this.title);
        obj.put("author", this.author);
        obj.put("ISBN", this.isbn);
        String json = obj.toJSONString();
        return json;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
