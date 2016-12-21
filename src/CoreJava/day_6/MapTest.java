package CoreJava.day_6;

import CoreJava.day_3.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 李智
 * @date 2016/12/21
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Employee> staff = new HashMap<>();
        staff.put("123", new Employee("jack", 100));
        staff.put("234", new Employee("mark", 200));
        staff.put("345", new Employee("marin", 300));
        System.out.println(staff);

        staff.remove("234");

        staff.put("123", new Employee("france", 300));

        System.out.println(staff.get("123"));

        Set<String> set = staff.keySet();
        for (Map.Entry<String, Employee> entry : staff.entrySet()) {
            String key = entry.getKey();
            Employee value = entry.getValue();
            System.out.println("key=" + key + ",value=" + value);
        }
    }
}
