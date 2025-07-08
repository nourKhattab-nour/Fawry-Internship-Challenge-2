/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawrytask2;

/**
 *
 * @author DELL
 */
public class PaperBook extends Book{
    private int stock;

    //Constructor
    public PaperBook(int stock, String isbn, String title, String authorName, int year, double price) {
        super(isbn, title, authorName, year, price);
        this.stock = stock;
    }
    
    //Setters
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    //Getters
     public int getStock(){
    return stock;
    }
     
    //Functions
    public void reduceStock(int quantity) {
        if (quantity > stock) {
            System.out.println("Not enough stock available. Available: " + stock + ", Requested: " + quantity); 
        }
        stock -= quantity;
    }
    
    @Override
    public boolean isAvailable() {
        return stock > 0;
    }
    
    @Override
    public void processPurchase(int quantity, String email, String address) {
        reduceStock(quantity);
        ShippingService.ship(this, address, quantity);
    }
    
    @Override
    public String getBookType() {
        return "Paper Book";
    }
}
