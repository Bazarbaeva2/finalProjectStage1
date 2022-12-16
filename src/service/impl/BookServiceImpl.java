package service.impl;

import model.Book;
import service.BookService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BookServiceImpl implements BookService {
    List<Book>bookList=new ArrayList<>();
    Scanner sc =new Scanner(System.in);

    @Override
    public List<Book> createBooks(List<Book> books) {
        bookList=books;
        return books;
    }

    @Override
    public List<Book> getAllBooks() {
        System.out.println("\n\t Here is registered users" );
        if (this.bookList.isEmpty()){
            System.out.println("\n Book list is empty, please choose some book");

        }else {
            for (int i = 0; i < this.bookList.size(); i++) {
                BookService.printUser(this.bookList.get(i));

            }
        }
        return null;
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        System.out.println("Here Romans ");
        if (this.getBooksByGenre(){
            System.out.println(" ");
        }else {
            for (int i = 0; i <bookList.equals(getBooksByGenre()) ; i++) {
                BookService.printUser(this.bookList.get(i));


            }
        }

        return null;
    }

    @Override
    public Book removeBookById(Long id) {
        return null;
    }

    @Override
    public List<Book> sortBooksByPriceInDescendingOrder() {
        return null;
    }

    @Override
    public List<Book> filterBooksByPublishedYear() {
        return null;
    }

    @Override
    public List<Book> getBookByInitialLetter() {
        return null;
    }

    @Override
    public Book maxPriceBook() {
        return null;
    }
}
