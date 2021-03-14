package actions;

import com.google.gson.Gson;
import models.Airplane;

public class AirplaneInJSON implements Storage{
    public static String airplaneToJson(Airplane airplane){
        Gson gson = new Gson();
        return gson.toJson(airplane);
    }

    public static Airplane jsonToAirplane(String airplaneInJson){
        Gson gson = new Gson();
        return gson.fromJson(airplaneInJson, Airplane.class);
    }

    public void writeInJsonFile(Airplane airplane, String path) {
        String airplaneInJson = airplaneToJson(airplane);
        write(airplaneInJson, path);
    }

    public Airplane readFromJsonFile(String path) {
        String airplaneInJson = (String) read(path);
        return jsonToAirplane(airplaneInJson);
    }
}