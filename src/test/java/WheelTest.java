import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WheelTest {

    Wheel wheel;

    @Before
    public void setUp(){
       wheel = new Wheel("Pirelli", 100, "Asymmetrical");
    }

    @Test
    public void hasMake() {
        assertEquals("Pirelli", wheel.getMake());
    }

    @Test
    public void hasCondition() {
        assertEquals(100, wheel.getCondition());
    }

    @Test
    public void hasTreadType() {
        assertEquals("Asymmetrical", wheel.getTreadType());
    }
}
