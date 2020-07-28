/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 28-Jul-20
 *  Time: 4:06 PM
 */

import java.util.Scanner;

// Create a method isEven(int no1),
// this method will check if the given no is even if the no is
// even it will return true otherwise false
// Accept the number from user in main method and pass
// the number as argument in method
public class MethodDemoIsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number1 = sc.nextInt();
        MethodDemoIsEven object = new MethodDemoIsEven();

        boolean result = object.isEven(number1);
        System.out.println("NUmber is Even -->" + result);
    }

    public boolean isEven(int no1) {
        boolean response = false;
        if (no1 % 2 == 0) {
            response = true;
        }
        return response;
    }
}
