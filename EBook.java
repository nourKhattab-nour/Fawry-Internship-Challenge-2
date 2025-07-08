/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawrytask2;

/**
 *
 * @author DELL
 */
public class EBook extends Book{
    private String fileType;

    public EBook(String fileType, String isbn, String title, String authorName, int year, double price) {
        super(isbn, title, authorName, year, price);
        this.fileType = fileType;
    }
    
    //Setters
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
    
    //Getters
    public String getFileType() {
        return fileType;
    }
    
    @Override
    public boolean isAvailable() {         // EBooks are always available
        return true; 
    }
    
    @Override
    public void processPurchase(int quantity, String email, String address) {
        MailService.sendEBook(this, email, quantity);
    }
    
    @Override
    public String getBookType() {
        return "EBook";
    }
}
