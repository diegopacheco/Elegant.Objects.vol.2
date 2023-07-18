package com.github.diegopacheco.java.elegantobjects.vol2.mvc;

public class Article implements Manuscript{

    private String title;
    private String url;

    public Article(String title,String url) {
        this.title = title;
        this.url = url;
    }

    @Override
    public String print() {
        return "Article: " + title + " - " + url;
    }
}
