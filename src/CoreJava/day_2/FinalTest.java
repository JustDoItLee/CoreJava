package CoreJava.day_2;

/**
 * @author 李智
 * @date 2016/11/25
 *
 * 测试final属性
 */
public class FinalTest {
    private final Person person = new Person("jack",18);

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();
        System.out.println(finalTest.person.getName()+"----"+finalTest.person.getAge());
        finalTest.person.setName("lily");
        System.out.println(finalTest.person.getName() + "----" + finalTest.person.getAge());
    }
}
