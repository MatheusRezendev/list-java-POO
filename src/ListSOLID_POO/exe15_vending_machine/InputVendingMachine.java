package ListSOLID_POO.exe15_vending_machine;

import java.util.Scanner;

public class InputVendingMachine {

    private Scanner scanner;

    public InputVendingMachine() {
        this.scanner = new Scanner(System.in);
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public void close(){
        if(scanner != null){
            scanner.close();
        }
    }
}

