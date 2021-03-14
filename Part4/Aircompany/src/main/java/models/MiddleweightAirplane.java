package models;

public class MiddleweightAirplane extends Airplane implements Middleweight {
    private int cargo;
    private int passengers;

    public MiddleweightAirplane(String model, int flightRange, int cargo, int passengers) {
        super(model, flightRange);
        setCargo(cargo);
        setPassengers(passengers);
        setCargoCapacity(this.cargo);
        setPassengersCapacity(this.passengers);
    }

    private void setCargo(int cargo) {
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