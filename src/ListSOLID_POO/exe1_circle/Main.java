package ListSOLID_POO.exe1_circle;

public class Main {
    public static void main(String[] args) {

        InputCircle i = new InputCircle();
        CalculateCircle calc = new CalculateCircle();

        i.inputCircle();
        calc.displayResults(i.getC());

    }
}