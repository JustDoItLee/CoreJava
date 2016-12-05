package CoreJava.day_2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 李智
 * @date 2016/12/5
 */
public class InvokeMethodDemo {
    public static void main(String[] args) {
        try {
            Class c = Class.forName(args[0]);
            // 使用无参构造方法实例对象
            Object targetObj = c.newInstance();
            // 设置参数类型
            Class[] param1 = {String.class};
            // 根据参数取回方法
            Method setNameMethod = c.getMethod("setName", param1);
            // 设置引用
            Object[] argObjs1 = {"caterpillar"};
            // 给引用调用指定对象的方法方法
            setNameMethod.invoke(targetObj, argObjs1);


            Class[] param2 = {Integer.TYPE};
            Method setScoreMethod =
                    c.getMethod("setScore", param2);

            Object[] argObjs2 = {new Integer(90)};
            setScoreMethod.invoke(targetObj, argObjs2);
            // 显示类描述
            System.out.println(targetObj);

        } catch (ClassNotFoundException e) {
            System.out.println("找不到类");
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            System.out.println("没有这个方法");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
