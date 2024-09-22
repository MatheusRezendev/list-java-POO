package ListSOLID_POO.exe9_patient;

import java.util.List;
import java.util.Scanner;

public class PatientController {

    public void addNewConsult(Patient p) {
        List<String> historyConsult = p.getHistoryConsult();

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Do you want to add a new query? (y/n): ");
            String response = sc.nextLine().toLowerCase();

            if (response.equals("n")) {
                break;
            }

            historyConsult.add("\nConsult " + "\nNome: " + p.getName() + "\nAge: " + p.getAge());
            System.out.println("a new consult as registered " + historyConsult);

        }
    }

    public void displayConsult(Patient p){
        System.out.println("\nHistory of consults ");
        List<String> historyConsult = p.getHistoryConsult();
        for (String s : historyConsult) {
            System.out.println(s);
        }
    }
}
