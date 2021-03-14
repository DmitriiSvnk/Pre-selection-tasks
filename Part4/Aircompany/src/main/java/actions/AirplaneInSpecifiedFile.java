package actions;

import models.Airplane;

public class AirplaneInSpecifiedFile implements Storage{
    public void writeInSpecifiedFile(Airplane airplane, String path) {
        write(airplane, path);
    }

    public Airplane readFromSpecifiedFile(String path){
        return (Airplane)read(path);
    }
}
