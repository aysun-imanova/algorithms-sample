package question1;

public class BinarySearch {
    public int binarySearch(int[]array, int target){
        int left = 0;
        int right = array.length - 1;

        while(left <= right){
            int middle = left + (right - left) /2;

            if (array[middle] == target){
                return middle;
            }
            if(array[middle] < target){
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
