package ListSOLID_POO.exe19_calendar;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        CalendarDisplay calendarDisplay = new CalendarDisplay();
        HolidayManager holidayManager = new HolidayManager();
        DateCalculator dateCalculator = new DateCalculator();
        InputManager inputManager = new InputManager();

        boolean running = true;
        while (running) {
            System.out.println("Menu:");
            System.out.println("\n1 - Display month calendar");
            System.out.println("\n2 - Check if a date is a holiday");
            System.out.println("\n3 - Calculate days between two dates");
            System.out.println("\n4 - Add a holiday");
            System.out.println("\n5 - Display all holidays");
            System.out.println("\n6 - Exit");

            int choice = inputManager.getInt("\nChoose an option: ");

            switch (choice) {
                case 1:
                    int year = inputManager.getInt("Enter year: ");
                    int month = inputManager.getInt("Enter month (1-12): ");
                    calendarDisplay.displayMonth(year, month);
                    break;
                case 2:
                    LocalDate dateToCheck = inputManager.getDate("Enter a date to check if it's a holiday (yyyy-MM-dd): ");
                    System.out.println("Is the date " + dateToCheck + " a holiday? " + holidayManager.isHoliday(dateToCheck));
                    break;
                case 3:
                    LocalDate startDate = inputManager.getDate("Enter start date (yyyy-MM-dd): ");
                    LocalDate endDate = inputManager.getDate("Enter end date (yyyy-MM-dd): ");
                    long daysBetween = dateCalculator.calculateDaysBetween(startDate, endDate);
                    System.out.println("Days between " + startDate + " and " + endDate + ": " + daysBetween);
                    break;
                case 4:
                    LocalDate customHoliday = inputManager.getDate("Enter a custom holiday date (yyyy-MM-dd): ");
                    holidayManager.addHoliday(customHoliday);
                    break;
                case 5:
                    holidayManager.displayHolidays();
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option, please try again");
            }
        }

        inputManager.close();
    }
}