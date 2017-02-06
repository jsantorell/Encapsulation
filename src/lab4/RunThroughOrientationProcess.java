/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jerem
 */
public class RunThroughOrientationProcess {

    private List<lab4.solution.Employee> employees; //This part i could not figure out on my own
    public int OrientationNumber = 1234;

    public RunThroughOrientationProcess() { //Set Array
        employees = new ArrayList();
    }

    public void StepThroughEachStep(String firstName, String lastName, String ssn) {
        lab4.solution.Employee e = new lab4.solution.Employee(firstName, lastName, ssn); //Set the Employee
        e.setFirstName(firstName);
        e.setLastName(lastName);
        e.setSsn(ssn);
        employees.add(e);
        orientEmployee(e);
    }

    public List<lab4.solution.Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<lab4.solution.Employee> employees) {
        this.employees = employees;
    }

    public void orientEmployee(lab4.solution.Employee e) {
        e.doFirstTimeOrientation(" " + OrientationNumber++);
    }

    public void outputReport(String ssn) {
        lab4.solution.Employee e = null;

        for (lab4.solution.Employee emp : employees) {
            if (emp.getSsn().equals(ssn)) {
                e = emp;
                break;
            } else {

                return;
            }
        }

        if (e.isMetWithHr() && e.isMetDeptStaff()
                && e.isReviewedDeptPolicies() && e.isMovedIn()) {

            e.getReportService().outputReport();

        }
    }

}
