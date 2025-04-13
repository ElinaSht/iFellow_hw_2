package ru.iFellow;

public class Ford extends Car {
    private String bodyType;

    public Ford(String brand, String model, String transmission, int year, String color, String price, String bodyType) {
        super(brand, model, transmission, year, color, price);
        this.bodyType = bodyType;
    }

    @Override
    public String getInfo() {
        return String.format("Тип кузова: %s", bodyType);
    }
}
