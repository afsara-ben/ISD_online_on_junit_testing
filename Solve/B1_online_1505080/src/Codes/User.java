package Codes;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Lenovo
 */
public class User {
    private String name ; 
    private Library library ;

    ArrayList <Book> books = new ArrayList<Book>();

    public User(String name, Library library) {
        this.name = name;
        this.library = library;
    }

    //exception
    public Book book_lend(Book book) throws Exception {
        Book gotBook = library.lendBook(book);
        if(gotBook==null){
            throw new Exception();
        }
        else {
            books.add(gotBook);
            return gotBook;
        }

     }


    //exception
    public Book book_return(Book book) throws Exception {
        if(!books.contains(book)){
            throw new Exception();
        }
        else {
            int idx = books.indexOf(book);
            Book prev = books.get(idx);
            books.get(idx).setNumber_of_copy(prev.getNumber_of_copy()-1);
            library.addBook(prev.getName(), 1);
            return prev;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equalsIgnoreCase( user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
