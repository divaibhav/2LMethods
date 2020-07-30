/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 28-Jul-20
 *  Time: 4:29 PM
 */

/*
Create two methods with same name they are called add.
one is accepting two arguments, and another is accepting three
arguments, of type int. They will return integer value
 */
public class MethodOverLoadingDemo {
    public static void main(String[] args) {
        int no1 = 10;
        int no2 = 20;
        int no3 = 30;
        System.out.println(add(no1, no3));
        System.out.println(add(no1, no2, 40));


    }

    public static int add(int no1, int no2) {
        System.out.println("two argument add is executing");
        int response = 0;
        response = no1 + no2;
        return response;
    }

    public static int add(int no1, int no2, int no3) {
        System.out.println("three arguments add is executing");
        int response = 0;
        response = no1 + no2 + no3;
        return response;
    }

    public static double add(double no1, double no2, double no3) {
        System.out.println("double arguments");
        double response = 0.0;
        response = no1 + no2 + no3;
        return response;
    }
}
