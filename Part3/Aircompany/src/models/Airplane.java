package models;

import exeptions.CargoCapacityExeption;
import exeptions.FlightRangeExeption;
import exeptions.ImpossibleModelExeption;

import java.io.Serializable;

public abstract class Airplane implements Serializable {
    private String model;
    private int flightRange;
    private double cargoCapacity;
    private int passengersCapacity;

    public Airplane(String model, int flightRange) {
        this.model = model;
        this.flightRange = flightRange;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.length() == 0){
            try {
                throw new ImpossibleModelExeption("The model name must contain more than 0 characters.");
            } catch (ImpossibleModelExeption e) {
                System.err.println(e.getMessage());
            }
        }
        this.model = model;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(int flightRange) {
        if(flightRange <= 0) {
            try {
                throw new FlightRangeExeption("Flight range must be greater than 0.");
            } catch (FlightRangeExeption e) {
                System.err.println(e.getMessage());
            }
        }
        this.flightRange = flightRange;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        if(cargoCapacity <= 0){
            try {
                throw new CargoCapacityExeption("Cargo capasity must be greater than 0");
            } catch (CargoCapacityExeption e) {
                System.err.println(e.getMessage());
            }
        }
        this.cargoCapacity = cargoCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    public void rise() {
        System.out.printf("The %s is gaining altitude.", model);
    }

    public void landing() {
        System.out.printf("The %s makes a landing.", model);
    }

    public void voyage() {
        System.out.printf("The aircraft %s performs a flight with %d passengers and %f kilograms of cargo on board.",
                model, passengersCapacity, cargoCapacity);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " - model: " + model +
                ", flight range=" + flightRange +
                ", cargo capacity=" + cargoCapacity +
                ", passengers capacity=" + passengersCapacity;
    }
}

