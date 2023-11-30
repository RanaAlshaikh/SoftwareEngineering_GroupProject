package cpit251_groupproject;

import java.util.ArrayList;

/**
 *
 * @author RANAA
 */
public class Administrator {
    private String name;
    private String administratorEmail;
    private int password;

    static ArrayList<VolunteerOpprtunity> Addopprtunity = new ArrayList<VolunteerOpprtunity>();

    public Administrator() {

    }

    public Administrator(String name, String administratorEmail, int password) {
        this.name = name;
        this.administratorEmail = administratorEmail;
        this.password = password;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdministratorEmail() {
        return administratorEmail;
    }

    public void setAdministratorEmail(String administratorEmail) {
        this.administratorEmail = administratorEmail;
    }

    public static ArrayList<VolunteerOpprtunity> getAddopprtunity() {
        return Addopprtunity;
    }

    public static void setAddopprtunity(ArrayList<VolunteerOpprtunity> Addopprtunity) {
        Administrator.Addopprtunity = Addopprtunity;
    }

    public static void AddOpprtunity(VolunteerOpprtunity volunteeropprtunity) {
        Addopprtunity.add(volunteeropprtunity);
        System.out.println();
        System.out.println(volunteeropprtunity.toString());
        System.out.println("Added Successfully \n");
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
    
    
 @Override
    public String toString() {
        return "\nProfile \n" + "Name: " + name + "     Administrator Email: " + administratorEmail + "     Password: " + password ;
    }
    
}
