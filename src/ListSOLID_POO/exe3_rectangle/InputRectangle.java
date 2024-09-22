package ListSOLID_POO.exe3_rectangle;

import java.util.Scanner;

public class InputRectangle {

    Scanner sc = new Scanner(System.in);
    RectangleController rc = new RectangleController();
    Rectangle r = new Rectangle();

    public void inputRectangle() {
        System.out.println("Enter the height of the rectangle: ");
        r.setHeight(sc.nextFloat());

        System.out.println("Enter the width of the rectangle: ");
        r.setWidth(sc.nextFloat());
    }

    public Rectangle getR() {
        return r;
    }

}
