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

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("                                 Empowering Volunteerism                                   ");
        System.out.println("-------------------------------------------------------------------------------------------");

        Scanner input = new Scanner(System.in);
        String choose = null;

        do {
            System.out.print("Choose SI for SignIn and SU for SignUp or E for exit: ");
            choose = input.next();          
            if (choose.equalsIgnoreCase("SU")) { 
                 System.out.print("Choose S for Student and A for Administrator: ");
                 String choose1 = input.next();
                if (choose1.equalsIgnoreCase("A")) {
                    Administrator(input);
                } //walaa
                else if (choose1.equalsIgnoreCase("S")) {
                    Student(input);
                }
            } else if (choose.equalsIgnoreCase("SI")) {
                System.out.println("Welcom Back");
                break;
                
            }
        } while (!choose.equalsIgnoreCase("E"));

          System.exit(0);
    }

    public static void Administrator(Scanner input) throws ParseException {
        System.out.print("Enter your name: ");
        String administratorName = input.next();
        System.out.print("Enter your email: ");
        String email = input.next();
        System.out.print("Enter password: ");
        int password = input.nextInt();
        
        Administrator administrator = new Administrator(administratorName, email, password);
       
        boolean acc= true;

         do {       
             
          System.out.println("---------------------------------------------");
          System.out.println("1. See my profile                            ");
          System.out.println("2. Add volunteer opprtunity                  ");
          System.out.println("3. Log out                                   ");
          System.out.println("---------------------------------------------");
          System.out.print("Enter The number of the thing you want to do: ");
          
          int number = input.nextInt();
          switch (number) {
            case 1:
                System.out.println(administrator.toString()); 
                break;
            case 2:
                 System.out.print("Enter opprtunity name: ");
                 String name = input.next();
                 input.nextLine();
                 System.out.print("Enter start date (format yyyy-MM-dd):  ");
                 String StringDate = input.nextLine();
                 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                 Date StartDate = dateFormat.parse(StringDate);
                 System.out.print("Enter end date (format yyyy-MM-dd):  ");
                 String StringDate2 = input.nextLine();
                 Date EndDate = dateFormat.parse(StringDate2);
                 System.out.print("Enter time: ");
                 String Time = input.nextLine();
                 System.out.print("Enter organization name: ");
                 String Organization_name = input.next();
                 System.out.print("Enter volunteers number: ");
                 int Volunteers_number = input.nextInt();
                 System.out.print("Enter location: ");
                 String Location = input.next();
                 System.out.print("Enter the available spots: ");
                 int availableSpots = input.nextInt();

             VolunteerOpprtunity volunteeropprtunity = new VolunteerOpprtunity(name, StartDate, EndDate, Time, Organization_name, Volunteers_number, Location, availableSpots);
             Administrator.AddOpprtunity(volunteeropprtunity);
                break;
            case 3:
                acc= false;
                System.out.println();
                break;
                
            default:
                break;
        }
        } while (acc);
        
      
    }

    //walaa
    public static void Student(Scanner input) throws ParseException {
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.print("Enter your ID: ");
        int ID = input.nextInt();
        System.out.print("Enter your email: ");
        String email = input.next();
        System.out.print("Enter password: ");
        int password = input.nextInt();
        Student student = new Student(name, ID, email, password );
  
        boolean acc= true;
   
        do {
        
        System.out.println("----------------------------------------------");
        System.out.println("1. See my profile                             ");
        System.out.println("2. Apply for opprtunity                       ");
        System.out.println("3. Browes                                     ");
        System.out.println("4. Search for opprtunity                      ");
        System.out.println("5. Log out                                    ");
        System.out.println("----------------------------------------------");
        System.out.print("Enter The number of the thing you want to do: ");
        int  number = input.nextInt();
        input.nextLine();
        
         
          
                
           switch (number) {
            case 1:
                System.out.println(student.toString());
                break;
            case 2:
                  System.out.println("Available Opportunities:");
                  if (Administrator.Addopprtunity.isEmpty()){
                    System.out.println("There's no volunteer opportunity available");
                    break;
              }
               else{
                student.applyForOpportunity();
                break;
                  }
            case 3:
                System.out.print("Enter the criteria (organization/available spots): ");
                String criteria = input.next();
                System.out.print("Enter the value to filter by: ");
                String value = input.next();
                Student.browseOpportunitiesol(criteria, value);
                break;
            case 4:
                System.out.print("Enter the keyword to search for opportunities: ");
                String searchKeyword = input.next();
                Student.searchOpportunityol(searchKeyword);
                break;
            case 5:
                acc= false;
                System.out.println();
                break;
                
            default:
                break;
        }}while (acc);

        } 
  
    

}

