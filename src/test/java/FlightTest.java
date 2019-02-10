import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {
    Passenger passenger;
    Plane plane;
    Flight flight;

    @Before
    public void setup(){
        passenger = new Passenger("Tony Adams", 2);
        plane = new Plane(PlaneType.TESTPLANE);
        flight = new Flight(1,"London", "Glasgow", "15.00", plane);
    }

    @Test
    public void passengerArrayIsEmpty() {
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void canAddPassengerToFlight(){
        flight.addPassengerToFlight(passenger);
        assertEquals(1, flight.countPassengers());
//        assertEquals(1, passenger.countFlights());
    }

    @Test
    public void checkSeatsAreAvailable() {
        flight.addPassengerToFlight(passenger);
        assertEquals(true, flight.checkIfSeatsAreAvailable());
    }

    @Test
    public void checkNumberOfAvailableSeats() {
        flight.addPassengerToFlight(passenger);
        assertEquals(1, flight.checkNumberOfSeatsAvailable());
    }
}
