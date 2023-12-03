package cpit251_groupproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RANAA
 */
public class AdministratorTest {
    
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    public AdministratorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before Class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("After Class");
    }
    
    @Before
    public void setUp() {
        System.out.println("Before Method");
    }
    
    @After
    public void tearDown() {
        System.out.println("After Method");
    }

    /**
     * Test of getName method, of class Administrator.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Administrator instance = new Administrator("Rana","Rana@gmail.com", 12345);
        String expResult = "Rana";
        String result = instance.getName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setName method, of class Administrator.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Ola";
        Administrator instance = new Administrator();
        instance.setName(name);
    
    }

    /**
     * Test of getAdministratorEmail method, of class Administrator.
     */
    @Test
    public void testGetAdministratorEmail() {
        System.out.println("getAdministratorEmail");
        Administrator instance = new Administrator("Sadeem","Sadeem@gmail.com", 56789);
        String expResult = "Sadeem@gmail.com";
        String result = instance.getAdministratorEmail();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setAdministratorEmail method, of class Administrator.
     */
    @Test
    public void testSetAdministratorEmail() {
        System.out.println("setAdministratorEmail");
        String administratorEmail = "Ola@gmail.com";
        Administrator instance = new Administrator();
        instance.setAdministratorEmail(administratorEmail);
      
    }

    /**
     * Test of getAddopprtunity method, of class Administrator.
     */
    @Test
    public void testGetAddopprtunity() throws ParseException {
        System.out.println("getAddopprtunity");
        String startDateString = "2014-04-04";
        String endDateString = "2014-04-14";
        Date startDate = dateFormat.parse(startDateString);
        Date endDate = dateFormat.parse(endDateString);
        VolunteerOpprtunity Addopprtunity = new VolunteerOpprtunity("Senior Center Assistance", startDate, endDate, "10:00 AM", "Golden Age Center", 9, "Senior Care Center", 3);
        Administrator.AddOpprtunity(Addopprtunity);
        ArrayList<VolunteerOpprtunity> expResult = new ArrayList<>();
        expResult.add(Addopprtunity);
        ArrayList<VolunteerOpprtunity> result = Administrator.getAddopprtunity();   
        System.out.println("Expected: " + expResult);
        System.out.println("Actual  : " + result);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setAddopprtunity method, of class Administrator.
     */
    @Test(timeout = 91)
    public void testSetAddopprtunity() throws ParseException {
        System.out.println("setAddopprtunity");
        String startDateString = "2015-05-05";
        String endDateString = "2015-05-15";
        Date startDate = dateFormat.parse(startDateString);
        Date endDate = dateFormat.parse(endDateString); 
        VolunteerOpprtunity opprtunity = new VolunteerOpprtunity("Animal Shelter", startDate, endDate, "09:00 PM", "Paws Rescue", 15, "Pet Shelter", 6);
        ArrayList<VolunteerOpprtunity> Addopprtunity = new ArrayList<>();
        Addopprtunity.add(opprtunity);
        Administrator.setAddopprtunity(Addopprtunity);
     
    }

    /**
     * Test of AddOpprtunity method, of class Administrator.
     */
    @Test
    public void testAddOpprtunity() throws ParseException {
        System.out.println("AddOpprtunity");
        String startDateString = "2012-12-12";
        String endDateString = "2012-12-22";
        Date startDate = dateFormat.parse(startDateString);
        Date endDate = dateFormat.parse(endDateString);
        VolunteerOpprtunity volunteeropprtunity = new VolunteerOpprtunity("Community Cleanup", startDate, endDate, "04:00 PM", "Green Team", 20, "City Park", 7);;
        Administrator.AddOpprtunity(volunteeropprtunity);
      
    }

    /**
     * Test of getPassword method, of class Administrator.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Administrator instance = new Administrator("Jana","Jana@gmail.com", 237819);
        int expResult = 237819;
        int result = instance.getPassword();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setPassword method, of class Administrator.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        int password = 1001;
        Administrator instance = new Administrator();
        instance.setPassword(password);
      
    }

    /**
     * Test of toString method, of class Administrator.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Administrator instance = new Administrator("Noor","Noor@gmail.com", 237819);
        String expResult = "\nProfile \n" + "Name: " + "Noor" + "     Administrator Email: " + "Noor@gmail.com" + "     Password: " + 237819 ;
        String result = instance.toString();
        assertNotNull(expResult, result);
     
    }
    
}
