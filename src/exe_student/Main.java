package exe_student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Float> scores = new ArrayList<>();
        Student s = new Student("Matheus", "98029438", scores);
        Scanner sc = new Scanner(System.in);

        //Iteration on the List
        for (int i = 1; i < 5; i++) {
            System.out.print("Enter score for student: ");
            float score = sc.nextFloat();
            scores.add(score);
        }

        s.calculateMediaScore();
        s.displayStudent();
        s.situationStudent();
    }
}