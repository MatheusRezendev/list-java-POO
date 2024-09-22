package ListSOLID_POO.exe4_student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputStudent {

    Scanner sc = new Scanner(System.in);

    public void inputStudent(Student student) {
        System.out.println("Enter student name: ");
        student.setName(sc.nextLine());

        System.out.println("Enter student registration: ");
        student.setRegistration(sc.nextLine());

        List<Float> scores = new ArrayList<>();
        System.out.print("Enter 4 score for student \n");
        for (int i = 1; i < 5; i++) {
            System.out.print("Enter score: ");
            float score = sc.nextFloat();
            scores.add(score);
        }

        student.setScore(scores);
    }
}
