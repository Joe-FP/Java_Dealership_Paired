import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Dealership dealership;
    Customer customer;
    Car car1;
    Car car2;
    Wheel wheel;
    Engine engine;
    Wiper wiper;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Joe", 1500);
        wheel = new Wheel("Pirelli", 100, "Asymmetrical");
        engine = new Engine("diesel", 100, 2000);
        wiper = new Wiper("Bosch", 100, "beam blades");
        car1 = new Car("Fiat", 1000, wheel, engine, wiper);
        car2 = new Car("Ford", 1500, wheel, engine, wiper);
        dealership = new Dealership("Arnold Clark", 10000);
        dealership.addCar(car1);
        dealership.addCar(car2);
    }

    @Test
    public void hasName() {
        assertEquals("Joe", customer.getName());
    }

    @Test
    public void hasFunds() {
        assertEquals(1500, customer.getFunds(),0.1);
    }

    @Test
    public void canBuyCar() {
        customer.buyCar(car1);
        dealership.carToClient(car1);
        assertEquals(1, customer.getOwnedCars());
        assertEquals(500, customer.getFunds(),0.1);
        assertEquals(1, dealership.getCarCount());
    }
}
