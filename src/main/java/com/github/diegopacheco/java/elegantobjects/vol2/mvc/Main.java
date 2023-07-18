package com.github.diegopacheco.java.elegantobjects.vol2.mvc;

public class Main {
    public static void main(String[] args) {
        String isbn = "178646148X";
        Manuscript book = new CachedBook(isbn, new BookNotNull(new Book(isbn)));
        System.out.println(book.print());
    }
}
