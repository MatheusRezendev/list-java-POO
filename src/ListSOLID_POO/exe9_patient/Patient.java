package ListSOLID_POO.exe9_patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patient {
    private String name;
    private int age;
    private List<String> historyConsult;

    public Patient() {
        historyConsult = new ArrayList<>();
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
