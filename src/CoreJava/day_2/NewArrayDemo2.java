package CoreJava.day_2;

import java.lang.reflect.Array;

/**
 * @author 李智
 * @date 2016/12/5
 */
public class NewArrayDemo2 {
    public static void main(String[] args) {
        Class c = String.class;

        // 打算建立一个3*4数组
        int[] dim = new int[]{3, 4};
        Object objArr = Array.newInstance(c, dim);

        for (int i = 0; i < 3; i++) {
            Object row = Array.get(objArr, i);
            for (int j = 0; j < 4; j++) {
                Array.set(row, j, "" + (i + 1) * (j + 1));
            }
        }

        for (int i = 0; i < 3; i++) {
            Object row = Array.get(objArr, i);
            for (int j = 0; j < 4; j++) {
                System.out.print(Array.get(row, j) + " ");
            }
            System.out.println();
        }
    }
}
