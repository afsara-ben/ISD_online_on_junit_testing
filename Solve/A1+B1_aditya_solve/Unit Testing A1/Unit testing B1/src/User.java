/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class User {
    private String name ; 
    private Library library ; 

    public User(String name, Library library) {
        this.name = name;
        this.library = library;
    }
    public void Book_lend(Book book){
        try{
            library.book_lend(book);
        }catch (Exception e){
            throw new ArrayIndexOutOfBoundsException();
        }

    }
    public void Book_return(Book book){
        try{
            library.book_return(book);
        }catch (Exception e){
            throw new ArrayIndexOutOfBoundsException();
        }

    }
    
}
