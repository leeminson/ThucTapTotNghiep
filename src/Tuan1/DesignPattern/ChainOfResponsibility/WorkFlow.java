/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1.DesignPattern.ChainOfResponsibility;

/**
 *
 * @author pc
 */
public class WorkFlow {
    public static Approver getApprover() {
        Approver manager = new Manager();
        Approver director = new Director();
        manager.setNext(director);
        return manager;
    }
}
