package com.github.diegopacheco.java.elegantobjects.vol2.mvc;

public class BookNotNull implements Manuscript{

    private Book book;

    public BookNotNull(Book book) {
        this.book = book;
    }

    @Override
    public String print() {
        if (book==null){
            throw new IllegalStateException("Manuscript cannot be null");
        }
        return book.print();
    }
}
