package cpit251_groupproject;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author RANAA
 */
public class VolunteerOpprtunity {

    private String name;
    private Date StartDate;
    private Date EndDate;
    private String time;
    private String Organization_name;
    private int Volunteers_number;
    private String location;
    //walaa
    private int availableSpots;

    public VolunteerOpprtunity(String name, int availableSpots) {
        this.name = name;
        this.availableSpots = availableSpots;
    }

    public void reduceAvailableSpots() {
        availableSpots--;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public void setAvailableSpots(int availableSpots) {
        this.availableSpots = availableSpots;
    }
    
    
    //end

    public VolunteerOpprtunity() {
    }

    public VolunteerOpprtunity(String name, Date StartDate, Date EndDate, String time, String Organization_name, int Volunteers_number, String location) {
        this.name = name;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.time = time;
        this.Organization_name = Organization_name;
        this.Volunteers_number = Volunteers_number;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getOrganization_name() {
        return Organization_name;
    }

    public void setOrganization_name(String Organization_name) {
        this.Organization_name = Organization_name;
    }

    public int getVolunteers_number() {
        return Volunteers_number;
    }

    public void setVolunteers_number(int Volunteers_number) {
        this.Volunteers_number = Volunteers_number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void Date() {

    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String Start_Date = dateFormat.format(StartDate);
        String End_Date = dateFormat.format(EndDate);
        return "Volunteer Opprtunity " + "name: " + name + ","
                + " StartDate: " + Start_Date + ", EndDate: " + End_Date + ", Time: " + time + ", Organization_name: " + Organization_name + ", Volunteers_number: " + Volunteers_number + ", location: " + location + "\n"
                + "Available Spots: " + availableSpots + "\n";
    }

}
