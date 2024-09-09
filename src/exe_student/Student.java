package exe_student;

import java.lang.reflect.Array;
import java.util.List;

public class Student {

    //Attributes
    private String name;
    private String registration;
    private List <Float> score;

    //Constructor
    public Student(String name, String registration, List<Float> score) {
        this.name = name;
        this.registration = registration;
        this.score = score;
    }

    //Methods
    public float calculateMediaScore() {
        float sum = 0;
        for (float score : score) {
            sum += score;
        }

        return sum / score.size();
    }

    public void situationStudent() {
        float mediaScore = calculateMediaScore();
        if (mediaScore > 5) {
            System.out.println("Student approved");
        }else{
            System.out.println("Student not approved");
        }
    }

    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Registration: " + registration);
        System.out.println("Score: " + calculateMediaScore());
    }

    //Getters Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public List<Float> getScore() {
        return score;
    }

    public void setScore(List<Float> score) {
        this.score = score;
    }
}
