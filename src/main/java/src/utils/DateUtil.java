package src.utils;

import java.sql.Date;
import java.time.LocalDate;

public class DateUtil {
    public static void main(String[] args) {
        System.out.println(intToDate(20220630));

    }
    public static Date intToDate(int date) {
        int year = (date / 10000);
        int month = (date - year * 10000) / 100;
        int day = date % 100 ;
        System.out.println(year);

        return new Date(year, month - 1, day);
    }

}
