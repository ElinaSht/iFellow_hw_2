package ru.iFellow;

public class Suzuki extends Car {
    private int mileage;

    public Suzuki(String brand, String model, String transmission, int year, String color, String price, int mileage) {
        super(brand, model, transmission, year, color, price);
        this.mileage = mileage;
    }

    @Override
    public String getInfo() {
        return String.format("Пробег: %d км", mileage);
    }
}
