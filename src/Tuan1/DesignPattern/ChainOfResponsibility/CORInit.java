/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1.DesignPattern.ChainOfResponsibility;

/**
 *
 * @author pc
 */
public class CORInit {
    public static void main(String[] args) {
        WorkFlow.getApprover().approveLeave(new OffRequest(2));
        System.out.println("---");
        WorkFlow.getApprover().approveLeave(new OffRequest(5));
        System.out.println("---");
        WorkFlow.getApprover().approveLeave(new OffRequest(7));
    }
}
