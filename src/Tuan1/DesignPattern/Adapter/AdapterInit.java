/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1.DesignPattern.Adapter;

/**
 *
 * @author pc
 */
public class AdapterInit {
    public static void main(String[] args) {
        VietnameseTarget client = new TranslateAdapter(new EnglishAdaptee());
        client.sendMsg("Xin chào");
    }
}
