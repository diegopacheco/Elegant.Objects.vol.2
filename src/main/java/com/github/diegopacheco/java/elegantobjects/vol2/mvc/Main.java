package com.github.diegopacheco.java.elegantobjects.vol2.mvc;

/*
* Principles:
*  + Printers
*  + No Reflection, No instance per name or class - Encapsulation is preserved
*  + Vertical Decomposition of Responsibilities (VoR) - No MVC
*  + Immutability
*  + No Getters / No Setters
*  + No IoC / No DI
* */
public class Main {
    public static void main(String[] args) {
        String isbn = "178646148X";
        Manuscript book = new CachedBook(isbn, new BookNotNull(new Book(isbn)));
        Manuscript article = new Article("Languages over Libraries",
                "http://diego-pacheco.blogspot.com/2023/07/languages-over-libraries.html");

        System.out.println(article.print());
        System.out.println(book.print());
    }
}
