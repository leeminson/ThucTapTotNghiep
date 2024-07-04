/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1.DesignPattern.ChainOfResponsibility;

/**
 *
 * @author pc
 */
public abstract class Approver {
     protected Approver nextApprover;
 
    public void approveLeave(OffRequest request) {
        System.out.println("Checking permission for " + this.getClass().getSimpleName());
        if (this.canApprove(request.getDayOffs())) {
            this.doApproving(request);
        } else if (nextApprover != null) {
            nextApprover.approveLeave(request);
        }
    }
 
    public void setNext(Approver approver) {
        this.nextApprover = approver;
    }
 
    protected abstract boolean canApprove(int numberOfDays);
 
    protected abstract void doApproving(OffRequest request);
}
