package CoreJava.day_5;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author 李智
     * @date 2016/12/11
 */
public class PairTest2 {
    public static void main(String[] args) {
        GregorianCalendar[] birthdays = {
                new GregorianCalendar(2001, Calendar.DECEMBER, 9),
                new GregorianCalendar(2021, Calendar.MONTH, 10),
                new GregorianCalendar(2004, Calendar.OCTOBER, 9),
                new GregorianCalendar(1998, Calendar.MONTH, 9)
        };
        Pair<GregorianCalendar> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min=" + mm.getFirst().getTime());
        System.out.println("max=" + mm.getSecond().getTime());
    }
}

class ArrayAlg {
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (min.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }
}