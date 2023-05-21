package lab3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class ButterSerializationHelper {
    public static void serializeButters(List<Butter> butters, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(butters);
            System.out.println("Butters serialized successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred during butter serialization: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
	public static List<Butter> deserializeButters(String fileName) {
        List<Butter> butters = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            butters = (List<Butter>) ois.readObject();
            System.out.println("Butters deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error occurred during butter deserialization: " + e.getMessage());
        }
        return butters;
    }
}

