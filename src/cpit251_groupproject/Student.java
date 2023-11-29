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
    private String studentId;
    private List<VolunteerOpprtunity> appliedOpportunities;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.appliedOpportunities = new ArrayList<>();
    }

    public void applyForOpportunity() {

        Scanner input = new Scanner(System.in);
        System.out.println("Available Opportunities:");
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
    public static void browseOpportunitiesol(String criteria, String value) {
        boolean found = false;
        for (VolunteerOpprtunity opportunity : Addopprtunity) {
            switch (criteria.toLowerCase()) {
                case "organization":
                    if (opportunity.getOrganization_name().toLowerCase().contains(value.toLowerCase())) {
                        System.out.println(opportunity.toString());
                        found = true;
                    }
                    break;
                case "available spots":
                    if (opportunity.getAvailableSpots() >= Integer.parseInt(value)) {
                        System.out.println(opportunity.toString());
                        found = true;
                    }
                    break;
            }
        }
        if (!found) {
            System.out.println("No matching opportunities found.");
        }
    }
    public static void searchOpportunityol(String searchKeyword) {
        boolean found = false;
        for (VolunteerOpprtunity opportunity : Addopprtunity) {
            if (opportunity.getName().toLowerCase().contains(searchKeyword.toLowerCase())) {
                System.out.println("Matching Opportunity Found:");
                System.out.println(opportunity.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching opportunities found.");
        }
    }

}
