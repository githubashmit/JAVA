
interface Car {
    String getName();
    double getMaxSpeed();
    static Car getFastestCar(Car car1, Car car2) {
        return car1.getMaxSpeed() >= car2.getMaxSpeed() ? car1 : car2;
    }
}
class BMW implements Car {
    private String name;
    private double maxSpeed;

    public BMW(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getMaxSpeed() {
        return maxSpeed;
    }
}
class Audi implements Car {
    private String name;
    private double maxSpeed;

    public Audi(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMaxSpeed() {
        return maxSpeed;
    }
}

// Define the MainApp class
public class MainApp {
    public static void main(String[] args) {

        BMW bmw = new BMW("BMW X5", 250.0);
        Audi audi = new Audi("Audi A8", 240.0);


        Car fastestCar = Car.getFastestCar(bmw, audi);


        System.out.println("The fastest car is: " + fastestCar.getName());
    }
}
