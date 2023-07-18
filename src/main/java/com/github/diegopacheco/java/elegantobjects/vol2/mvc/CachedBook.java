package com.github.diegopacheco.java.elegantobjects.vol2.mvc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CachedBook implements Manuscript {

    private Map<String,Book> cache = new ConcurrentHashMap<>();
    private String isbn;
    private Manuscript manuscript;

    public CachedBook(String isbn, Manuscript manuscript){
        cache.put("178646148X",new Book("Diego Pacheco",
                "Building Applications with Scala", "178646148X"));
        this.isbn = isbn;
        this.manuscript = manuscript;
    }

    @Override
    public String print() {
        Book theBook = cache.get(isbn);
        if (null==theBook){
            return manuscript.print();
        }
        return theBook.print();
    }
}
