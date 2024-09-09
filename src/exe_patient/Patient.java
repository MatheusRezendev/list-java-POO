package exe_patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patient {
    private String name;
    private int age;
    private List<String> historyConsult;

    Patient(String name, int age, List<String> history) {
        this.name = name;
        this.age = age;
        this.historyConsult = history;
    }

    public void addNewConsult() {
        historyConsult = new ArrayList<>();

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Do you want to add a new query? (y/n): ");
            String response = sc.nextLine().toLowerCase();

            if (response.equals("n")) {
                break;
            }

            historyConsult.add("\nConsult " + "\nNome: " + name + "\nAge: " + age);
            System.out.println("a new consult as registered " + historyConsult);

        }
    }
    public void displayConsult(){
        System.out.println("\nHistory of consults ");
        for (String s : historyConsult) {
            System.out.println(s);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHistoryConsult() {
        return historyConsult;
    }

    public void setHistoryConsult(List<String> historyConsult) {
        this.historyConsult = historyConsult;
    }
}
