import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void setup () {
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume () {
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void takeDrink () {
        assertEquals(90, waterbottle.takeDrink());
    }

    @Test
    public void emptyDrink () {
        assertEquals (0, waterbottle.emptyDrink());
    }

    @Test
    public void fillDrink() {
        assertEquals (100, waterbottle.fillDrink());
    }
}
