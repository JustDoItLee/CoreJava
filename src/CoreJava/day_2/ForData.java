package CoreJava.day_2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author 李智
 * @date 2016/11/24
 */
public class ForData {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();//日历月份从0开始
        int month = calendar.get(Calendar.MONTH);
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(month);
        System.out.println(weekday);
        calendar.set(2016,Calendar.NOVEMBER,24);
        //Calendar 和 Date之间的转换
        Date date = calendar.getTime();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
    }
}
