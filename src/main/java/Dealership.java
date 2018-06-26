import java.util.ArrayList;

public class Dealership {

    private String name;
    private double balance;
    private ArrayList<Car> cars;
    private ArrayList<Customer> customers;

    public Dealership(String name, double balance) {
        this.name = name;
        this.balance = balance;
        cars = new ArrayList<Car>();
        customers = new ArrayList<Customer>();
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void addCar(Car vehicle){
        this.cars.add(vehicle);
    }

    public int getCarCount() {
        return this.cars.size();
    }

    public void carToClient(Car car){
        this.cars.remove(car);
    }

}
