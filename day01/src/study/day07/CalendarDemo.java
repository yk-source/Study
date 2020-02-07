package study.day07;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //demo01();
        demo02();

    }

    private static void demo02() {
        Calendar c = Calendar.getInstance();
 /*       c.set(Calendar.YEAR,2020);
        c.set(Calendar.MONTH,02);*/
        c.set(1998,11,28);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");
    }

    private static void demo01() {
        Calendar instance = Calendar.getInstance();
        int i = instance.get(Calendar.YEAR);
        System.out.println(i);
        int i1 = instance.get(Calendar.MONTH);
        System.out.println(i1);
    }
}
