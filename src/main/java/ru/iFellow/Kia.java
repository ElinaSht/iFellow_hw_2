package ru.iFellow;

public class Kia extends Car {
    private boolean panoramicRoof;

    public Kia(String brand, String model, String transmission, int year, String color, String price, boolean panoramicRoof) {
        super(brand, model, transmission, year, color, price);
        this.panoramicRoof = panoramicRoof;
    }

    @Override
    public String getInfo() {
        return String.format("Наличие люка: %b.", panoramicRoof);
    }
}
