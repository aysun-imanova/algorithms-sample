package util;

import java.util.Arrays;
import java.util.Scanner;

public class Creation {

    static Scanner stdin = new Scanner(System.in);

    public static int[] createArray() {

        System.out.print("Enter the array size: ");
        int count = stdin.nextInt();
        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter the " + i + " element of array: ");
            array[i] = stdin.nextInt();
        }
        System.out.println("Your array: " + Arrays.toString(array));
        return array;
    }


    public static int target() {
        System.out.print("Enter the target: ");
        int target = stdin.nextInt();
        return target;
    }

    public static int createNum(){
        System.out.print("Enter the number: ");
        int num = stdin.nextInt();
        return num;
    }
}
