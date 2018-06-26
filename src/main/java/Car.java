public class Car {

    private String brand;
    private double price;
    private Component wheels;
    private Component engine;
    private Component wipers;

    public Car(String brand, double price, Component wheels, Component engine, Component wipers) {
        this.brand = brand;
        this.price = price;
        this.wheels = wheels;
        this.engine = engine;
        this.wipers = wipers;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getPrice() {
        return this.price;
    }

    public Component getWheels() {
        return this.wheels;
    }

    public Component getEngine() {
        return this.engine;
    }

    public Component getWipers() {
        return this.wipers;
    }

    public void setWheels(Component wheels) {
        this.wheels = wheels;
    }

    public void setEngine(Component engine) {
        this.engine = engine;
    }

    public void setWipers(Component wipers) {
        this.wipers = wipers;
    }
}
