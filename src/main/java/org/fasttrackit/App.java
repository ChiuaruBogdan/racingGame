package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Car car = new Car();
        car.name = "Dacia";
        car.color = "blue";
        car.doorCount = 4;
        car.mileage = 9.5;
        car.running = true;

        Engine engine = new Engine();
        engine.manufacturer = "Renault";

        car.engine = engine;
        System.out.println("Our engine...");
        System.out.println(car.engine.manufacturer);

        Car car2 = new Car();
        car2.name = "Pollo";
        car2.color = "red";
        car2.doorCount = 4;
        car2.mileage = 8.5;
        car2.running = true;

        Car car3 = car;

        System.out.println(car.name);
        System.out.println(car3.name);

        System.out.println("Changing values...");

        car.name = "Dacia Logan";

        System.out.println(car.name);
        System.out.println(car3.name);

        System.out.println(car.maxSpeed);
        System.out.println(car.engine);

        System.out.println(car.engine);
        System.out.println(car.engine);

        System.out.println(engine.manufacturer);
        System.out.println(engine.manufacturer);
        System.out.println(engine.manufacturer);
    }
}