package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class WithStringTest {

    WithString withString = new WithString();
    public final String LINE = "I love programming";

    @Test
    public void backwards() {
        String expected = "gnimmargorp evol I";
        assertEquals(expected, withString.backwards(LINE));
    }

    @Test
    public void countSpaces() {
        assertEquals(2, withString.countSpaces(LINE));
    }

}