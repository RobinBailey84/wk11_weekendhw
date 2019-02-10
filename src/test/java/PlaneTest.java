import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){

        plane = new Plane(PlaneType.AIRBUSA300);
    }

    @Test
    public void canGetPlane() {
        assertEquals(PlaneType.AIRBUSA300, plane.getPlane());
    }

    @Test
    public void canGetWeight() {
        assertEquals(200, plane.getWeightFromEnum());

    }

    @Test
    public void canGetCapacity() {
        assertEquals(120, plane.getCapacityFromEnum());
    }
}
