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
    private int main_copy;

    public Book(String name, int number_of_copy, Library library) {
        this.name = name;
        this.number_of_copy = number_of_copy;
        this.library = library;
        this.main_copy=number_of_copy;
    }
    void book_lend(){
        if(number_of_copy==0){
            throw new ArrayIndexOutOfBoundsException();
        }
        number_of_copy--;

    }
    int get_num_of_copy(){
        return number_of_copy;
    }

    void book_return(){
        if(number_of_copy==main_copy){
            throw new ArrayIndexOutOfBoundsException();
        }
        number_of_copy++;

    }
    // Return available number of copies of this book in the library
    public int available_number_of_copies(){

        return number_of_copy;
    }
    
}
