package CoreJava.day_3;

import java.util.Arrays;

/**
 * @author 李智
 * @date 2016/12/6
 * <p>
 * 实现compareto接口排序
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry", 300);
        staff[1] = new Employee("Jack", 400);
        staff[2] = new Employee("Sequn", 500);

        Arrays.sort(staff);
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ";salary=" + e.getSalary());
        }
    }
}

