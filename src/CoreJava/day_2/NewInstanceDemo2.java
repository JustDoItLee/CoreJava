package CoreJava.day_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 李智
 * @date 2016/12/5
 */
public class NewInstanceDemo2 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName(args[0]);

            // 指定参数
            Class[] params = new Class[2];
            // 第一个是String
            params[0] = String.class;
            // 第二个是int
            params[1] = Integer.TYPE;

            // 取得对应的构造方法
            Constructor constructor =
                    c.getConstructor(params);

            // 指定引用内容
            Object[] argObjs = new Object[2];
            argObjs[0] = "caterpillar";
            argObjs[1] = new Integer(90);

            // 给定引用并初始化
            Object obj = constructor.newInstance(argObjs);
            // toString()查看
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            System.out.println("找不到类");
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            System.out.println("没有所指定的方法");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
