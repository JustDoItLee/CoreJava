package CoreJava.day_2;

import java.util.ArrayList;

/**
 * @author 李智
 * @date 2016/11/29
 */
public class EqualsTest {
    public static void main(String[] args) {
        Employee_3 a1 = new Employee_3("Alice Adams", 75000, 1993, 9, 26);
        Employee_3 a2 = a1;
        Employee_3 a3 = new Employee_3("Alice Adams", 75000, 1993, 9, 26);
        Employee_3 b = new Employee_3("Bob Brandson", 50000, 2001, 3, 8);

        System.out.println("a1 == a1:" + (a1 == a2));
        System.out.println("a1 == a3:" + (a1 == a3));
        System.out.println("a1.equals(a3):" + a1.equals(a3));
        System.out.println("a1.equals(b):" + a1.equals(b));
        System.out.println("b1.toString():" + b.toString());

        System.out.println("a1.hashCode():" + a1.hashCode());
        System.out.println("a2.hashCode():" + a2.hashCode());
        System.out.println("a3.hashCode():" + a3.hashCode());
        System.out.println("b.hashCode():" + b.hashCode());
    }
}
