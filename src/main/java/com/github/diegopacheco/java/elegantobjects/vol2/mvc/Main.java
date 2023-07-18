package com.github.diegopacheco.java.elegantobjects.vol2.mvc;

/**
 * Principles: <BR/>
 *  + Printers  <BR/>
 *  + No Reflection, No instance per name or class - Encapsulation is preserved  <BR/>
 *  + Vertical Decomposition of Responsibilities (VoR) - No MVC  <BR/>
 *  + Immutability  <BR/>
 *  + No Getters / No Setters  <BR/>
 *  + No IoC / No DI  <BR/>
 **/
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
