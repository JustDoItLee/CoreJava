package CoreJava.day_2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author 李智
 * @date 2016/12/2
 */
public class CopyOfTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        a = (int[]) goodCopyOf(a, 10);
        System.out.println(Arrays.toString(a));
        String[] b = {"Tom", "Dick", "Harry"};
        b = (String[]) goodCopyOf(b, 10);
        System.out.println(Arrays.toString(b));

        System.out.println("下面这个没吊用的方法会报异常");
        b = (String[]) badCopyOf(b,10);
    }

    /**
     * 拓展数组(没吊用的)
     *
     * @param a
     * @param newLength
     * @return
     */
    public static Object[] badCopyOf(Object[] a, int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }

    /**
     * 拓展数组（有用的）
     *
     * @param a
     * @param newLength
     * @return
     */
    public static Object goodCopyOf(Object a, int newLength) {
        Class c1 = a.getClass();
        if (!c1.isArray()) return null;
        Class componentType = c1.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }


}
