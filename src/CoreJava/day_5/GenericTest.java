package CoreJava.day_5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李智
 * @date 2016/12/15
 */
public class GenericTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("justdoit");
        list.add("core");
        list.add(100);

        for (int i = 0; i < list.size(); i++) {
            String name = (String) list.get(i); // 1
            System.out.println("name:" + name);
        }
    }
}
