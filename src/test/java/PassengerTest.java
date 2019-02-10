import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Flight flight;
    Plane plane;

    @Before
    public void before(){
        passenger = new Passenger("Dennis Bergkamp", 1);
        plane = new Plane(PlaneType.TESTPLANE);
        flight = new Flight(1, "Paris", "Glasgow", "15.00", plane);
    }

    @Test
    public void passengerHasName() {
        assertEquals("Dennis Bergkamp", passenger.getName());
    }

    @Test
    public void passengerHasBag() {
        assertEquals(1, passenger.getNumberOfBags());
    }

    @Test
    public void checkFlightBooked() {
        passenger.flightBooked(flight);
        assertEquals(1, passenger.countFlights());

    }

    @Test
    public void checkPassengerHasSeat() {
        assertEquals(1, passenger.assignSeatNumber(flight));
    }
}
