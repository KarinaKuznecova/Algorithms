package sorting;

public class BubbleSort {

    public int[] sort(int[] array) {
        boolean isSorted = false;
        int tmp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }
            }
        }
       return array;
    }
}
