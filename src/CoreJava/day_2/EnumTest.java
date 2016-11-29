package CoreJava.day_2;

import java.util.Scanner;

/**
 * @author 李智
 * @date 2016/11/29
 */
public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入:");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size:" + size);
    }
}

enum Size {
//    SMALL("S"),MEDIUM("M"),LGRGE("L");
}