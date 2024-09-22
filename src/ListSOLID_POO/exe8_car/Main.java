package ListSOLID_POO.exe8_car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InputCarInformations i = new InputCarInformations();
        CarController cc = new CarController();
        Car car = new Car();

        i.inputCarInformations(car);

        System.out.print("Choose one option:\n");
        System.out.print("1 - Accelerate:\n");
        System.out.print("2 - Break:\n");
        System.out.print("3 - Display current speed:\n");
        System.out.print("0 - Exit\n");

        int op;
        do {
            op = sc.nextInt();
            switch (op) {
                case 1:
                    cc.accelerate(car);
                    break;
                case 2:
                    cc.brake(car);
                    break;
                case 3:
                    cc.displayCurrentSpeed(car);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
            }
        }while (op != 0);

        sc.close();
    }
}