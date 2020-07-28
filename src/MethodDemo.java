/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 25-Jul-20
 *  Time: 3:39 PM
 */

//creating a method called add, the accept 2 arguments of type int and
// perform addition of that two numbers and returns the sum
public class MethodDemo {
    public static void main(String[] args) {
        int no1 = 10;
        int no2 = 20;
        // creating object to call method
        MethodDemo obj = new MethodDemo();
        int result = add(no1, no2);
        System.out.println("sum = " + result);
    }

    public static int add(int no1, int no2) {
        int response = 0;
        response = no1 + no2;
        return response;
    }
}
