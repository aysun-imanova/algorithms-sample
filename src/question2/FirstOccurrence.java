package question2;

import question1.BinarySearch;

public class FirstOccurrence {

    BinarySearch search = new BinarySearch();

    public int firstOccurrence(int[] array, int target) {
        int index = search.binarySearch(array, target);

        if (index == -1) {
            return -1;
        }

        while (index > 0 && array[index - 1] == target) {
            index--;
        }
        return index;
    }

    public String getFirstOccurrenceMessage(int[] array, int target){
        int firstIndex = firstOccurrence(array, target);

        if(firstIndex != -1){
            return "The first occurrence of " + target + " is at index " + firstIndex;
        } else {
            return "The target " + target + " is not present in the array";
        }
    }
}
