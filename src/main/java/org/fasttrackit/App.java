package org.fasttrackit;

import javax.print.attribute.standard.RequestingUserName;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


        Engine engine = new Engine();
        engine.manufacturer = "Renault";

        Car car = new Car(engine);
        car.name = "Dacia";
        car.color = "blue";
        car.doorCount = 4;
        car.mileage = 9.5;
        car.fuelLevel = 50;
        car.running = true;


        System.out.println("Our engine...");
        System.out.println(car.engine.manufacturer);

        Car car2 = new Car(engine);
        car2.name = "Pollo";
        car2.color = "red";
        car2.doorCount = 4;
        car2.mileage = 8.5;
        car2.fuelLevel = 60;
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


        double distance = car.accelerate(60, 0.5);
          distance = car.accelerate(60, 0.5);

        System.out.println("Distance In App.main: " + distance);



    }
}
