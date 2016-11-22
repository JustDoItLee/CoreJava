package CoreJava.day_1;

import java.math.BigInteger;

/**
 * @author 李智
 * @date 2016/11/22
 */
public class Looper {
    public static void main(String[] args) {
        int i = 1;
        read_data:
        while (i<5){
            for (int j = 1;j<5;j++){
                System.out.println(i);
                System.out.println(j);
                if(j>2){
                    break read_data;
                }
            }
        }
        System.out.println("------------------------");
        //大数值
        BigInteger a = BigInteger.valueOf(100);
        BigInteger b = a.multiply(a.add(BigInteger.valueOf(200)));
        System.out.println(b);

        System.out.println("-------------------------");
        //高级for循环
        int[] arr = new int[10];
        for (int c : arr){
            System.out.println(c);
        }
    }

}
