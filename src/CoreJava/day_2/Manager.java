package CoreJava.day_2;

/**
 * @author 李智
 * @date 2016/11/27
 *
 */
public class Manager extends Employee {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public static void main(String[] args) {
        Employee e;
        e = new Employee();
        e = new Manager(); //多态
    }
}
