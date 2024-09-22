package ListSOLID_POO.exe19_calendar;

import java.time.LocalDate;
import java.util.Scanner;

public class InputManager {

    private Scanner scanner;

    public InputManager() {
        scanner = new Scanner(System.in);
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public LocalDate getDate(String prompt) {
        System.out.print(prompt);
        String dateString = scanner.next();
        return LocalDate.parse(dateString);
    }

    public void close(){
        scanner.close();
    }
}
