import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

            List<Flight> flights = FlightBuilder.createFlights();
            FlightFilter flightFilter = new FlightFilter();
            flightFilter.setFlights(flights);


            flightFilter.setFilter(new FBA());
            print(flightFilter.returnFilter());

            flightFilter.setFilter(new DBT());
            print(flightFilter.returnFilter());

        }

        public static void print (List<Flight> list) {
            list.forEach(System.out::println);
        }



  }












