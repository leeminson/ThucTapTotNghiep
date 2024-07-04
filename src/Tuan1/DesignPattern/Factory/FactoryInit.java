/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1.DesignPattern.Factory;

import Tuan1.DesignPattern.Factory.Animal.Animal;
import Tuan1.DesignPattern.Factory.factory.AnimalFactory;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class FactoryInit {
    public static void main(String[] args) {
        Animal animal1=AnimalFactory.getAnimal(AnimalType.Cat);
        Animal animal2=AnimalFactory.getAnimal(AnimalType.Duck);
        Animal animal3=AnimalFactory.getAnimal(AnimalType.Spider);
        System.out.println("Legs : "+animal1.getLegs());
        System.out.println("Legs : "+animal2.getLegs());
        System.out.println("Legs : "+animal3.getLegs());


    }
}
