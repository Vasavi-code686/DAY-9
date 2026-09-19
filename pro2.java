abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car starts using a key");
    }
}

class Bike extends Vehicle {

    void start() {
        System.out.println("Bike starts using a self-start button");
    }
}

public class pro2 {

    public static void main(String[] args) {

        Car c = new Car();
        c.start();
        c.stop();

        Bike b = new Bike();
        b.start();
        b.stop();
    }
}