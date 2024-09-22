package ListSOLID_POO.exe19_calendar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateCalculator {

    public long calculateDaysBetween(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }
}
