import java.util.ArrayList;
import java.util.Random;

public class Passenger {

    private String name;
    private int numberOfBags;
    private ArrayList<Flight> flights;
    private int seatNumber;


    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.flights = new ArrayList<Flight>();
        this.seatNumber = seatNumber;


    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfBags() {
        return this.numberOfBags;
    }

    public void flightBooked(Flight flight){
        this.flights.add(flight);
    }


    public int countFlights() {
        return flights.size();
    }

    public int assignSeatNumber(Flight flight){
        Random rand = new Random();
        int min = 1;
        int max = flight.getPlaneCapacity();
        for(int i = min; i < max; i++){
            int seatNumber = min + rand.nextInt(max);
                    this.seatNumber = seatNumber;
        }
        return seatNumber;
    }
}
