package actions;

import models.*;

public class AirplaneGenerator {
    public static Airplane generateRandomPlane() {
        int key = (int) (Math.random() * 9);
        return switch (key) {
            default -> new LightweightAirplane("Hawker 700", 4725, 700, 8);
            case 0 -> new LightweightAirplane("Adamjet A700", 2037, 800, 6);
            case 1 -> new LightweightAirplane("Cessna Citation CJ1", 2315, 800, 6);
            case 2 -> new LightweightAirplane("Eclipce 550", 2480, 550, 5);
            case 3 -> new LightweightAirplane("Beechcraft Premier 1A", 2095, 600, 7);
            case 4 -> new LightweightAirplane("Epic Victory", 2222, 750, 5);
            case 5 -> new MiddleweightAirplane("Embraer Legacy 500", 5556, 20000, 15);
            case 6 -> new MiddleweightAirplane("Avro Business Jet", 2130, 22000, 46);
            case 7 -> new MiddleweightAirplane("Gulfstream IV", 7413, 15000, 16);
            case 8 -> new MiddleweightAirplane("Bombardier Challenger 605", 7408, 17000, 23);
            case 9 -> new MiddleweightAirplane("Dassault Falcon 2000", 5560, 14000, 30);
        };
    }

    public static Airplane[] createCompany(int size){
        return new Airplane[size];
    }

    public static Airplane[] fill(Airplane[] airplanes){
        for (int i = 0; i < airplanes.length; i++) {
            airplanes[i] = generateRandomPlane();
        }
        return airplanes;
    }
}