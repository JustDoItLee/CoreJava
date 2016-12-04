package CoreJava.day_2;

/**
 * @author 李智
 * @date 2016/12/3
 */
public class LoadClassTest {
    public static void main(String[] args) {
        TestClass test = null;
        System.out.println("声明TestClass");
        test = new TestClass();
        System.out.println("生成TestClass实例");
    }
}
