package ListSOLID_POO.exe3_rectangle;

public class Main {
    public static void main(String[] args) {

        RectangleController rc = new RectangleController();
        InputRectangle i = new InputRectangle();

        i.inputRectangle();
        rc.displayResults(i.getR());
    }
}