package CoreJava.day_2;

/**
 * @author 李智
 * @date 2016/11/28
 *
 * 多态
 */
public class PolymorphismDemo {
    public static void main(String[] args) {
        //Manager m = new Employee(); false
        //Employee e = new Manager(); true
        //Manager m = (Manager) new Employee(); true
        Manager m;
        Employee[] employees = new Employee[3];
        if (employees[0] instanceof Manager) {
            m = (Manager) employees[0];
        }
    }
}
