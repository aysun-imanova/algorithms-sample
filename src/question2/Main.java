package question2;

import question1.BinarySearch;
import util.Creation;
import util.Sorting;

public class Main {
    public static void main(String[] args) {

        BinarySearch search = new BinarySearch();
        FirstOccurrence occurrence = new FirstOccurrence();

        int[] array = Creation.createArray();
        Sorting.sortArray(array);
        int target = Creation.target();

        String resultMessage = occurrence.getFirstOccurrenceMessage(array, target);
        System.out.println(resultMessage);
    }
}
