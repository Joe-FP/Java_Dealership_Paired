import java.util.ArrayList;

public class Customer {

    private String name;
    private double funds;
    private ArrayList<Car> ownedCars;
    private ArrayList<Car> rentedCars;

    public Customer(String name, double funds) {
        this.name = name;
        this.funds = funds;
        ownedCars = new ArrayList<Car>();
        rentedCars = new ArrayList<Car>();
    }

    public String getName() {
        return this.name;
    }

    public double getFunds() {
        return this.funds;
    }

    public void buyCar(Car car) {
        if(this.funds >= car.getPrice()){
            this.ownedCars.add(car);
            this.funds -= car.getPrice();
        }
    }

    public int getOwnedCars() {
        return this.ownedCars.size();
    }
}
