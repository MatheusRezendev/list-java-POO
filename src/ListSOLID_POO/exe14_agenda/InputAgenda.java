package ListSOLID_POO.exe14_agenda;

import java.util.Scanner;

public class InputAgenda {

    private Scanner scanner;

    public InputAgenda() {
        scanner = new Scanner(System.in);
    }

    public String getInput(String prompt) {
        System.out.print(prompt + ":");
        return scanner.nextLine();
    }

    public void close(){
        scanner.close();
    }
}
