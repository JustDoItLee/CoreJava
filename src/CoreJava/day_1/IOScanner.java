package CoreJava.day_1;

import java.io.Console;
import java.util.Date;
import java.util.Scanner;

/**
 * @author 李智
 * @date 2016/11/21
 */
public class IOScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input your name;");
//        String name = in.nextLine();//一行
//        String name = in.next();//一个单词 以空格为分隔符
//        System.out.println(name);
//        Java.io.Console只能用在标准输入、输出流未被重定向的原始控制台中使用，在 Eclipse 或者其他 IDE 的控制台是用不了的。
//        Console console = System.console();
//        String username = console.readLine("what's your username?");
//        char[] password = console.readPassword("password");
        double x = 10000.0 / 3.0;
        System.out.println(x);
        System.out.printf("%8.2f", x);
        System.out.printf("%,.2f\n", 10000.0 / 3.0);
        System.out.printf("%tc\n", new Date());//时间格式
        System.out.println(System.getProperty("OneSimpleCase.class"));
        for (int i = 10; i > 0; i--) {
            System.out.println("counting down----" + i);
        }
        //求n*(n-1)*(n-2)*...*(n-k+1)/1*2*3*...*k;
        int lotteryOdds = 1;
        System.out.println("输入k");
        int k = in.nextInt();
        System.out.println("输入n");
        int n = in.nextInt();
        for (int i = 1; i < k; i++) {
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
        }
        System.out.println(lotteryOdds);

        //switch
        String input = "hello";
        switch (input.toLowerCase()){
            case "hello":
                System.out.println("hello world!");
                break;
        }
    }
}
