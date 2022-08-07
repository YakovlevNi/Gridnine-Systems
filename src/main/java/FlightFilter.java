import java.util.List;

public class FlightFilter {

    private static Filter filter;
    private static List<Flight> flights;

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public List<Flight> returnFilter() {
        return filter.filter(flights);
    }
}

