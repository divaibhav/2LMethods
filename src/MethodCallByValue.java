/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 30-Jul-20
 *  Time: 4:14 PM
 */

/*
create a method add which accept two integer arguments and returns sum of those
 arguments, we will modify formal argument  and check the effect on actual arguments
 */
public class MethodCallByValue {
    public static void main(String[] args) {
        //actual arguments
        int no1 = 10;
        int no2 = 20;
        MethodCallByValue obj = new MethodCallByValue();
        System.out.println(obj.add(no1, no2));
        System.out.println("no1 = " + no1);
        System.out.println("no2 = " + no2);
    }

    public int add(int no1, int no2) {
        int response = no1 + no2;
        no1 = 0;
        no2 = 0;
        System.out.println("no1 formal = " + no1);
        System.out.println("no2 formal = " + no2);
        return response;
    }
}
