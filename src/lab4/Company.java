/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author jerem
 */
public class Company {
        private RunThroughOrientationProcess rtop;
    
    public Company() {
        rtop = new RunThroughOrientationProcess();
    }
    
    public void hireEmployee(String firstName, String lastName, String ssn) {
        rtop.StepThroughEachStep(firstName, lastName, ssn);
        rtop.outputReport(ssn);
    }

    public RunThroughOrientationProcess getHr() {
        return rtop;
    }

    public void setHr(RunThroughOrientationProcess rtop) {
        this.rtop = rtop;
    }
}
