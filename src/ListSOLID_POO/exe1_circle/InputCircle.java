package ListSOLID_POO.exe1_circle;

import java.util.Scanner;

public class InputCircle {

    Scanner sc = new Scanner(System.in);
    Circle c = new Circle(1);

    public void inputCircle() {
        System.out.println("Enter the radius of the circle: ");
        c.setRadius(sc.nextFloat());
    }

    public Circle getC() {
        return c;
    }
}
