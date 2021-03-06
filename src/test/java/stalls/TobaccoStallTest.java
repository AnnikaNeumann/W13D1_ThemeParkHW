package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;


public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canVisit(){
        visitor = new Visitor(18,200, 50 );
        assertTrue(tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void cannotVisit(){
        visitor = new Visitor(16, 200, 50);
        assertFalse(tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void hasRating(){
        assertEquals(5, tobaccoStall.getRating());
    }
}
