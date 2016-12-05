package CoreJava.day_2;

import java.lang.reflect.Array;

/**
 * @author 李智
 * @date 2016/12/5
 */
public class NewArrayDemo {
    public static void main(String[] args) {
        Class c = String.class;
        Object objArr = Array.newInstance(c, 5);

        for (int i = 0; i < 5; i++) {
            Array.set(objArr, i, i + "");
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(Array.get(objArr, i) + " ");
        }
        System.out.println();

        String[] strs = (String[]) objArr;
        for (String s : strs) {
            System.out.print(s + " ");
        }
    }
}
