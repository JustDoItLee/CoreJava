package CoreJava.day_2;

/**
 * @author 李智
 * @date 2016/12/5
 */
public class ForNameDemoV3 {
    public static void main(String[] args) {
        try {
            System.out.println("加载TestClass2");
            ClassLoader loader = ForNameDemoV3.class.getClassLoader();
            Class c = loader.loadClass("CoreJava.day_2.TestClass2");

            System.out.println("TestClass2声明");
            TestClass2 test = null;

            System.out.println("TestClass2实例对象");
            test = new TestClass2();
        } catch (ClassNotFoundException e) {
            System.out.println("找不到指定的类");
        }
    }
}
