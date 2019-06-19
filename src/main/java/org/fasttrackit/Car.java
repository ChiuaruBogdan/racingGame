package org.fasttrackit;

//inheritance or "is-a" relationship
public class Car extends AutoVehicle{

    int doorCount;

    // ALT + ENTER pe erori pentru sugestii

    public Car(Engine engine) {
        super(engine);
    }


    public Car() {
//        any constructor will try to call the "no-parameter" constructor of the parent class
//        (adica nu mai trebuie invocat 'super' din cauza la constructor overloading
    }
}
