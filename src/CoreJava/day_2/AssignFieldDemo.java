package CoreJava.day_2;

import java.lang.reflect.Field;

/**
 * @author 李智
 * @date 2016/12/5
 */
public class AssignFieldDemo {
    public static void main(String[] args) {
        try {
            Class c = Class.forName(args[0]);
            Object targetObj = c.newInstance();

            Field testInt = c.getField("testInt");
            testInt.setInt(targetObj, 99);

            Field testString = c.getField("testString");
            testString.set(targetObj, "caterpillar");

            System.out.println(targetObj);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("没有指定类");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到指定的类");
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            System.out.println("找不到指定的成员变量");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
