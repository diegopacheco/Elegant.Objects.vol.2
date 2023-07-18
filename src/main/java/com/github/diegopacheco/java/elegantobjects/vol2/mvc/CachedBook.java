package com.github.diegopacheco.java.elegantobjects.vol2.mvc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CachedBook implements Manuscript {

    private Map<String,Book> cache = new ConcurrentHashMap<>();
    private String isbn;

    public CachedBook(String isbn, Manuscript book){
        cache.put("178646148X",new Book("Diego Pacheco",
                "Building Applications with Scala", "178646148X"));
        this.isbn = isbn;
    }

    @Override
    public String print() {
        Book book = cache.get(isbn);
        return book.print();
    }
}
