/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawrytask2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author DELL
 */
public class BookStore {
    private List<Book> inventory;

   

    public BookStore() {
        inventory = new ArrayList<>();
    }
    
    
    public void addBook(Book book) {
        inventory.add(book);
        System.out.println("Quantum book store: Added " + book.getBookType() + " - " + book.getTitle() + " by " + book.getAuthorName() + " (ISBN: " + book.getIsbn() + ")");
    }
    
    public List<Book> removeOutdatedBooks(int yearsThreshold) {
        List<Book> removedBooks = new ArrayList<>();
        int currentYear = 2024;
        
        for (int i = inventory.size() - 1; i >= 0; i--) {
            Book book = inventory.get(i);
            if (currentYear - book.getYear() > yearsThreshold) {
                removedBooks.add(book);
                inventory.remove(i);
                System.out.println("Quantum book store: Removed outdated book - " + book.getTitle() + " (Published: " + book.getYear() + ")");
            }
        }
        
        return removedBooks;
    }
    
    public double buyBook(String isbn, int quantity, String email, String address) {
        Book book = findBookByIsbn(isbn);
        
        if (book == null) {
            System.out.println("Book with ISBN " + isbn + " not found in inventory");
        }
        
        if (!book.isAvailable()) {
            System.out.println("Book '" + book.getTitle() + "' is not available for purchase");
        }
        
        // Process the purchase
        book.processPurchase(quantity, email, address);
        
        double totalAmount = book.getPrice() * quantity;
        System.out.println("Quantum book store: Purchase completed - " + quantity + " copy(ies) of '" + book.getTitle() + "' for $" + totalAmount);
        
        return totalAmount;
    }
    
     private Book findBookByIsbn(String isbn) {
        for (Book book : inventory) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
     
    public void displayInventory() {
        System.out.println("Quantum book store: Current Inventory:");
        for (Book book : inventory) {
            System.out.println("  - " + book.getTitle() + " by " + book.getAuthorName() + " (" + book.getYear() + ") - $" + book.getPrice() + " [" + book.getBookType() + "]");
        }
    }
    
    public Book getBook(String isbn) {
        return findBookByIsbn(isbn);
    }
}
