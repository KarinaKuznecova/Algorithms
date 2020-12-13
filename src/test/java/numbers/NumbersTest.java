package numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    Numbers numbers = new Numbers();

    @Test
    public void oddNumbers() {
        assertTrue(numbers.isOddNumber(3));
        assertTrue(numbers.isOddNumber(13));
        assertFalse(numbers.isOddNumber(22));
        assertFalse(numbers.isOddNumber(0));
    }


    @Test
    public void sumInRange() {
        assertEquals(10, numbers.sumInRange(1, 4));
        assertEquals(12, numbers.sumInRange(5, 3));
    }

    @Test
    public void getEvenNumberCountInRange() {
        assertEquals(10, numbers.getEvenNumberCountInRange(1, 20));
        assertEquals(2, numbers.getEvenNumberCountInRange(7, 4));
    }

    @Test
    public void calculatePower() {
        assertEquals(8, numbers.calculatePower(2, 3));
        assertEquals(1, numbers.calculatePower(1, 123));
    }

}