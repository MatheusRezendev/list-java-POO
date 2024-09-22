package ListSOLID_POO.exe9_patient;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Patient p = new Patient();
        PatientController pc = new PatientController();
        InputPacient ip = new InputPacient();

        ip.inputPacient(p);
        pc.addNewConsult(p);
        pc.displayConsult(p);

        ip.closeScanner();
    }
}