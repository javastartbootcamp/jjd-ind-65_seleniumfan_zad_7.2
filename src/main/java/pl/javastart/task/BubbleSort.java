package pl.javastart.task;

public class BubbleSort {
    public int sort(int[] inputArray) {
        int numberOfComparisons = 0;
        int counter = 1;
        boolean isChange;
        do {
            isChange = false;
            for (int i = 0; i < inputArray.length - counter; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    swap(inputArray, i, i + 1);
                    isChange = true;
                }
                numberOfComparisons++;
            }
            counter++;
        } while (isChange);
        return numberOfComparisons;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
