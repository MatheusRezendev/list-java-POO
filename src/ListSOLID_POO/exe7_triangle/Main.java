package ListSOLID_POO.exe7_triangle;

public class Main {
    public static void main(String[] args) {

        Triangle t = new Triangle();
        InputTriangle i = new InputTriangle();
        TriangleController tc = new TriangleController();

        i.inputTriangle(t);
        tc.verifyTriangle(t);
        tc.calculateArea(t);

    }
}