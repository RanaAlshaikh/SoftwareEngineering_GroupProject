package cpit251_groupproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author RANAA
 */
public class VolunteerismSystem { 
    
    public static void main(String[] args) throws ParseException {
        
    System.out.println("---------------------------------------------------------------");
    System.out.println("                    Empowering Volunteerism                    ");
    System.out.println("---------------------------------------------------------------");
   
        
         Scanner input = new Scanner(System.in);
         String choose = null;
         
        do{
            System.out.print("Choose SI for SignIn and SU for SignUp or E for exit: ");
            choose=input.next();
        if(choose.equalsIgnoreCase("SU")){
            System.out.print("Choose S for Student and A for Administrator: ");
            String choose1 = input.next();
                if(choose1.equalsIgnoreCase("A")){
                         Administrator(input);
                       
                }
                else{
                    System.out.println("Student sign-up is not implemented yet.");    // ??????????
                }
        }
        else if(choose.equalsIgnoreCase("SI"))
            System.out.println("Welcom Back");
        
        else
            System.out.println("Thank you, visit us again");
        }while(!choose.equalsIgnoreCase("E"));
     
        System.out.println("");

    }
 

    
    
    public static void Administrator (Scanner input) throws ParseException{
        System.out.print("Enter Opprtunity Name: ");
        String name = input.next();
        input.nextLine();
        System.out.print("Enter StartDate:  (format: yyyy-MM-dd)  ");
        String StringDate = input.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date StartDate = dateFormat.parse(StringDate); 
       /// Date StartDate = dateFormat.parse(StringDate);
       // System.out.print(StartDate);
        System.out.print("Enter EndDate:  (format: yyyy-MM-dd)  ");
        String StringDate2 = input.nextLine();
        Date EndDate = dateFormat.parse(StringDate2);
        System.out.print("Enter Time: ");
        String Time = input.nextLine();
        System.out.print("Enter Organization Name: ");
        String Organization_name = input.next();
        System.out.print("Enter Volunteers Number: ");
        int Volunteers_number = input.nextInt();
        System.out.print("Enter Location: ");
        String Location = input.next();

        VolunteerOpprtunity volunteeropprtunity = new VolunteerOpprtunity (name, StartDate, EndDate, Time, Organization_name, Volunteers_number,Location);
        Administrator.AddOpprtunity(volunteeropprtunity);   
    }
    
    

}