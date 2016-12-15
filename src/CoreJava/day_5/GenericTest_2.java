package CoreJava.day_5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李智
 * @date 2016/12/15
 */
public class GenericTest_2 {
    public static void main(String[] args) {
        /*
        List list = new ArrayList();
        list.add("justdoit");
        list.add("core");
        list.add(100);
        */

        List<String> list = new ArrayList<String>();
        list.add("justdoit");
        list.add("core");
        //list.add(100);   // 1  提示编译错误

        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i); // 2
            System.out.println("name:" + name);
        }
    }
}
