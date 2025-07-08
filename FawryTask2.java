/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fawrytask2;

import java.util.List;

/**
 *
 * @author DELL
 */
public class FawryTask2 {

    public static void main(String[] args) {
        
    System.out.println("Quantum book store: Starting Quantum Bookstore Test\n");
        
        BookStore bookstore = new BookStore();
        
        // Test adding books
        System.out.println("=== Testing Add Books ===");
        
        PaperBook paperBook1 = new PaperBook(50,"PB001", "Java Programming", "John Smith", 2020, 29.99);
        PaperBook paperBook2 = new PaperBook(10,"PB002", "Ancient History", "Jane Doe", 2010, 19.99);
        EBook ebook1 = new EBook("EB001", "Digital Marketing", "Bob Johnson","PDF", 2023, 15.99);
        EBook ebook2 = new EBook("EB002", "Web Development", "Alice Brown","EPUB", 2022, 24);
        ShowcaseBook showcase1 = new ShowcaseBook("SB001", "Rare Manuscript", "Historical Society", 1800, 999.99);
        
        bookstore.addBook(paperBook1);
        bookstore.addBook(paperBook2);
        bookstore.addBook(ebook1);
        bookstore.addBook(ebook2);
        bookstore.addBook(showcase1);
        
        System.out.println();
        bookstore.displayInventory();
        
        // Test buying books
        System.out.println("\n=== Testing Buy Books ===");
        try {
            double amount1 = bookstore.buyBook("PB001", 2, "customer@email.com", "123 Main St");
            System.out.println("Quantum book store: Paid amount: $" + amount1);
            
            double amount2 = bookstore.buyBook("EB001", 1, "customer@email.com", "123 Main St");
            System.out.println("Quantum book store: Paid amount: $" + amount2);
            
            // Test buying showcase book
            try {
                bookstore.buyBook("SB001", 1, "customer@email.com", "123 Main St");
            } catch (RuntimeException e) {
                System.out.println("Quantum book store: Error - " + e.getMessage());
            }
            
            // Test buying too many paper books
            try {
                bookstore.buyBook("PB001", 100, "customer@email.com", "123 Main St");
            } catch (RuntimeException e) {
                System.out.println("Quantum book store: Error - " + e.getMessage());
            }
            
        } catch (RuntimeException e) {
            System.out.println("Quantum book store: Error - " + e.getMessage());
        }
        
        // Test removing outdated books
        System.out.println("\n=== Testing Remove Outdated Books ===");
        List<Book> removedBooks = bookstore.removeOutdatedBooks(10);
        System.out.println("Quantum book store: Removed " + removedBooks.size() + " outdated books");
        
        System.out.println("\n=== Final Inventory ===");
        bookstore.displayInventory();
        
      
        
        System.out.println("\nQuantum book store: Test completed successfully!");
    }
}
