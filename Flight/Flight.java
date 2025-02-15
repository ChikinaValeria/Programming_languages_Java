public class Flight {
    
    private String airlines;
    private String origin;
    private String destination;
    private String flightNumber;

    public Flight(String initialAirlines, String initialOrigin, String initialDestination, String initialFlightNumber) {
        airlines = initialAirlines;
        origin = initialOrigin;
        destination = initialDestination;
        flightNumber = initialFlightNumber;
    }

    public String getAirlines() {
        return airlines;
    }

    public void setAirlines(String newAirlines) {
        airlines = newAirlines;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String newOrigin) {
        origin = newOrigin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String newDestination) {
        destination = newDestination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String newFlightNumber) {
        flightNumber = newFlightNumber;
    }

    public String toString() {
        return "Flight{" +
                "airlines='" + airlines + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                '}';
    }
}
