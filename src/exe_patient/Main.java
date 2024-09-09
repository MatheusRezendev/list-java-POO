package exe_patient;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> consults = new ArrayList<>();
        Patient p = new Patient("matheus",20, consults);

        p.addNewConsult();
        p.displayConsult();
    }
}