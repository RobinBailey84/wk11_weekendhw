import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private int flightNumber;
    private String destination;
    private String departure;
    private String time;
    private Plane plane;

    public Flight(int flightNumber, String destination, String departure, String time, Plane plane){
        this.passengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.time = time;
        this.plane = plane;
}

    public void addPassengerToFlight(Passenger passenger){
        if(checkIfSeatsAreAvailable() == true) {
            this.passengers.add(passenger);
//            passenger.flightBooked();
        }
}

    public int countPassengers(){
        return this.passengers.size();
    }

    public boolean checkIfSeatsAreAvailable(){
        if(plane.getCapacityFromEnum() > this.passengers.size()){
            return true;
        }
        return false;
    }

    public int checkNumberOfSeatsAvailable(){
        int seatsAvailble = plane.getCapacityFromEnum() - this.passengers.size();
        return seatsAvailble;
    }


    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int getPlaneCapacity(){
        return this.plane.getCapacityFromEnum();
    }

    public int getPlaneWeight(){
        return this.plane.getWeightFromEnum();
    }
}

