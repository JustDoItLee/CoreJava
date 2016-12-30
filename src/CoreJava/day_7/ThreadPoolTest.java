package CoreJava.day_7;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.*;

/**
 * @author 李智
 * @date 2016/12/30
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("输入目录:");
        String directory = in.nextLine();
        System.out.print("输入关键字：");
        String keyword = in.nextLine();

        ExecutorService pool = Executors.newCachedThreadPool();
        MatchCounter counter = new MatchCounter(new File(directory), keyword);
        Future<Integer> result = pool.submit(counter);

        try {
            System.out.println(result.get() + "matching files.");
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {

        }
        pool.shutdown();
    }
}

