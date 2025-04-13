package ru.iFellow;

public class Toyota extends Car {
    private int engineVolume;

    public Toyota(String brand, String model, String transmission, int year, String color, String price, int engineVolume) {
        super(brand, model, transmission, year, color, price);
        this.engineVolume = engineVolume;
    }

    @Override
    public String getInfo() {
        return String.format("Объем двигателя: %d", engineVolume);
    }
}
