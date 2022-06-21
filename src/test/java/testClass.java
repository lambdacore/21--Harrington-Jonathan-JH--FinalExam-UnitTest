
import org.example.StringCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class testClass {

    private StringCalculator manipulatedstring;

    @BeforeEach
    public void setUp() {
        manipulatedstring = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        manipulatedstring = null;
    }

    @Test
    public void testCount1() {
        manipulatedstring.setString("1,5");
        int length = manipulatedstring.add("1,5");
        assertEquals(6, length);
    }
    @Test
    public void testRemoveNthCharacter4() {

        manipulatedstring.setString("IllegalArgument");
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () ->
                        manipulatedstring.add("-1,5"),
                "Error" );

    }
}
