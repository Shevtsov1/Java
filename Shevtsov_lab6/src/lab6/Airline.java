package lab6;

import java.io.*;
import java.util.*;

public class Airline implements Comparable<Airline> {
    private String destination;
    private int flightNumber;
    private String aircraftType;
    private String departureTime;
    private String weekdays;

    public Airline(String destination, int flightNumber, String aircraftType, String departureTime, String weekdays) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.weekdays = weekdays;
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getWeekdays() {
        return weekdays;
    }

    @Override
    public int compareTo(Airline other) {
        return this.destination.compareTo(other.destination);
    }

    @Override
    public String toString() {
        return "Destination: " + destination +
                ", Flight Number: " + flightNumber +
                ", Aircraft Type: " + aircraftType +
                ", Departure Time: " + departureTime +
                ", Weekdays: " + weekdays;
    }

    public static void main(String[] args) {
        List<Airline> airlines = new ArrayList<>();

        // Чтение объектов из файла и добавление их в коллекцию
        try (Scanner scanner = new Scanner(new File("flights.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                String destination = parts[0];
                int flightNumber = Integer.parseInt(parts[1]);
                String aircraftType = parts[2];
                String departureTime = parts[3];
                String weekdays = parts[4];
                airlines.add(new Airline(destination, flightNumber, aircraftType, departureTime, weekdays));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Сортировка коллекции по полю destination
        Collections.sort(airlines);

        // Запись отсортированных данных в файл
        try (PrintWriter writer = new PrintWriter(new FileWriter("sorted_flights.txt"))) {
            for (Airline airline : airlines) {
                writer.println(airline.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Вывод списка рейсов для заданного пункта назначения
        String destination = "New-York";
        System.out.println("Flights to " + destination + ":");
        for (Airline airline : airlines) {
            if (airline.getDestination().equals(destination)) {
                System.out.println(airline.toString());
            }
        }

        // Вывод списка рейсов для заданного дня недели
        String weekday = "Monday";
        System.out.println("Flights on " + weekday + ":");
        for (Airline airline : airlines) {
            if (airline.getWeekdays().contains(weekday)) {
                System.out.println(airline.toString());
            }
        }

        // Вывод списка рейсов для заданного дня недели и времени вылета больше заданного
        String targetWeekday = "Tuesday";
        String targetDepartureTime = "12:00";
        System.out.println("Flights on " + targetWeekday + " with departure time after " + targetDepartureTime + ":");
        for (Airline airline : airlines) {
            if (airline.getWeekdays().contains(targetWeekday) && airline.getDepartureTime().compareTo(targetDepartureTime) > 0) {
                System.out.println(airline.toString());
            }
        }
    }
}
