import Journey.Flight;
import Journey.Plane;
import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Pilot pilot1;
    Passenger passenger1;
    Passenger passenger2;
    ArrayList<Passenger> passengers;


    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    ArrayList<CabinCrewMember> cabinCrewMembers;

    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;

    @Before
    public void before(){
        pilot1 = new Pilot("Buffy Summers", Rank.CAPTAIN, "TC7689B");

        cabinCrewMember1 = new CabinCrewMember("Ruby", Rank.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Aliya", Rank.FLIGHT_ATTENDANT);
        cabinCrewMembers = new ArrayList<CabinCrewMember>();
        cabinCrewMembers.add(cabinCrewMember1);
        cabinCrewMembers.add(cabinCrewMember2);

        passenger1 = new Passenger("Rhett", 2);
        passenger2 = new Passenger("Scarlett", 5);
        passengers = new ArrayList<Passenger>();
        passengers.add(passenger1);
        passengers.add(passenger2);

        passenger3 = new Passenger("Kady", 1);
        passenger4 = new Passenger("Cole", 1);
        passenger5 = new Passenger("Shona", 1);
        passenger6 = new Passenger("Shayne", 1);




        flight = new Flight(pilot1, Plane.MINI_BOEING747, cabinCrewMembers,
                passengers, "FR832", "LDN",
                "JFK", "5.30pm");
    }

    @Test
    public void hasPilot(){
        assertEquals(pilot1, flight.getPilot());
    }

    @Test
    public void hasPlane(){
        assertEquals(Plane.MINI_BOEING747, flight.getPlane());
    }

    @Test
    public void hasCabinCrewList(){
        assertEquals(cabinCrewMembers, flight.getCrewMembers());
    }

    @Test
    public void hasPassengersList(){
        assertEquals(passengers, flight.getPassengers());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("FR832", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("LDN", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("JFK", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("5.30pm", flight.getDepartureTime());
    }

    @Test
    public void checkPlaneCapacity(){
        assertEquals(5, flight.getPlane().getCapacity());
    }

    @Test
    public void checkPassengerListSize(){
        assertEquals(2, flight.getPassengers().size());
    }

    @Test
    public void checkSeatsAvailableTrueOrFalse(){
        assertEquals(true, flight.seatsAreAvailable());
    }

    @Test
    public void checkNumberOfAvailableSeats(){
        assertEquals(3, flight.getNumberOfAvailableSeats());
    }


    @Test
    public void addPassenger(){
        Passenger passenger3 = new Passenger("Kady", 1);
        if (flight.getNumberOfAvailableSeats() > 0)
        passengers.add(passenger3);
        assertEquals(3, flight.getPassengers().size());
        assertEquals(2, flight.getNumberOfAvailableSeats());
    }

    @Test
    public void addPassengerIfSeatsAvailable(){
        assertEquals(3, flight.addPassengerIfSeatsAvailable(passenger3));
        assertEquals(4, flight.addPassengerIfSeatsAvailable(passenger4));
        assertEquals(5, flight.addPassengerIfSeatsAvailable(passenger5));
        assertEquals(5, flight.addPassengerIfSeatsAvailable(passenger6));

    }


}
