package lab3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab focus on CLASS Encapsulation and  the Single Responsibility 
 * Principle (SRP) and fix/add code as necessary.
 * 
 * Pay special attention to the following issues:
 *    1. It is not the job of this class or any of the methods in this class
 *       to do output. So you must remove the System.out.println statements.
 *       But we still need output. What to do? Delegate that work to a new
 *       object that IS responsible for output. Create a report service class
 *       and have the employee object talk to that object to perform the output.
 *       Using a separate class inside another like this is a form of class
 *       encapsulation -- hiding a class within another class.
 *       Notice how you can easily change the way output is done, going from
 *       console output to JOptionPane output if desired without the Employee
 *       object knowing about the change. Flexible!
 * 
 *    2. When doing method validation we have a similar problem. It is not the
 *       job of this class or any of its methods to do output. But error
 *       messages aren't a reporting issue. Error messages can be produced
 *       from invalid data in any program, whether or not those programs have
 *       reporting services. So we need a different approach. The right thing
 *       to do is to create an exception that notifies the user that a 
 *       validation error has happened. An example of this is provided in the
 *       setFirstName() method. Mimic this behavior in other setter methods.
 *       Note: a thorough discussion of Exceptions and how to use them is
 *       a future topic of this course. But those details are beyond the
 *       scope of this lesson.
 * 
 * Review the tips in the document "EncapCheckList.pdf" if needed.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private Reports report;
    
private NewEmployeeOrientation neo;
    
    public Employee(String firstName, String lastName, String ssn) {
        // Using setter method guarantees validation will be performed
        // Ignore the warning messages for now. Will be explained later
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        report = new Reports();
    }
    
    
    public String getFirstName() {
        return firstName;
    }

    // setter methods give the developer the power to control what data is
    // allowed through validation. Throwing ane exception is the best
    // practice when validation fails. Don't do a System.out.println()
    // to display an error message -- not the job of this class!
    public void setFirstName(String firstName) {
        if(firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("first name is required");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.isEmpty()) {
            System.out.println("last name is required");
        }
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        if(ssn == null || ssn.length() < 9 || ssn.length() > 11) {
            System.out.println("ssn is required and must be "
                    + "between 9 and 11 characters (if hyphens are used)");
        }
        this.ssn = ssn;
    }

     public Reports getReport() {
        return report;
    }

    public void setReport(Reports report) {
        this.report = report;
    }
    
        public void outputReport(String ssn) {
        Employee e = null;

      

            e.getReport().outputReport();

        }
    }

