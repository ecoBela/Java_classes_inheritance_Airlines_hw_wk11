package Journey;

import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;

import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private Plane plane;
    private ArrayList<CabinCrewMember> crewMembers;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(
            Pilot pilot, Plane plane, ArrayList<CabinCrewMember> crewMembers,
            ArrayList<Passenger> passengers, String flightNumber, String destination,
            String departureAirport, String departureTime)
    {
        this.pilot = pilot;
        this.plane = plane;
        this.crewMembers = crewMembers;
        this.passengers = passengers;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }


    public Pilot getPilot() {
        return this.pilot;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public ArrayList<CabinCrewMember> getCrewMembers() {
        return this.crewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public int getNumberOfAvailableSeats(){
        return this.plane.getCapacity() - this.passengers.size();
    }

//    public int getPassengersListSize(){
//    return this.passengers.size()}

//    public int addPassengerIfCapacity(){
//
//    }

}
