import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CarTest {

    Car car;
    Wheel wheel;
    Engine engine;
    Wiper wiper;

    @Before
    public void setUp() throws Exception {
        wheel = new Wheel("Pirelli", 100, "Asymmetrical");
        engine = new Engine("diesel", 100, 2000);
        wiper = new Wiper("Bosch", 100, "beam blades");
        car = new Car("Fiat", 1000, wheel, engine, wiper);
    }

    @Test
    public void hasMake() {
        assertEquals("Fiat", car.getBrand());
    }

    @Test
    public void getPrice() {
        assertEquals(1000, car.getPrice(),0.1);
    }

    @Test
    public void hasWheels() {
        assertNotNull(car.getWheels());
    }

    @Test
    public void hasEngine() {
        assertNotNull(car.getEngine());
    }

    @Test
    public void name() {
        assertNotNull(car.getWipers());
    }
}
