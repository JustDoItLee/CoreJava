package CoreJava.day_3;

/**
 * @author 李智
 * @date 2016/12/7
 */
public class CloneTest {
    public static void main(String[] args) {
        try {
            Employee original = new Employee("Mr.Q",500);
            original.setHireDay(2017,1,1);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2016,12,7);
            System.out.println("original:"+original.toString());
            System.out.println("copy:"+copy.toString());
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
