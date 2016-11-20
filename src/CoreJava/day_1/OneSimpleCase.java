package CoreJava.day_1;

/**
 * @author 李智
 * @date 2016/11/17
 */
public class OneSimpleCase {
    public static void main(String[] args) {
        System.out.println("Java核心技术I!");
        System.out.println(2.0 - 1.1);
        System.out.println((byte) 300);//强转超出范
        String name = "RicardoLee";
        System.out.println("the name is :" + name);
        String s = "hello";
        System.out.println(s == "hello");
        System.out.println(s.substring(0, 3) == "hel");
        //代码点
        System.out.println("__________________________");
        System.out.println(s.charAt(1));
        System.out.println(s.codePointCount(0, s.length()));
        for (int i = 0; i < s.length(); i++) {
            int index = s.offsetByCodePoints(0, i);
            System.out.println(s.codePointAt(index));
        }
    }
}
