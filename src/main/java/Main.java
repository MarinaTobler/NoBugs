package org.example.task1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();

        book1.setName("Kevade");
        book1.setAuthor("O. Luts");
        book1.setYear(1949);

        String  name1 = book1.getName();
        String author1 = book1.getAuthor();
        int year1 = book1.getYear();

        book1.display();

    }
}