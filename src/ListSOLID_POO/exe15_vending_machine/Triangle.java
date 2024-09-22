package ListSOLID_POO.exe15_vending_machine;

public class Triangle {
    private int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void verifyTriangle(){
        if(a + b > c && a + c > b && b + c > a){
            System.out.println("The triangle is valid");
        }else{
            System.out.println("The triangle is not valid");
        }
    }

    public void calculateArea(){
        double semiPerimeter = (double) (getA() + getB() + getC()) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter- getA()) * (semiPerimeter - getB()) * (semiPerimeter - getC()));
        System.out.println("The area of the triangle is " + area);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

}
