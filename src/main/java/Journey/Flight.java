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
        return pilot;
    }

    public Plane getPlane() {
        return plane;
    }

    public ArrayList<CabinCrewMember> getCrewMembers() {
        return crewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

}
