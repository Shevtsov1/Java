package lab5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectDeserializer {
    public static Object deserializeObject(String filePath) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            Object object = inputStream.readObject();
            System.out.println("Объект успешно десериализован из файла: " + filePath);
            return object;
        } catch (IOException | ClassNotFoundException e) {
            throw new IOException("Ошибка при десериализации объекта: " + e.getMessage());
        }
    }
}

