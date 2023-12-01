package cpit251_groupproject;

import static cpit251_groupproject.Administrator.Addopprtunity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Walaa
 */
public class Student {

    private String name;
    private int studentId;
    private String studentEmail;
    private int password;
    private List<VolunteerOpprtunity> appliedOpportunities;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.appliedOpportunities = new ArrayList<>();
    }

     public Student(String name, int studentId , String studentEmail, int password) {
        this.name = name;
        this.studentId = studentId;
        this.studentEmail = studentEmail;
        this.password = password;
        this.appliedOpportunities = new ArrayList<>();
    }

     
    public void applyForOpportunity() {

        Scanner input = new Scanner(System.in);
     
            for (int i = 0; i < Administrator.Addopprtunity.size(); i++) {
            VolunteerOpprtunity opportunity = Administrator.Addopprtunity.get(i);
            System.out.println((i + 1) + ". " + opportunity.toString());  
         }
        
        System.out.print("Enter the number of the opportunity you want to apply for: ");
        int choice = input.nextInt();
        int opportunityIndex = choice - 1;
        if (opportunityIndex >= 0 && opportunityIndex < Administrator.Addopprtunity.size()) {
            VolunteerOpprtunity opportunity = Administrator.Addopprtunity.get(opportunityIndex);
            if (opportunity.getAvailableSpots() > 0) {
                opportunity.reduceAvailableSpots();
                appliedOpportunities.add(opportunity);
                System.out.println("Successfully applied for the opportunity: " + opportunity.getName());
            } else {
                System.out.println("Sorry, the opportunity is no longer available.");
            }
        } else {
            System.out.println("Invalid choice.");
        }
       
    }

    // Getters and setters for name, studentId, and appliedOpportunities
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public List<VolunteerOpprtunity> getAppliedOpportunities() {
        return appliedOpportunities;
    }

    public void setAppliedOpportunities(List<VolunteerOpprtunity> appliedOpportunities) {
        this.appliedOpportunities = appliedOpportunities;
    }
          

    @Override
    public String toString() {
        return "\nProfile \n" + "Name: " + name + "     Student ID: " + studentId  +"     Student Email: " + studentEmail+ "     Password: " + password;
    }
    
    

}
