package actions;

import models.Airplane;
import models.Lightweight;
import models.LightweightAirplane;
import models.MiddleweightAirplane;

import java.sql.*;

public class AirplaneInDatabase{
    private final String HOST = "localhost";
    private final String PORT = "3360";
    private final String USERNAME = "root";
    private final String PASSWORD = "password";
    private final String DB_NAME = "airplanes";
    private final String URL = "jdbc.mysql://" + HOST + ":" + PORT + "/" + DB_NAME;



    private ResultSet getResultSet() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        ResultSet resultSet = null;
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from airplanes");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public Airplane read() {
        ResultSet result = null;
        try {
            result = getResultSet();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String model = "";
        int flightRange = 0;
        int cargoCapacity = 0;
        int passengersCapacity = 0;
        try {
            model = result.getString("model");
            flightRange = result.getInt("flightRange");
            cargoCapacity = result.getInt("cargoCapacity");
            passengersCapacity = result.getInt("passengerCapacity");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (cargoCapacity < Lightweight.MAX_CARGO_KILOGRAMS) {
            return new LightweightAirplane(model, flightRange, cargoCapacity, passengersCapacity);
        }
        return new MiddleweightAirplane(model, flightRange, cargoCapacity, passengersCapacity);
    }
}
