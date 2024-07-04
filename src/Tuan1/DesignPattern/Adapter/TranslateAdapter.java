/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1.DesignPattern.Adapter;

/**
 *
 * @author pc
 */
public class TranslateAdapter implements VietnameseTarget{
    private EnglishAdaptee adaptee;
 
    public TranslateAdapter(EnglishAdaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void sendMsg(String words) {
        System.out.println(words);
        String translatedword=this.translate(words);
        adaptee.receive(translatedword);
    }
    private String translate(String vietnameseWords) {
        System.out.println("Translated!");
        return "Hello!";
    }
}
