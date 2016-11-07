package project.practice.car;

/**
 * Created by victor on 04.11.16.
 */
public class Car {
    private long id;
    private Brand brand;
    private String model;
    private int madeYear;
    private Color color;
    private double price;
    private String regNumber;

    public Car() {}

    public Car(long id, Brand brand, String model, int year, Color color, double price, String regNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.madeYear = year;
        this.color = color;
        this.price = price;
        this.regNumber = regNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMadeYear() {
        return madeYear;
    }

    public void setMadeYear(int madeYear) {
        this.madeYear = madeYear;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand=" + brand +
                ", model='" + model + '\'' +
                ", madeYear=" + madeYear +
                ", color=" + color +
                ", price=" + price +
                ", regNumber='" + regNumber + '\'' +
                '}';
    }
}
