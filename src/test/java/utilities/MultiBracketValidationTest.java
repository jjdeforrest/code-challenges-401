package utilities;

import org.junit.Test;
import static org.junit.Assert.*;
import static utilities.MultiBracketValidation.multiBracketValidation;


public class MultiBracketValidationTest {


    @Test
    public void multiBracketValidationTestTrue() {
        assertEquals(true, multiBracketValidation("{}"));
        assertTrue(multiBracketValidation("()"));
        assertTrue(multiBracketValidation("[]"));
        assertTrue(multiBracketValidation("{[()]}"));

    }
    @Test
    public void multiBracketValidationTestFalse() {
        assertFalse(multiBracketValidation("{)"));
        assertFalse(multiBracketValidation("{})}"));
        assertFalse(multiBracketValidation("([})"));
    }


}