package com.github.diegopacheco.java.elegantobjects.vol2.polymorphicmedia;

import java.nio.charset.StandardCharsets;

public class MainApp {
    public static void main(String[] args) {
        Book book = new Book("Building Applications with Scala",
                "Diego Pacheco","978-1786461483");
        Media json = new ToJson();
        byte[] bytes = book.printTo(json);
        System.out.println("bytes: " + bytes);
        System.out.println("json:  " + new String(bytes, StandardCharsets.UTF_8));
    }
}
