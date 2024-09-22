package ListSOLID_POO.exe9_patient;

import java.util.Scanner;

public class InputPacient {

    Scanner sc = new Scanner(System.in);

    public void inputPacient(Patient p) {
        System.out.println("Enter the name of the pacient");
        p.setName(sc.nextLine());

        System.out.println("Enter the age of the pacient");
        p.setAge(sc.nextInt());
    }

    public void closeScanner() {
        sc.close();
    }
}
