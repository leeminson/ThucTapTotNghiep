/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1.DesignPattern.Singleton;

/**
 *
 * @author pc
 */
public class SingletonInit {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        Singleton singleton3=Singleton.getInstance();//Tat ca cac đối tượng đều trỏ tới 1 đối tượng singleton
        
    }
}
