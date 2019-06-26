package org.fasttrackit;

public class Vehicle {
    //variabial statica mai jos


    private static int totalCount;


   public Vehicle() {
   totalCount++;

   }


//    le-am facut private ca sa nu poata fi schimbate din alta parte decat din clasa

    private String name;
    private double mileage;
    private String color;
    private double maxSpeed;
    private boolean running;
    private double fuelLevel;
    private double traveledDistance;

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


//    method signature must be the same, expect: (mai jos)
//    1. mai jos co-variant return type
//    (adica return object must inherit what the overwritten method was returning initially)
//    2. Overriding method can allow larger access (adica sa schimbi din protected in public,
//    dar nu invers in comparatie cu clasa parinte


    @Override
    public Vehicle clone() throws CloneNotSupportedException {
        return new Vehicle();
    }

    //    overloading pentru "accelerate" mai jos putem avea aceleasi nume ca metoda, doar lista de parametrii sa fie diferita

    public double accelerate(double speed) {
      return accelerate(speed, 1);
    }



//    mai jos sunt getteri, i-am bagat cu ALT + INSERT

    public String getName() {
        return name;
    }

    public double getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isRunning() {
        return running;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

// aceeasi scurtatura, doar ca am ales settari acum ( mai jos)

    public void setName(String name) {
        this.name = name;
    }



    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public static int getTotalCount() {
        return totalCount;
    }


//    mai jos e method overriding, ca sa nu mai arate hashcodul, bagat comanda din alt+insert si ales toString


    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", running=" + running +
                ", fuelLevel=" + fuelLevel +
                ", traveledDistance=" + traveledDistance +
                '}';
    }



}
