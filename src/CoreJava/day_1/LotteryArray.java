package CoreJava.day_1;

/**
 * @author 李智
 * @date 2016/11/22
 * <p>
 * 不规则数组
 */
public class LotteryArray {
    public static void main(String[] args) {
        final int NMAX = 10;
        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++) {
            odds[n] = new int[n + 1];
        }
        for (int n = 0; n < odds.length; n++) {
            for (int k = 0; k <= odds[n].length; k++) {
                int lotterodds = 1;
                for (int i = 1; i <= k; i++) {
                    lotterodds = lotterodds * (n - i + 1) / i;
                    odds[n][k] = lotterodds;
                }
                for (int[] row : odds) {
                    System.out.printf("%4d\n", odds);
                }
            }
        }

    }
}
