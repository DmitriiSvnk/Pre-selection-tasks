package actions;

import java.io.*;

public interface Storage {
    default void write(Object obj, String path) {
        File file = new File(path);
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            if(fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(obj);
            }
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

    default Object read(String path) {
        File file = new File(path);
        ObjectInputStream ois = null;
        Object result = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            if(fis != null) {
                ois = new ObjectInputStream(fis);
                result = ois.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
