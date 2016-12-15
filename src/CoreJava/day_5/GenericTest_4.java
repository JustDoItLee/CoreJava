package CoreJava.day_5;

/**
 * @author 李智
 * @date 2016/12/15
 */
public class GenericTest_4 {
    public static void main(String[] args) {

        Box<String> name = new Box<String>("core");
        Box<Integer> age = new Box<Integer>(712);

        System.out.println("name class:" + name.getClass());      // CoreJava.day_5.Box
        System.out.println("age class:" + age.getClass());        // CoreJava.day_5.Box
        System.out.println(name.getClass() == age.getClass());    // true

    }
}
