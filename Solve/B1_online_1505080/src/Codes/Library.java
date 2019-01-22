package Codes;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Lenovo
 */
public class Library {
    
    public ArrayList <User> users = new ArrayList<User>();
    public ArrayList <Book> bookList = new ArrayList<Book>();
    
    // Add a book to the library
    public Book addBook(String name, int num_of_copy){
        Book book = new Book(name, num_of_copy,this);
        if(!bookList.contains(book)){
            bookList.add(book);
        }
        else {
            int idx = bookList.indexOf(book);
            Book prev = bookList.get(idx);
            bookList.get(idx).setNumber_of_copy(prev.getNumber_of_copy()+num_of_copy);
        }
        return book ; 
    }
    
    
    // Add a user to this library
    public User addUser(String name){
        User user = new User(name,this);
        if(!users.contains(user)){
            users.add(user);
        }
        return user ; 
    }
    
    // Check if this book is available
    public Boolean isAvailable(Book book){
        if(!bookList.contains(book)){
            return false;
        }
        else {
            int idx = bookList.indexOf(book);
            Book prev = bookList.get(idx);
            return prev.getNumber_of_copy() > 0;
        }
    }
    
    
    // return the list of books in the library
    public Book [] get_book_list(){
        Book [] books = new Book[bookList.size()+5];
        return bookList.toArray(books);
    }

    Book lendBook(Book book){
        if (bookList.contains(book)){
            int idx = bookList.indexOf(book);
            Book prev = bookList.get(idx);
            bookList.get(idx).setNumber_of_copy(prev.getNumber_of_copy()-1);
            return prev;
        }
        else {
            return null;
        }
    }

    Book findBook(Book book){
        if (bookList.contains(book)){
            int idx = bookList.indexOf(book);
            Book prev = bookList.get(idx);
            return prev;
        }
        else {
            return null;
        }
    }


}
