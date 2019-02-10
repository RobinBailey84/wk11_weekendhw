import java.util.ArrayList;

public class FlightManager {

    public FlightManager() {

    }

    public int getReservedBaggageWeight(Flight flight){
        int weightForBaggage = flight.getPlaneWeight() / 2;
        return weightForBaggage;
    }

    public int getPassengerBaggageAllowance(Flight flight){
        int passengerAllowance = getReservedBaggageWeight(flight) / flight.getPlaneCapacity();
        return passengerAllowance;
    }

    public int checkWeightAllowance(Flight flight){
        ArrayList<Passenger> passengers = flight.getPassengers();
        int total = 0;
        for(Passenger passenger : passengers){
            total += passenger.getNumberOfBags() * getPassengerBaggageAllowance(flight);
        }
       return total;
    }

    public int checkRemainingBaggageeWeight(Flight flight){
        int weightRemaining = getReservedBaggageWeight(flight) - checkWeightAllowance(flight);
        return weightRemaining;
    }


}
