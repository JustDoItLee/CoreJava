package CoreJava.day_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 李智
 * @date 2016/11/22
 *
 * 彩票机制
 */
public class LotteryDraw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("你要多少个数字？");
        int k = in.nextInt();
        System.out.println("你要的最大数是？");
        int n = in.nextInt();

        int[] numbers = new int[n];
        //填充值
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            int r = (int) (Math.random() * n);
            result[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }

        //输出测试
        Arrays.sort(result);
        for (int r : result) {
            System.out.println(r);
        }
    }
}
