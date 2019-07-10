package org.fasttrackit;

//clasa creata ca sa dam exemplu de overriding pentru accelerate

public class BatMobile extends Vehicle {

    @Override
    public double accelerate(double speed, double duration) {

        System.out.println(getName() + " is accelerating with "
                + speed + " km/h for " + duration + "h.");


        double distance = speed * duration * 2;
        System.out.println("Traveled " + distance + " km. Cheater!");


        setTraveledDistance(getTraveledDistance() + distance);

        System.out.println("Total traveled distance: " + getTraveledDistance() + " km.");

        return distance;
    }

}



