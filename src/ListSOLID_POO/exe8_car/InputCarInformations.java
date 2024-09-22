package ListSOLID_POO.exe8_car;

import java.util.Scanner;

public class InputCarInformations {

    Scanner sc = new Scanner(System.in);

    public void inputCarInformations(Car car) {
        System.out.println("Enter car mark: ");
        car.setMark(sc.next());

        System.out.println("Enter car model: ");
        car.setModel(sc.next());

    }
}
