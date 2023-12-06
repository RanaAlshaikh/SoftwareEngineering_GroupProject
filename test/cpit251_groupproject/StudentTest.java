/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251_groupproject;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @walaa DELL
 */
public class StudentTest {

    public StudentTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of applyForOpportunity method, of class Student.
     */
    @Test
    public void testApplyForOpportunity() {
        System.out.println("applyForOpportunity");
        VolunteerOpprtunity testOpportunity = new VolunteerOpprtunity("Test Opportunity", 5);
        List<VolunteerOpprtunity> opportunities = new ArrayList<>();
        opportunities.add(testOpportunity);
        String UserInput = "1"; // Choose opportunity number 1
        InputStream inputStream = new ByteArrayInputStream(UserInput.getBytes());
        System.setIn(inputStream);
        Student instance = new Student("walaa", 2106121, "walaa@gmail", 123123);
        instance.setAppliedOpportunities(opportunities);
        instance.applyForOpportunity();
        assertEquals(1, instance.getAppliedOpportunities().size());
        assertEquals(testOpportunity, instance.getAppliedOpportunities().get(0));
        System.setIn(System.in);

    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student("walaa", 2106121, "walaa@gmail", 123123);
        String expResult = "walaa";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "sara";
        Student instance = new Student("walaa", 2106121, "walaa@gmail", 123123);
        instance.setName(name);
        String expResult = "sara";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getStudentId method, of class Student.
     */
    @Test
    public void testGetStudentId() {
        System.out.println("getStudentId");
        Student instance = new Student("walaa", 2106121, "walaa@gmail", 123123);
        int expResult = 2106121;
        int result = instance.getStudentId();
        assertEquals(expResult, result);

    }

    /**
     * Test of setStudentId method, of class Student.
     */
    @Test
    public void testSetStudentId() {
        System.out.println("setStudentId");
        int studentId = 1234;
        Student instance = new Student("walaa", 2106121, "walaa@gmail", 123123);
        instance.setStudentId(studentId);
        int expResult = 1234;
        int result = instance.getStudentId();
        assertEquals(expResult, result);

    }

    /**
     * Test of getStudentEmail method, of class Student.
     */
    @Test
    public void testGetStudentEmail() {
        System.out.println("getStudentEmail");
        Student instance = new Student("walaa", 2106121, "walaa@gmail", 123123);
        String expResult = "walaa@gmail";
        String result = instance.getStudentEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPassword method, of class Student.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Student instance = new Student("walaa", 2106121, "walaa@gmail", 123123);
        int expResult = 123123;
        int result = instance.getPassword();
        assertEquals(expResult, result);

    }

    /**
     * Test of setPassword method, of class Student.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        int password = 1234;
        Student instance = new Student("walaa", 2106121, "walaa@gmail", 123123);
        instance.setPassword(password);
        int expResult = 1234;
        int result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStudentEmail method, of class Student.
     */
    @Test
    public void testSetStudentEmail() {
        System.out.println("setStudentEmail");
        String studentEmail = "sara@gmail";
        Student instance = new Student("walaa", 2106121, "walaa@gmail", 123123);
        instance.setStudentEmail(studentEmail);
        String expResult = "sara@gmail";
        String result = instance.getStudentEmail();
        assertEquals(expResult, result);

    }

    /**
     * Test of getAppliedOpportunities method, of class Student.
     */
    @Test
    public void testGetAppliedOpportunities() {
        System.out.println("getAppliedOpportunities");
        Student instance = new Student("walaa", 2106121, "walaa@gmail", 123123);
        VolunteerOpprtunity testOpportunity = new VolunteerOpprtunity("Test Opportunity", 5);
        List<VolunteerOpprtunity> appliedOpportunities = new ArrayList<>();
        appliedOpportunities.add(testOpportunity);
        instance.setAppliedOpportunities(appliedOpportunities);
        List<VolunteerOpprtunity> result = instance.getAppliedOpportunities();
        assertEquals(appliedOpportunities, result);
    }

    /**
     * Test of setAppliedOpportunities method, of class Student.
     */
    @Test
    public void testSetAppliedOpportunities() {
        System.out.println("setAppliedOpportunities");
        VolunteerOpprtunity testOpportunity = new VolunteerOpprtunity("Test Opportunity", 5);
        List<VolunteerOpprtunity> appliedOpportunities = new ArrayList<>();
        appliedOpportunities.add(testOpportunity);
        Student instance = new Student("walaa", 2106121, "walaa@gmail", 123123);
        instance.setAppliedOpportunities(appliedOpportunities);
        List<VolunteerOpprtunity> result = instance.getAppliedOpportunities();
        assertEquals(appliedOpportunities, result);
    }

    @Test
    public void testBrowseOpportunitiesByOrganization() {
        // Create some sample opportunities
        VolunteerOpprtunity opportunity1 = new VolunteerOpprtunity("Opportunity 1", 10);
        VolunteerOpprtunity opportunity2 = new VolunteerOpprtunity("Opportunity 2", 5);

        // Add opportunities to the list
        Administrator.Addopprtunity.add(opportunity1);
        Administrator.Addopprtunity.add(opportunity2);

        // Perform browsing by organization
        Student.browseOpportunities("organization", "Org1");

        // Check if the output matches the expected result
        assertEquals("Opportunity 1", opportunity1.getName());
    }

    @Test
    public void testBrowseOpportunitiesByAvailableSpots() {
        // Create some sample opportunities
        VolunteerOpprtunity opportunity1 = new VolunteerOpprtunity("Opportunity 1", 10);
        VolunteerOpprtunity opportunity2 = new VolunteerOpprtunity("Opportunity 2",  5);

        // Add opportunities to the list
        Administrator.Addopprtunity.add(opportunity1);
        Administrator.Addopprtunity.add(opportunity2);

        // Perform browsing by available spots
        Student.browseOpportunities("available spots", "7");

        // Check if the output matches the expected result
        assertEquals("Opportunity 1", opportunity1.getName());
    }

    @Test
    public void testSearchOpportunity() {
        // Create some sample opportunities
        VolunteerOpprtunity opportunity1 = new VolunteerOpprtunity("Opportunity 1", 10);
        VolunteerOpprtunity opportunity2 = new VolunteerOpprtunity("Opportunity 2",  5);

        // Add opportunities to the list
        Administrator.Addopprtunity.add(opportunity1);
        Administrator.Addopprtunity.add(opportunity2);

        // Perform searching by opportunity name
        Student.searchOpportunity("Opportunity 2");

        // Check if the output matches the expected result
        assertEquals("Opportunity 2", opportunity2.getName());
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student("walaa", 2106121, "walaa@gmail", 123123);
        String expResult = "\nProfile \n" + "Name: " + "walaa" + "     Student ID: " + 2106121 + "     Student Email: " + "walaa@gmail" + "     Password: " + 123123;
        String result = instance.toString();
        assertEquals(expResult, result);

    }
}
