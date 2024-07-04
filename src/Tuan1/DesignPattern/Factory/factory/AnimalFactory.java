/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1.DesignPattern.Factory.factory;

import Tuan1.DesignPattern.Factory.Animal.Animal;
import Tuan1.DesignPattern.Factory.Animal.Cat;
import Tuan1.DesignPattern.Factory.Animal.Duck;
import Tuan1.DesignPattern.Factory.Animal.Spider;
import Tuan1.DesignPattern.Factory.AnimalType;

/**
 *
 * @author pc
 */
public class AnimalFactory {

    private AnimalFactory() {
    }
    public static Animal getAnimal(AnimalType at){
        switch (at){
            case Cat -> {
                return new Cat();
            }
            case Duck -> {
                return new Duck();
            }
            case Spider -> {
                return new Spider();
            }
            default -> throw new IllegalArgumentException("This animal type is unsupported");
        }
    }
}
