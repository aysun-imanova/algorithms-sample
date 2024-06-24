package question1;

import util.Creation;
import util.Sorting;

public class Main {
    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();

        int[] array = Creation.createArray();
        Sorting.sortArray(array);
        int target = Creation.target();
        search.binarySearch(array, target);

        System.out.println("Your target index is: " + search.binarySearch(array, target));
    }
}
