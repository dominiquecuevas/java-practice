package com.helloworld;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
//        primitive type
        byte age = 30;
//        reference type has members, complex objects
        Date now = new Date();
        System.out.println(now);
//        x and y in diff memory for primitive type
//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y);
//        variable holds point address for ref types
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

//        String message = new String("Hello World");
//        simplify for String, don't need new
        String message = "  " + "Hello World" + "!!" + "  ";
        System.out.println(message);
        System.out.println(message.endsWith("!"));
        System.out.println(message.startsWith("!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
//        returns -1 if not in string
        System.out.println(message.indexOf("sky"));
        System.out.println(message.replace('!', '*'));
        System.out.println(message);
        System.out.println(message.toLowerCase());
        System.out.println(message);
        System.out.println(message.trim());
        System.out.println("c:\\Windwows\t\ttabbing");

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
//        Exception(error) raised
//        numbers[10] = 3;
//        printing array returns a string rep address in memory
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
//        initialize array with nums
        int[] nums = {2,3,5,1,4};
        System.out.println(Arrays.toString(nums));
        System.out.println(nums.length);
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

//        2D array
        int[][] items = new int[2][3];
        items[0][0] = 1;
        System.out.println(Arrays.deepToString(items));
//        2D array second method
        int[][] items_ = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(items_));

//        constant variable
        final float PI = 3.14F;

        double result = (double)10 / (double)3;
        System.out.println(result);

        int x = 1;
//        increments x then copies to y
        int y = ++x;
//        copies x to y, then x is incremented
        y = x++;
        x += 1;
        System.out.println(x);
        System.out.println(y);
    }
}
