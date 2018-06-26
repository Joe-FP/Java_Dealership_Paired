import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp() throws Exception {
        engine = new Engine("diesel", 100, 2000);
    }

    @Test
    public void hasSize() {
        assertEquals(2000, engine.getSize());
    }

    @Test
    public void canWear() {
        engine.applyWear(50);
        assertEquals(50, engine.getCondition());
    }

    @Test
    public void canRepair() {
        engine.applyWear(50);
        engine.applyRepair(25);
        assertEquals(75, engine.getCondition());
    }

    @Test
    public void canRepair__doesntRepairOver100() {
        engine.applyRepair(25);
        assertEquals(100, engine.getCondition());
    }

}
