package question3;

public class SquareRoot {
    public int sqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1;
        int right = x;
        int result = 0;

        while (left <= x) {
            int middle = left + (right - left) / 2;
            long square = (long) middle * middle;

            if (square == x) {
                return middle;
            } else if (square < x) {
                left = middle + 1;
                result = middle;
            } else {
                right = middle - 1;
            }
        }
        return result;
    }
}
