/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawrytask2;

/**
 *
 * @author DELL
 */
public class MailService {
     public static void sendEBook(EBook book, String email, int quantity) {
        System.out.println("Quantum book store: Sending " + quantity + " copy(ies) of EBook '" + book.getTitle() + "' (" + book.getFileType() + ") to " + email);
    }
}
