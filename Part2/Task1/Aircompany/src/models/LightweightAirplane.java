package models;

public class LightweightAirplane extends Airplane implements Lightweight {
    private double cargo;
    private int passengers;

    public LightweightAirplane(String model, int flightRange, double cargo, int passengers) {
        super(model, flightRange);
        setCargo(cargo);
        setPassengers(passengers);
        setCargoCapacity(this.cargo);
        setPassengersCapacity(this.passengers);
    }

    private void setCargo(double cargo) {
        if (cargo > 0 && cargo <= MAX_CARGO_KILOGRAMS) {
            this.cargo = cargo;
        } else if (cargo > MAX_CARGO_KILOGRAMS) {
            this.cargo = MAX_CARGO_KILOGRAMS;
        } else {
            this.cargo = 0;
        }
    }

    private void setPassengers(int passengers) {
        if(passengers > 0 && passengers <= MAX_PASSENGERS_CAPACITY) {
            this.passengers = passengers;
        } else if (passengers > MAX_PASSENGERS_CAPACITY) {
            this.passengers = MAX_PASSENGERS_CAPACITY;
        } else {
            this.passengers = 0;
        }
    }
}
