package ru.iFellow;

public class Tesla extends Car {
    private int batteryCapacity;
    private int chargingTime;

    public Tesla(String brand, String model, String transmission, int year, String color, String price, int batteryCapacity, int chargingTime) {
        super(brand, model, transmission, year, color, price);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    public void chargeBattery() {
        System.out.println("Батарея заряжается");
    }

    @Override
    public String getInfo() {
        return String.format("Время заряда: %d мин", chargingTime);
    }
}
