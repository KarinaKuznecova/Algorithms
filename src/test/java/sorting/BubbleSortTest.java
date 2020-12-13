package sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void sort() {
        int[] array = {11, 3, 14, 16, 7};
        bubbleSort.sort(array);
        int[] expected = {3, 7, 11, 14, 16};

        assertEquals(Arrays.toString(expected), Arrays.toString(array));
    }

}