package CoreJava.day_3;

import java.util.Comparator;

/**
 * @author 李智
 * @date 2016/12/6
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double byPrecent) {
        double raise = salary * byPrecent / 100;
        salary += salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary, o.salary);
    }
}
