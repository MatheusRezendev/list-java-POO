package ListSOLID_POO.exe4_student;

public class StudentController {

    public float calculateMediaScore(Student student) {
        float sum = 0;
        for (float score : student.getScore()) {
            sum += score;
        }

        return sum / student.getScore().size();
    }

    public void situationStudent(Student student) {
        float mediaScore = calculateMediaScore(student);
        if (mediaScore > 5) {
            System.out.println("Student approved");
        }else{
            System.out.println("Student not approved");
        }
    }

    public void displayStudent(Student student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Registration: " + student.getRegistration());
        System.out.println("Score: " + student.getScore());
        situationStudent(student);
    }

}
