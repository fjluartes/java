// Booking: Booking class for airline reservation system
import java.util.Random;

public class Booking {
    String[] seatType = {"ECONOMY", "BUSINESS"};
    int seatNumber;
    int flightNumber;
    int bookingNumber;
    String depCity;
    String arrCity;
    String date;
    GetBookingDetails input = new GetBookingDetails();

    public void getDetails() {
        Random r = new Random();
        date = input.getUserInput("Enter booking date(DD-MM-YYYY): ");
        System.out.println("Booking date is: " + date);
        depCity = input.getUserInput("Enter departure city: ");
        System.out.println("Departure city is: " + depCity.toUpperCase());
        arrCity = input.getUserInput("Enter arrival city: ");
        System.out.println("Arrival city is: " + arrCity.toUpperCase());

        flightNumber = 1 + r.nextInt(1000);
        bookingNumber = 1 + r.nextInt(10000);
        seatNumber = 1 + r.nextInt(99);
        System.out.println("Flight number is: " + flightNumber);
        System.out.println("Booking number is: " + bookingNumber);
        System.out.println("Seat number is: " + seatNumber);
    } 
}
