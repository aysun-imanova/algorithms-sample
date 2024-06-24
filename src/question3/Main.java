package question3;

import util.Creation;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        SquareRoot root = new SquareRoot();

        int x = Creation.createNum();
        int sqrtValue = root.sqrt(x);
        System.out.println("Square root of " + x + " is " + sqrtValue);
    }
}
