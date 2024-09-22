package ListSOLID_POO.exe4_student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        StudentController studentC = new StudentController();
        InputStudent i = new InputStudent();

        i.inputStudent(s);
        studentC.displayStudent(s);
    }
}