package attractions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;


    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.001);

    }

    @Test
    public void canVisit(){
        visitor = new Visitor(15, 150, 50);
        assertTrue(rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void cannotVisitIfYoungerThanTwelve(){
        visitor = new Visitor (11, 140, 50);
        assertFalse(rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void cannotVisitIfShorterThan145(){
        visitor = new Visitor(20, 140, 50);
        assertFalse(rollerCoaster.isAllowedTo(visitor));



    }

}
