package ListSOLID_POO.exe8_car;

public class CarController {

    public void accelerate(Car car){
        float currentVelocity = car.getVelocity();
        float newVelocity = currentVelocity + 10;
        System.out.println("The car is accelerate: " + newVelocity);
    }

    public void brake(Car car){
        float currentVelocity = car.getVelocity();
        float newVelocity = currentVelocity - 10;
        System.out.println("The car is brake: " + newVelocity);
    }

    public void displayCurrentSpeed(Car car){
        System.out.println("the speed of the car is: " + car.getVelocity());
    }
}
