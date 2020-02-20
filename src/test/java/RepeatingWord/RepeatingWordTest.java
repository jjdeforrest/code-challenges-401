package RepeatingWord;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RepeatingWordTest {

    @Test
    public void testRepeatedWordHappyPath(){
        assertEquals("the",RepeatingWord.repeatingWord("the hello yo the it hello yo"));
    }

    @Test
    public void testRepeatedWordHappy(){
        assertNull(RepeatingWord.repeatingWord("the hello yo it joker"));
    }

    @Test
    public void testRepeatedWordEdgeCases(){
        assertEquals("joker",RepeatingWord.repeatingWord("joker bane joker bane bane hello hello"));
    }




}