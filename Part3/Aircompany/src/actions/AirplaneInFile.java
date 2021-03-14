package actions;

import models.Airplane;

import java.io.*;

public class AirplaneInFile implements AirplaneStorage {
    @Override
    public void write(Airplane airplane, String path) {
        File file = new File(path);
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            if(fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(airplane);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public Airplane read(String path) {
        File file = new File(path);
        ObjectInputStream ois = null;
        Airplane airplane = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            if(fis != null) {
                ois = new ObjectInputStream(fis);
                airplane = (Airplane) ois.readObject();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return airplane;
    }
}
