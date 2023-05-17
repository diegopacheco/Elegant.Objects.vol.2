package com.github.diegopacheco.java.elegantobjects.vol2.printers.insteadof.getters;

public class MainApp {
    public static void main(String[] args) {
        Book book = new Book("Building Applications with Scala",
                "Diego Pacheco","978-1786461483");
        String json = book.printToJson();
        System.out.println(json);
    }
}
