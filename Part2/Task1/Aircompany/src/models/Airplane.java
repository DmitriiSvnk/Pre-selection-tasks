package models;

public abstract class Airplane {
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
        this.model = model;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
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

