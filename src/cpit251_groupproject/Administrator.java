
package cpit251_groupproject;

import java.util.ArrayList;

/**
 *
 * @author RANAA
 */
public class Administrator {

static ArrayList<VolunteerOpprtunity> Addopprtunity = new ArrayList<VolunteerOpprtunity>();


    public Administrator() {
        
    }
    
    
     public static void AddOpprtunity ( VolunteerOpprtunity volunteeropprtunity ){
        Addopprtunity.add(volunteeropprtunity);
        System.out.println(Addopprtunity.toString());
        System.out.println("Added Successfully \n");
    }
    

 
  
    
 

    
}
