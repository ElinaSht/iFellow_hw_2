package ru.iFellow;

import lombok.Data;

@Data
public abstract class Car {

    private String brand;
    private String model;
    private String transmission;
    private int year;
    private String color;
    private String price;


    public Car(String brand, String model, String transmission, int year, String color, String price) {
        this.brand = brand;
        this.model = model;
        this.transmission = transmission;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public String getCarInfo() {
        return String.format(
                "Марка: %s, модель: %s, коробка передач: %s, год выпуска: %s, цвет: %s, цена: %s",
                brand, model, transmission, year, color, price);
    }

    public abstract String getInfo();
}
