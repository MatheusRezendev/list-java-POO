package ListSOLID_POO.exe1_circle;

public class CalculateCircle {

    public CalculateCircle() {
    }

    public float calculateArea(Circle circle){
        return (float) (Math.PI * Math.pow(circle.getRadius(), 2));
    }

    public float calculatePerimeter(Circle circle){
        return (float) (2 * Math.PI * circle.getRadius());
    }

    public void displayResults(Circle circle){
        float area = calculateArea(circle);
        float perimeter = calculatePerimeter(circle);
        System.out.println("The area of the circle is " + area);
        System.out.println("The perimeter of the circle is " + perimeter);
    }
}
