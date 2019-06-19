package org.fasttrackit;

public class AutoVehicle extends Vehicle{


    // "has-a" relationship
    Engine engine;

//    constructori mai jos , ca si metode doar cu parametrii, fara nume
//    "this." face referire la obiectul original, pentru ca nu are un nume diferit
//    orice clasa apeleaza constructorul super clasei (cel de la care se extinde)

//    scurtatura " ALT + INSERT" se poate folosi pentru a crea constructori
// CTRL ALT O (sterge toate importurile care nu au ce cauta acolo


    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }
}


