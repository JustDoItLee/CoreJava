package CoreJava.day_2;

/**
 * @author 李智
 * @date 2016/11/28
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] person = new Person[1];
        person[0] = new Student("math","jack",11);
        System.out.println(person[0].toString());
    }
}
