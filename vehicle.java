/* Reg number :CT101/G/20281/23
  Name : Hillary Wafula */
// Base class Vehicle
class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate(int increase) {
        speed += increase;
    }

    public void brake(int decrease) {
        speed = Math.max(speed - decrease, 0);
    }

    public void showDetails() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

// Subclass Car
class Car extends Vehicle {
    int fuelLevel;

    public Car(String brand, int speed, int fuelLevel) {
        super(brand, speed);
        this.fuelLevel = fuelLevel;
    }

    public void refuel(int amount) {
        fuelLevel = Math.min(fuelLevel + amount, 100);
    }

    @Override
    public void showDetails() {
        System.out.println("Car - Brand: " + brand + ", Speed: " + speed + ", Fuel Level: " + fuelLevel + "%");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    boolean helmetOn;

    public Bike(String brand, int speed, boolean helmetOn) {
        super(brand, speed);
        this.helmetOn = helmetOn;
    }

    public void wearHelmet() {
        helmetOn = true;
    }

    @Override
    public void showDetails() {
        System.out.println("Bike - Brand: " + brand + ", Speed: " + speed + ", Helmet On: " + helmetOn);
    }
}

// Main class
public class VehicleSystem {
    public static void main(String[] args) {
        
        Car myCar = new Car("Toyota", 60, 50);
        myCar.accelerate(20);
        myCar.brake(30);
        myCar.refuel(30);
        myCar.showDetails();

        
        Bike myBike = new Bike("Yamaha", 40, false);
        myBike.accelerate(15);
        myBike.brake(10);
        myBike.wearHelmet();
        myBike.showDetails();
    }
}
