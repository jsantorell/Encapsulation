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
public class NewHireProcess extends Employee {

    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date orientationDate;

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
    public void inSequence(boolean metWithHr, boolean metDeptStaff, boolean reviewedDeptPolicies) {

        if (metWithHr && metDeptStaff && reviewedDeptPolicies) {

        } else {
            if (metWithHr) {
            } else {
                this.meetWithHrForBenefitAndSalryInfo();
            }
            if (metDeptStaff) {
            } else {
                this.meetDepartmentStaff();
            }
            if (reviewedDeptPolicies) {
                this.reviewDeptPolicies();
            } else {
            }
        }
    }

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.
    public void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(orientationDate);
        System.out.println(super.getFirstName() + " " + super.getLastName() + " met with Hr on "
                + fmtDate);

    }

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.:
    public void meetDepartmentStaff() {
        metDeptStaff = true;
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(orientationDate);
        System.out.println(super.getFirstName() + " " + super.getLastName() + " met with Dept. Staff on "
                + fmtDate);
    }

    // Assume this must be performed third. And assume that because department
    // policies may change that this method may need to be called 
    // independently from other classes.
    public void reviewDeptPolicies() {
        reviewedDeptPolicies = true;
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(orientationDate);
        System.out.println(super.getFirstName() + " " + super.getLastName() + " reviewed Dept policies on "
                + fmtDate);
    }

    // Assume this must be performed 4th. And assume that because employees
    // sometimes change office locations that this method may need to be called 
    // independently from other classes.
    public void moveIntoCubicle(String cubeId) {
        this.cubeId = cubeId;
        this.movedIn = true;
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(orientationDate);
        System.out.println(super.getFirstName() + " " + super.getLastName() + " moved into cubicle "
                + cubeId + " on " + fmtDate);
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
