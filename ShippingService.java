/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawrytask2;

/**
 *
 * @author DELL
 */
public class ShippingService {
     public static void ship(PaperBook book, String address, int quantity) {
        System.out.println("Quantum book store: Shipping " + quantity + " copy(ies) of '" + book.getTitle() + "' to " + address);
    }
}
