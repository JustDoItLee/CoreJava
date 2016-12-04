package CoreJava.day_2;

/**
 * @author 李智
 * @date 2016/12/4
 */
public class ForNameDemoV2 {
    public static void main(String[] args) {
        try {
            System.out.println("加载TestClass2");
            Class c = Class.forName(
                    "CoreJava.day_2.TestClass2",
                    false, // 加载类时不执行静态代码块代码
                    Thread.currentThread().getContextClassLoader());

            System.out.println("TestClass2声明");
            TestClass2 test = null;

            System.out.println("TestClass2实例对象");
            test = new TestClass2();
        } catch (ClassNotFoundException e) {
            System.out.println("找不到指定的类");
        }
    }
}
