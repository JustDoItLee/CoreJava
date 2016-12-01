package CoreJava.day_2;


import java.lang.reflect.Field;
import java.util.Date;

/**
 * @author 李智
 * @date 2016/12/1
 */
public class ClassTest_1 {
    public static void main(String[] args) {
//        System.out.println(int[].class.getName());
        try {
            String s = "java.util.Date";
            String s2 = "CoreJava.day_2.Employee";
            Class c = Class.forName(s2);
            Employee d = (Employee) c.newInstance();
            Field[] field = c.getFields();
            System.out.println(d.toString());
            for (Field f : field){
                System.out.println(f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
