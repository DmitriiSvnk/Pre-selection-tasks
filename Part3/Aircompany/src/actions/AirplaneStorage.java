package actions;

import models.Airplane;

public interface AirplaneStorage {
    void write(Airplane airplane, String path);
    Airplane read (String path);
}
