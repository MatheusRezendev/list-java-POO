package ListSOLID_POO.exe3_rectangle;

public class RectangleController {

    public RectangleController() {
    }

    public float calculateArea(Rectangle rectangle) {
        return (float) rectangle.getHeight() * rectangle.getWidth();
    }

    public float calculatePerimeter(Rectangle rectangle) {
        return (float)  2 * rectangle.getHeight() + 2 * rectangle.getWidth();
    }

    public void displayResults(Rectangle rectangle) {
        float area = calculateArea(rectangle);
        float perimeter = calculatePerimeter(rectangle);
        System.out.println("Area to rectangle is: " + area);
        System.out.println("Perimeter to rectangle is: " + perimeter);
    }
}
