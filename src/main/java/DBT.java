import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DBT implements Filter{

   private static LocalDateTime time = LocalDateTime.parse(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm")));
   private static List<Flight> list = new ArrayList<Flight>();
    @Override
    public List<Flight> filter(List<Flight> flightList) {
        System.out.println("Вылет до текщего времени: ");
        for (Flight flight : flightList) {
            for (Segment segment : flight.getSegments()) {
                if (time.isAfter(segment.getDepartureDate())) {
                    list.add(flight);
                }
            }
        }
        return list;
    }
}
