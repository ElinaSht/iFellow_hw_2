package ru.iFellow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = createCarList();

        System.out.println("По годам");
        printCarsByYear(cars);
        System.out.println("Замена цвета");
        changeGreenToRed(cars);
        System.out.println("Автоматическая коробка передач");
        printAutomaticCars(cars);
    }

    private static List<Car> createCarList() {
        List<Car> cars = new ArrayList<Car>();

        cars.add(new Ford("Ford", "Focus", "Manual", 2005, "Blue", "$5,000", "Hatchback"));
        cars.add(new Ford("Ford", "Taurus", "Automatic", 2004, "Silver", "$4,500", "Sedan"));
        cars.add(new Kia("Kia", "Spectra", "Manual", 2003, "Green", "$3,800", false));
        cars.add(new Kia("Kia", "Sorento", "Automatic", 2005, "Black", "$7,000", false));
        cars.add(new Suzuki("Suzuki", "Swift", "Manual", 2002, "Red", "$3,200", 120000));
        cars.add(new Suzuki("Suzuki", "Grand Vitara", "Manual", 2001, "White", "$4,800", 150000));
        cars.add(new Tesla("Tesla", "Model 3", "Automatic", 2020, "White", "$40,000", 75, 30));
        cars.add(new Tesla("Tesla", "Model S", "Automatic", 2022, "Black", "$80,000", 100, 45));
        cars.add(new Toyota("Toyota", "Camry", "Automatic", 2015, "Silver", "$15,000", 2500));
        cars.add(new Toyota("Toyota", "RAV4", "Automatic", 2018, "Blue", "$22,000", 2000));

        return cars;
    }

    private static void printCarsByYear(List<Car> cars) {
        for (Car car : cars) {
            if (car.getYear() > 2006) {
                System.out.println(car.getCarInfo());
            } else {
                System.out.println(car.getCarInfo() + " - устаревший авто");
            }
        }
    }

    public static void changeGreenToRed(List<Car> cars) {
        for (Car car : cars) {
            if (car.getColor().equalsIgnoreCase("Green")) {
                car.setColor("Red");
                System.out.println(car.getCarInfo());
            }
        }
    }

    public static void printAutomaticCars(List<Car> cars) {
        for (Car car : cars) {
            if (car.getTransmission().equalsIgnoreCase("Automatic")) {
                System.out.println(car.getCarInfo());
            }
        }
    }

}