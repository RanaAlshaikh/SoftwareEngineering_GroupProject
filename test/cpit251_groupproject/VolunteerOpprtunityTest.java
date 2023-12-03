package cpit251_groupproject;
import cpit251_groupproject.VolunteerOpprtunity;
import org.junit.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;
//Manar
public class VolunteerOpprtunityTest {
    @Test
    public void testConstructorWithAvailableSpots() {
        VolunteerOpprtunity opportunity = new VolunteerOpprtunity("Opportunity1", 10);

        assertEquals("Opportunity1", opportunity.getName());
        assertEquals(10, opportunity.getAvailableSpots());
    }

    @Test
    public void testReduceAvailableSpots() {
        VolunteerOpprtunity opportunity = new VolunteerOpprtunity("Opportunity1", 5);
        opportunity.reduceAvailableSpots();

        assertEquals(4, opportunity.getAvailableSpots());
    }

    @Test
    public void testToString() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = dateFormat.parse("2023-01-01");
        Date endDate = dateFormat.parse("2023-01-02");

        VolunteerOpprtunity opportunity = new VolunteerOpprtunity(
                "Opportunity1",
                startDate,
                endDate,
                "10:00 AM - 12:00 PM",
                "Organization1",
                10,
                "Location1",
                5
        );

        String expectedToString = "Volunteer Opprtunity name: Opportunity1, StartDate: 2023-01-01, EndDate: 2023-01-02, Time: 10:00 AM - 12:00 PM, Organization_name: Organization1, Volunteers_number: 10, location: Location1\nAvailable Spots: 5\n";
        assertEquals(expectedToString, opportunity.toString());
    }
}
