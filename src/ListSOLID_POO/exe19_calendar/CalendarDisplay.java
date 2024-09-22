package ListSOLID_POO.exe19_calendar;

import java.time.LocalDate;
import java.time.Month;

public class CalendarDisplay {

    public void displayMonth(int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        Month m = date.getMonth();
        System.out.println("Calendar for: " + m);

        for (int day = 1; day <= m.length(date.isLeapYear()); day++) {
            System.out.println(day + " " + m);
        }
    }
}
