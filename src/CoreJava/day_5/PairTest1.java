package CoreJava.day_5;

/**
 * @author 李智
 * @date 2016/12/11
 */
public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> mm = ArrayLag.minmax(words);
        System.out.println("min=" + mm.getFirst());
        System.out.println("max=" + mm.getSecond());
    }
}

class ArrayLag {
    //获取String数组的最大值最小值
    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0) return null;
        String min = a[0];
        String max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (min.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }
}