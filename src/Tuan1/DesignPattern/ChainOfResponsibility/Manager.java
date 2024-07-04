/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1.DesignPattern.ChainOfResponsibility;

/**
 *
 * @author pc
 */
public class Manager extends Approver{

    @Override
    protected boolean canApprove(int numberOfDays) {
        return numberOfDays<=3;
    }

    @Override
    protected void doApproving(OffRequest request) {
        System.out.println("Off request approved for " + request.getDayOffs()+ " days by Manager");
    }
    
}
