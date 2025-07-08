/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawrytask2;

/**
 *
 * @author DELL
 */
abstract public class Book {
    private String isbn;
    private String title;
    private String authorName;
    private int year;
    private double price;

    //Constructor
    public Book(String isbn, String title, String authorName, int year, double price) {
        this.isbn = isbn;
        this.title = title;
        this.authorName = authorName;
        this.year = year;
        this.price = price;
    }
    //Setters
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //Getters

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
    // Abstruct Functions
    public abstract boolean isAvailable();
    public abstract void processPurchase(int quantity, String email, String address);
    public abstract String getBookType();
    
}
