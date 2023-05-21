package lab5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerializer {
    public static void serializeObject(Object object, String filePath) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(object);
            System.out.println("Объект успешно сериализован и сохранен в файл: " + filePath);
        } catch (IOException e) {
            throw new IOException("Ошибка при сериализации объекта: " + e.getMessage());
        }
    }
}
