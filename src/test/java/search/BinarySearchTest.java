package search;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    BinarySearch search = new BinarySearch();

    @Test
    public void search() {
        int[] sortedArray = {1, 2, 4, 34, 36, 38, 100, 102, 202, 203, 204};
        assertEquals(3, search.findIndexOfNumber(sortedArray, 34));
        assertEquals(-1, search.findIndexOfNumber(sortedArray, 5));
        assertEquals(10, search.findIndexOfNumber(sortedArray, 204));
        assertEquals(0, search.findIndexOfNumber(sortedArray, 1));
    }

}