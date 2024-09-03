package car.example.constructor.injection;

public class Car {
    private Specification carSpecification;
    public void displayDetails() {
        System.out.println("Car details: "+carSpecification);
    }
}
