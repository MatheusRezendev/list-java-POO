package exe_rectangle;

public class Rectangle {

    public Rectangle(float height, float width){
        this.height = height;
        this.width = width;
    }

    private float height;
    private float width;

    public void calculateArea() {
        float area = height * width;
        System.out.println("Area to rectangle is: " + area);
    }

    public void calculatePerimeter() {
        float perimeter = 2 * height + 2 * width;
        System.out.println("Perimeter to rectangle is: " + perimeter);
    }
}
