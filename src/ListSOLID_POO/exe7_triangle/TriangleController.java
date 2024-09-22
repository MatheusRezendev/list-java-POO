package ListSOLID_POO.exe7_triangle;

public class TriangleController {

    public void verifyTriangle(Triangle triangle){
        int a = triangle.getA();
        int b = triangle.getB();
        int c = triangle.getC();
        if(a + b > c && a + c > b && b + c > a){
            System.out.println("The triangle is valid");
        }else{
            System.out.println("The triangle is not valid");
        }
    }

    public void calculateArea(Triangle triangle){
        double semiPerimeter = (double) (triangle.getA() + triangle.getB() + triangle.getC()) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter- triangle.getA()) * (semiPerimeter - triangle.getB()) * (semiPerimeter - triangle.getC()));
        System.out.println("The area of the triangle is " + String.valueOf(area));
    }

}
