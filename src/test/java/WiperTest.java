import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WiperTest {

    Wiper wiper;

    @Before
    public void setUp() throws Exception {
        wiper = new Wiper("Bosch", 100, "beam blades");
    }

    @Test
    public void hasModel() {
        assertEquals("beam blades", wiper.getModel());
    }
}
