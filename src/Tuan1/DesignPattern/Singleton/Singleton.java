/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1.DesignPattern.Singleton;

/**
 *
 * @author pc
 */
public class Singleton {
    private static Singleton instance;
    private Singleton(){
        System.out.println("Khoi tao thanh cong");
    }
    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
