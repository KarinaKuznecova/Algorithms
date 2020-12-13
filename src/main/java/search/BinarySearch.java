package search;

public class BinarySearch {

    public int findIndexOfNumber(int[] array, int number) {
        int lowest = 0;
        int highest = array.length - 1;

        int attempts = 0;
        while (lowest <= highest) {
            attempts++;
            int middle = (lowest + highest) / 2;
            int guess = array[middle];
            if (guess == number) {
                System.out.println("Used " + attempts + " attempts to find index of a number in " + array.length + " elements array");
                return middle;
            }
            if (guess > number) {
                highest = middle - 1;
            } else {
                lowest = middle + 1;
            }
        }
        return -1;
    }
}
