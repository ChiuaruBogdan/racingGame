package org.fasttrackit;

public class Vehicle {

    String name;
    double mileage;
    String color;
    double maxSpeed;
    boolean running;
    double fuelLevel;
    double traveledDistance;

    public double accelerate(double speed, double duration) {
        //concatenation
        System.out.println(name + " is accelerating with "
                + speed + " km/h for " + duration + "h.");


        double distance = speed * duration;
        System.out.println("Traveled " + distance + " km.");

//        traveledDistance = traveledDistance + distance;
        // same result as the above statement, doar simplificat
        traveledDistance += distance;

//       se numesc logs
        System.out.println("Total traveled distance: " + traveledDistance + " km.");

        double spentFuel = distance / 100 * mileage;
        System.out.println("spentFuel: " + spentFuel + "l.");

//        fuelLevel = fuelLevel - spentFuel;
        // same as above la travel distance
        fuelLevel -= spentFuel;
        System.out.println("Remaining fuel: " + fuelLevel + " l.");


        return distance;
    }


}
