package CoreJava.day_2;

/**
 * @author 李智
 * @date 2016/11/26
 */
public class StaticTest {
    public static void main(String[] args) {
        Employee[] stuff = new Employee[3];

        stuff[0] = new Employee("tom",4000);
        stuff[1] = new Employee("dick",6000);
        stuff[2] = new Employee("harry",5000);

        for (Employee e:stuff){
            e.setId();
            System.out.println("name:"+e.getName()+",id:"+e.getId()+",salary:"+e.getSalary());
        }

        int n = Employee.getNextId();
        System.out.println(n);
    }
}
