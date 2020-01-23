package utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {


    @Test
    public void testDequeueMethod() {

        AnimalShelter seattle = new AnimalShelter();
        seattle.enqueue("dogone");
        seattle.enqueue("dogtwo");
        String actual = seattle.dequeue();
        String expected = "dogone";
        assertEquals("return the first animal", expected, actual);

    }


    @Test
    public void testEnqueueMethod() {

        AnimalShelter seattle = new AnimalShelter();
        seattle.enqueue("catone");
        seattle.enqueue("cattwo");
        String actual = seattle.dequeue();
        String expected = "catone";
        assertEquals("return the first animal", expected, actual);

    }

    @Test
    public void testPrefDog() {
        AnimalShelter seattle = new AnimalShelter();
        String actual = seattle.prefCheckDogorCat("dog");
        String expected = "accepted";
        assertEquals("return accepted", expected, actual);
    }

    @Test
    public void testPrefCat() {
        AnimalShelter seattle = new AnimalShelter();
        String actual = seattle.prefCheckDogorCat("cat");
        String expected = "accepted";
        assertEquals("return accepted", expected, actual);
    }

    @Test
    public void testPrefCatorDog() {
        AnimalShelter seattle = new AnimalShelter();
        String actual = seattle.prefCheckDogorCat("lizard");
        String expected = "hell no";
        assertEquals("return hell no", expected, actual);
    }

}