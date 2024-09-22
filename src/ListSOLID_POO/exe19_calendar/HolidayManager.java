package ListSOLID_POO.exe19_calendar;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Set;

public class HolidayManager {

    private Set<LocalDate> holidays;

    public HolidayManager() {
        holidays = new HashSet<>();
        initializeHolidays();
    }

    private void initializeHolidays() {
        holidays.add(LocalDate.of(LocalDate.now().getYear(), Month.JANUARY, 1));
        holidays.add(LocalDate.of(LocalDate.now().getYear(), Month.DECEMBER, 25));
        holidays.add(LocalDate.of(LocalDate.now().getYear(), Month.SEPTEMBER, 7));
    }

    public void addHoliday(LocalDate holiday) {
        holidays.add(holiday);
        System.out.println("Holiday added: " + holiday);
    }

    public boolean isHoliday(LocalDate date) {
        return holidays.contains(date);
    }

    public void displayHolidays() {
        System.out.println("Holidays:");
        for (LocalDate holiday : holidays) {
            System.out.println(holiday);
        }
    }
}
