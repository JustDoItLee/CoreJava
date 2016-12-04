package CoreJava.day_2;

/**
 * @author 李智
 * @date 2016/12/4
 */
public class ClassInfoDemo {
    public static void main(String[] args) {
        try {
            Class c = Class.forName(args[0]);
            Package p = c.getPackage();
            System.out.println(p.getName());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("没有指定类");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到指定类");
        }
    }
}
