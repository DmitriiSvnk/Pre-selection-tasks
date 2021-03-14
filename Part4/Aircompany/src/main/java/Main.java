import actions.AirplaneGenerator;
import actions.AirplaneInSpecifiedFile;
import actions.Storage;
import models.Airplane;
import actions.Airplanes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! To create an air company enter the desired number of planes:");
        int size = scanner.nextInt();
        Airplane[] aircompany = AirplaneGenerator.createCompany(size);
        AirplaneGenerator.fill(aircompany);

        System.out.println("Your company owns the following aircraft:");
        for (Airplane a : aircompany) System.out.println(a);

        System.out.println("\nTotal passengers capacity of all aircraft: "
                + Airplanes.totalPassengerCapacity(aircompany) + " people.");

        System.out.println("\nTotal cargo capacity of all aircraft: "
                + Airplanes.totalCargoCapacity(aircompany) + " kilograms.");

        System.out.println("\nDo you want to sort aircraft by flight range? (enter \"yes\" if you want)");
        String answer = scanner.next();
        if (answer.equals("yes")) {
            Airplane[] sorted = Airplanes.sortByFlightRange(aircompany);
            System.out.println("\nAirlines aircraft sorted by flight range:");
            for (Airplane a : sorted) System.out.println(a);
        }

        System.out.println("\nDo you want to find a plane by parameters? (enter \"yes\" if you want)");
        answer = scanner.next();
        if (answer.equals("yes")) {
            Airplane parametrized = Airplanes.findAirplaneConsole(aircompany);
            System.out.println("\nThe aircraft satisfying search parameters is: ");
            System.out.println(parametrized);

            System.out.println("\nDo you want to save a airplane in file? (enter \"yes\" if you want)");
            answer = scanner.next();
            if (answer.equals("yes")) {
                System.out.println("Specify the path and save file (for example \"D:/airplane.data\"): ");
                String path = scanner.next();
                Storage airplaneInFile = new AirplaneInSpecifiedFile();
                airplaneInFile.write(parametrized, path);
            }
        }
    }
}
