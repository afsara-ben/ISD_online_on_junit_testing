package Codes;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Objects;

/**
 *
 * @author Lenovo
 */
public class Book {
    private String name ; 
    private int number_of_copy ; 
    private Library library ; 

    public Book(String name, int number_of_copy, Library library) {
        this.name = name;
        this.number_of_copy = number_of_copy;
        this.library = library;
    }


    // Return available number of copies of this book in the library
    public int available_books(){
       Book gotBook = library.findBook(this);
       if(gotBook == null){
           return 0;
       }
       else {
           return gotBook.getNumber_of_copy();
       }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber_of_copy() {
        return number_of_copy;
    }

    public void setNumber_of_copy(int number_of_copy) {
        this.number_of_copy = number_of_copy;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equalsIgnoreCase(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
