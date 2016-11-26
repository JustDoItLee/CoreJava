package CoreJava.day_2;

/**
 * @author 李智
 * @date 2016/11/26
 */
public class Employee_2 {

    private static int nextId;

    private String name;
    private double salary;
    private int id;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNextId(){
        return nextId;
    }

    {
        id = nextId;
        nextId++;
    }

    public static void main(String[] args) {
        Employee_2 employee = new Employee_2();
        System.out.println(employee.getNextId());
    }
}
