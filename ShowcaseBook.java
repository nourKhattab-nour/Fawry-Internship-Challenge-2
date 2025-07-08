/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawrytask2;

/**
 *
 * @author DELL
 */
public class ShowcaseBook extends Book{

    public ShowcaseBook(String isbn, String title, String authorName, int year, double price) {
        super(isbn, title, authorName, year, price);
    }
    
    @Override
    public boolean isAvailable() {
        return false; // Showcase books are not for sale
    }
    
    @Override
    public void processPurchase(int quantity, String email, String address) {
        System.out.println("Showcase books are not for sale");
    }
    
    @Override
    public String getBookType() {
        return "Showcase Book";
    }
}
