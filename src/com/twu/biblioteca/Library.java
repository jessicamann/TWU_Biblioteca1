package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.List;

/**
 * Created by jmann on 6/16/15.
 */
public class Library {
    PrintStream printStream;
    List<Book> books;



    public Library(PrintStream printStream, List<Book> books){
        this.printStream = printStream;
        this.books = books;
    }

    public void listBooks() {
        for(Book book : books){
            printStream.println(book.printFormat());
        }
    }


}
