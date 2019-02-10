import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Plane plane;
    Flight flight;
    Passenger passenger;

    @Before
    public void before(){
        flightManager = new FlightManager();
        plane = new Plane(PlaneType.TESTPLANE);
        flight = new Flight(1, "Rome", "London", "15.00", plane);
        passenger = new Passenger("Marc Overmas", 1);
    }

    @Test
    public void checkReservedBaggageWeight(){
        assertEquals(50, flightManager.getReservedBaggageWeight(flight));
    }

    @Test
    public void checkWeightAllowance() {
        flight.addPassengerToFlight(passenger);
        assertEquals(25, flightManager.checkWeightAllowance(flight));
    }

    @Test
    public void checkPassengerBaggageAllowance() {
        assertEquals(25, flightManager.getPassengerBaggageAllowance(flight));
    }

    @Test
    public void checkRemainingWeightAllowance() {
        flight.addPassengerToFlight(passenger);
        assertEquals(25, flightManager.checkRemainingBaggageeWeight(flight));
    }
}
