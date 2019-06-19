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
        car.setName("Dacia");
        car.setColor("Blue");
        car.doorCount = 4;
        car.setMileage(9.5);;
        car.setFuelLevel(50);
        car.setRunning(true); // ??

        System.out.println("Our engine...");
        System.out.println(car.engine.manufacturer);

        Car car2 = new Car(engine);
        car2.setName("Pollo");
        car2.setColor("red");
        car2.doorCount = 4;
        car2.setMileage(8.5);
        car2.setFuelLevel(60);
        car2.setRunning(true);

        Car car3 = car;


        System.out.println(car.getName());
        System.out.println(car3.getName());

        System.out.println("Changing values...");

        car.setName("Dacia Logan");

        System.out.println(car.getName());
        System.out.println(car3.getName());

        System.out.println(car.getMaxSpeed());
        System.out.println(car.engine);

        System.out.println(car.engine);
        System.out.println(car.engine);

        System.out.println(engine.manufacturer);
        System.out.println(engine.manufacturer);
        System.out.println(engine.manufacturer);


        double distance = car.accelerate(60, 0.5);
          distance = car.accelerate(60, 0.5);

        System.out.println("Distance In App.main: " + distance);


        System.out.println("Studying static variables ...");

//        variabila statica mai jos (este exemplificata in app.main in ultimele sout-uri)

//        car.totalCount = 1;
//        System.out.println("Total count from car: " + car.totalCount);
//
//        car2.totalCount = 2;
//        System.out.println("Total count from car after setting car2: " + car.totalCount);
//        System.out.println("Total count from car2: " + car2.totalCount);
//        System.out.println("Total count from Vehicle class: " + Vehicle.totalCount);
//
        System.out.println("Total vehicles: " + Vehicle.getTotalCount());

//        method overloading aici jos, gasesti restul metozii in Vehicle langa accelerating


        car2.accelerate(100);

        new AutoVehicle();

    }
}
