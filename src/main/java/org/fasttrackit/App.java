package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

//        am creat un nou obiect Game ca sa pot apela metoda "Start"
//        Game game = new Game();
//        game.start();

// string pool
//        String a = "test";
//        String b = "test";
//        String c = new String("test");
//
//        System.out.println(a == b);
//        System.out.println(a == c);
//        System.out.println(a.equals(c));


//dai pe plus jos daca vrei sa vezi tot codul scris pana acum
//        Engine engine = new Engine();
//        engine.manufacturer = "Renault";
//
//        Car car = new Car(engine);
//        car.setName("Dacia");
//        car.setColor("Blue");
//        car.doorCount = 4;
//        car.setMileage(9.5);;
//        car.setFuelLevel(50);
//        car.setRunning(true); // ??
//
//        System.out.println("Our engine...");
//        System.out.println(car.engine.manufacturer);
//
//        Car car2 = new Car(engine);
//        car2.setName("Pollo");
//        car2.setColor("red");
//        car2.doorCount = 4;
//        car2.setMileage(8.5);
//        car2.setFuelLevel(60);
//        car2.setRunning(true);
//
//        Car car3 = car;
//
//
//        System.out.println(car.getName());
//        System.out.println(car3.getName());
//
//        System.out.println("Changing values...");
//
//        car.setName("Dacia Logan");
//
//        System.out.println(car.getName());
//        System.out.println(car3.getName());
//
//        System.out.println(car.getMaxSpeed());
//        System.out.println(car.engine);
//
//        System.out.println(car.engine);
//        System.out.println(car.engine);
//
//        System.out.println(engine.manufacturer);
//        System.out.println(engine.manufacturer);
//        System.out.println(engine.manufacturer);
//
//
//        double distance = car.accelerate(60, 0.5);
//          distance = car.accelerate(60, 0.5);
//
//        System.out.println("Distance In App.main: " + distance);
//
//
//        System.out.println("Studying static variables ...");
//
////        variabila statica mai jos (este exemplificata in app.main in ultimele sout-uri)
//
////        car.totalCount = 1;
////        System.out.println("Total count from car: " + car.totalCount);
////
////        car2.totalCount = 2;
////        System.out.println("Total count from car after setting car2: " + car.totalCount);
////        System.out.println("Total count from car2: " + car2.totalCount);
////        System.out.println("Total count from Vehicle class: " + Vehicle.totalCount);
////
//        System.out.println("Total vehicles: " + Vehicle.getTotalCount());
//
////        method overloading aici jos, gasesti restul metozii in Vehicle langa accelerating
//
//
//        car2.accelerate(100);
//
//        new AutoVehicle();
//
//
////        testam override mai jos de today
//
//        System.out.println("Today...");
//        System.out.println(car.toString());
//
//        BatMobile batMobile = new BatMobile();
//        batMobile.setName("Crime Fighting Vehicle");
//
//        batMobile.accelerate(60, 1);
//        car.accelerate(60, 1);



//        testam polymorphism jos

//        Vehicle mobile = new BatMobile();
////        desi obiectul mobile este din Vehicle, el este tot un BatMobile asa ca mosteneste acelasi comportament
////        , inclusiv metoda overriding pt accelerate
//        mobile.accelerate(30,2);
//
////        varyable type determines what methods you can use on the stored object
//        Vehicle testCar = new Car();
////        type casting
//        ((Car) testCar).getDoorCount();
        Game game = new Game();


        game.start();



    }
}
