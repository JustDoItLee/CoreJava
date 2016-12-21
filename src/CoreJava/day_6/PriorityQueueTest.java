package CoreJava.day_6;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.PriorityQueue;

/**
 * @author 李智
 * @date 2016/12/21
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<GregorianCalendar> pq = new PriorityQueue<>();
        pq.add(new GregorianCalendar(1900, Calendar.MONTH, 9));
        pq.add(new GregorianCalendar(1901, Calendar.DECEMBER, 8));
        pq.add(new GregorianCalendar(1902, Calendar.JULY, 7));
        pq.add(new GregorianCalendar(1903, Calendar.MAY, 6));

        System.out.println("Iterating over elements...");
        for (GregorianCalendar data : pq) {
            System.out.println(data.get(Calendar.YEAR));
        }
        System.out.println("Removing elements...");
        while (!pq.isEmpty()) {
            System.out.println(pq.remove().get(Calendar.YEAR));
        }
    }
}
