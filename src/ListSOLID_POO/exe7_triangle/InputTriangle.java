package ListSOLID_POO.exe7_triangle;

import java.util.Scanner;

public class InputTriangle {

    Scanner sc = new Scanner(System.in);

    public void inputTriangle(Triangle t) {

        System.out.print("Enter the first triangle point: ");
        t.setA(sc.nextInt());

        System.out.print("Enter the second triangle point: ");
        t.setB(sc.nextInt());

        System.out.print("Enter the third triangle point: ");
        t.setC(sc.nextInt());

    }
}
