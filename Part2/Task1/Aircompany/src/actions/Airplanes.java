package actions;

import models.Airplane;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Airplanes {
    public static int totalPassengerCapacity(Airplane[] airplanes){
        int total = 0;
        for (Airplane a : airplanes) {
            total += a.getPassengersCapacity();
        }
        return total;
    }

    public static int totalCargoCapacity(Airplane[] airplanes){
        int total = 0;
        for (Airplane a : airplanes) {
            total += a.getCargoCapacity();
        }
        return total;
    }

    public static Airplane[] sortByFlightRange(Airplane[] airplanes){
        Airplane[] sorted = Arrays.copyOf(airplanes, airplanes.length);
        Arrays.sort(sorted, (o1, o2) -> (o2.getFlightRange() - o1.getFlightRange()));
        return sorted;
    }

    public static Airplane findAirplane(Airplane[] airplanes, int flightRangeFrom, int flightRangeTo, double cargoCapacityFrom, double cargoCapacityTo, int passengersCapacityFrom, int passengersCapacityTo){
        Airplane result = Arrays.stream(airplanes)
                .filter(e -> e.getFlightRange() >= flightRangeFrom && e.getFlightRange() <= flightRangeTo)
                .filter(e -> e.getCargoCapacity() >= cargoCapacityFrom && e.getCargoCapacity() <= cargoCapacityTo)
                .filter(e -> e.getPassengersCapacity() >= passengersCapacityFrom && e.getPassengersCapacity() <= passengersCapacityTo)
                .collect(Collectors.toCollection(ArrayList::new))
                .get(0);
        return result;
    }

    public static Airplane findAirplaneConsole(Airplane[] aircompany){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minimum flight range: ");
        int flightRangeFrom = scanner.nextInt();
        System.out.println("Enter maximum flight range:");
        int flightRangeTo = scanner.nextInt();
        System.out.println("Enter minimum cargo capacity: ");
        double cargoCapacityFrom = scanner.nextDouble();
        System.out.println("Enter maximum cargo capacity: ");
        double cargoCapacityTo = scanner.nextDouble();
        System.out.println("Enter minimum passenger capacity: ");
        int passengersCapacityFrom = scanner.nextInt();
        System.out.println("Enter maximum passenger capacity: ");
        int passengersCapacityTo = scanner.nextInt();
        System.out.println();
        return findAirplane(aircompany, flightRangeFrom, flightRangeTo, cargoCapacityFrom, cargoCapacityTo, passengersCapacityFrom, passengersCapacityTo);
    }
}