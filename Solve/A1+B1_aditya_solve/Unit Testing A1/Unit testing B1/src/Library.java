/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Library {
    


    ArrayList<Book> books=new ArrayList<>();

    
    // Add a book to the library
    public Book addBook(String name, int num_of_copy){
        Book book = new Book(name, num_of_copy,this);
        books.add(book);
        return book ; 
    }
    
    
    // Add a user to this library
    public User addUser(String name){
        User user = new User(name,this);
        return user ; 
    }
    
    // Check if this book is available
    public Boolean isAvailable(Book book){
        if(book.get_num_of_copy()!=0) return true;
        return false ;
    }



    void book_lend(Book book){
       int id=books.indexOf(book);
       try{
           books.get(id).book_lend();
       }catch (Exception e){
           throw new ArrayIndexOutOfBoundsException();
       }

    }

    void book_return(Book book){
        int id=books.indexOf(book);
        try{
            books.get(id).book_return();
        }catch (Exception e){
            throw new ArrayIndexOutOfBoundsException();
        }

    }
    
    // return the list of books in the library
    public ArrayList<Book> get_book_list(){

        return  books;
    }
    
}
