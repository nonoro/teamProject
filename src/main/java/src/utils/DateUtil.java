package src;

import java.time.LocalDate;

public class DateTest {
    public static void main(String[] args) {
        int date = 20220911;
        int year = date / 10000;
        int month = (date - year * 10000) / 100;
        int day = date % 100;

        LocalDate newDate = LocalDate.of(year, month, day);
        System.out.println(newDate);
    }
}
