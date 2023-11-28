package cpit251_groupproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Walaa
 */
public class Student {

    private String name;
    private String studentId;
    private List<VolunteerOpprtunity> appliedOpportunities;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.appliedOpportunities = new ArrayList<>();
    }

    public void applyForOpportunity(VolunteerOpprtunity opportunity) {
        if (opportunity.getAvailableSpots() > 0) {
            opportunity.reduceAvailableSpots();
            appliedOpportunities.add(opportunity);
            System.out.println("Successfully applied for the opportunity: " + opportunity.getName());
        } else {
            System.out.println("Sorry, the opportunity is no longer available.");
        }
    }

    // Getters and setters for name, studentId, and appliedOpportunities
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public List<VolunteerOpprtunity> getAppliedOpportunities() {
        return appliedOpportunities;
    }

    public void setAppliedOpportunities(List<VolunteerOpprtunity> appliedOpportunities) {
        this.appliedOpportunities = appliedOpportunities;
    }

}
