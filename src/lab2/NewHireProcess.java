/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jerem
 */
public class NewHireProcess extends Employee { //Private Variables

    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date orientationDate;

    //New Hire Constructor
    public NewHireProcess(boolean metWithHr, boolean metDeptStaff, boolean reviewedDeptPolicies, boolean movedIn, String cubeId, Date orientationDate, String firstName, String lastName, String ssn) {
        super(firstName, lastName, ssn);
        this.metWithHr = metWithHr;
        this.metDeptStaff = metDeptStaff;
        this.reviewedDeptPolicies = reviewedDeptPolicies;
        this.movedIn = movedIn;
        this.cubeId = cubeId;
        this.orientationDate = orientationDate;

    }

//Steps involved in new hire process >>>
    //Add a logical step-by-step to the process
    public void putAllOfTheStepsInSequence(boolean metWithHr, boolean metDeptStaff, boolean reviewedDeptPolicies) {

        if (orientationDate != null) { //If the employee has an orientation
            if (metWithHr && metDeptStaff && reviewedDeptPolicies) {// If emplyee has met with HR, Dept Staff and reviewd dept policies.
                if (cubeId != null) {// If HR setup a cubicle number.
                    System.out.println("Your Orientation is complete!");
                    moveIntoCubicle(cubeId);
                } else {// If the initial steps are completed but HR has not set up a cubicle number.
                    System.out.println("Your Orientation is complete! "
                            + "An HR representative will contact you with your cubicle number.");
                }
            } else {// If employee has not completed 1 of the initial steps check which one(s) are missing.
                if (metWithHr) {//Did they meet with HR?
                } else {//If not go through the proper step
                    this.meetWithHrForBenefitAndSalryInfo();
                }
                if (metDeptStaff) { //did they meet dept staff?
                } else {//If not go through the proper step
                    this.meetDepartmentStaff();
                }
                if (reviewedDeptPolicies) {//Did they review dept. policies?

                } else {//If not go through the proper step
                    this.reviewDeptPolicies();
                }
            }
        } else {// If they do not have an orientation date.
            System.out.println("You do not have an orientation date set yet."
                    + "Please Contact an HR representative to establish an orientation date.");
        }
    }

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.
    private void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
        String fmtDate = formatDateProperlyAndMakeItUnique(orientationDate);
        System.out.println(makeAFullName() + " met with Hr on "
                + fmtDate);

    }

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.:
    private void meetDepartmentStaff() {
        metDeptStaff = true;
        String fmtDate = formatDateProperlyAndMakeItUnique(orientationDate);
        System.out.println(makeAFullName() + " met with Dept. Staff on "
                + fmtDate);
    }

    // Assume this must be performed third. And assume that because department
    // policies may change that this method may need to be called 
    // independently from other classes.
    public void reviewDeptPolicies() {
        reviewedDeptPolicies = true;
        String fmtDate = formatDateProperlyAndMakeItUnique(orientationDate);
        System.out.println(makeAFullName() + " reviewed Dept policies on "
                + fmtDate);
    }

    // Assume this must be performed 4th. And assume that because employees
    // sometimes change office locations that this method may need to be called 
    // independently from other classes.
    public void moveIntoCubicle(String cubeId) {
        this.cubeId = cubeId;
        this.movedIn = true;
        String fmtDate = formatDateProperlyAndMakeItUnique(orientationDate);
        System.out.println(makeAFullName() + " moved into cubicle "
                + cubeId + " on " + fmtDate);
    }

    private String makeAFullName() {

        String name = super.getFirstName() + " " + super.getLastName();

        return name;
    }

    private static SimpleDateFormat formatDateProperly() {

        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");

        return sdf;
    }

    private String formatDateProperlyAndMakeItUnique(Date od) {

        this.orientationDate = od;
        String fmtDate = formatDateProperly().format(od);

        return fmtDate;
    }

    //Getters and Setters
    public boolean isMetWithHr() {
        return metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }

    public Date getOrientationDate() {
        return orientationDate;
    }

    public void setOrientationDate(Date orientationDate) {
        this.orientationDate = orientationDate;
    }

}
