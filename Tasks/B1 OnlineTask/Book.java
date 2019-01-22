/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        return 0;
    }
    
}
