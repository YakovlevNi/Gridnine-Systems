import java.util.ArrayList;
import java.util.List;

public class FBA implements Filter {
    @Override
    public List<Flight> filter(List<Flight> flightList) {
        System.out.println("Рейсы,где прилет раньше вылета: ");
        List<Flight> list = new ArrayList<>();
        flightList.forEach(flight -> flight.getSegments()
                .stream()
                .filter(segment -> segment.getArrivalDate().isAfter(segment.getDepartureDate())).limit(2)
                .forEach(segment -> list.add(flight)));
        return list;
    }
}

