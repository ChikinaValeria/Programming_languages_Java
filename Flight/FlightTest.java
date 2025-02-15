public class FlightTest {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Finnair", "Tampere", "Berlin", "FI73");
        Flight flight2 = new Flight("Lufthansa", "Frankfurt", "New York", "LH456");
        Flight flight3 = new Flight("Emirates", "Dubai", "Dakka", "EM414");

        System.out.println("Initial Flight Information:");
        System.out.println(flight1);
        System.out.println(flight2);
        System.out.println(flight3);

        flight1.setOrigin("Helsinki");
        flight1.setDestination("Seoul");
        flight2.setAirlines("American Airways");
        flight3.setFlightNumber("EK415");

        System.out.println(flight1.getOrigin());
        System.out.println(flight1.getDestination());
        System.out.println(flight2.getAirlines());
        System.out.println(flight3.getFlightNumber());

        System.out.println("\nUpdated Flight Information:");
        System.out.println(flight1);
        System.out.println(flight2);
        System.out.println(flight3);
    }
}

