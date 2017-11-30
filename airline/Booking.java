// Booking: Booking class for airline reservation system
import java.util.Random;

public class Booking {
    String[] seatType = {"ECONOMY", "BUSINESS"};
    int seatNumber;
    int flightNumber;
    int bookingNumber;
    String seatChoice;
    String depCity;
    String arrCity;
    String date;
    GetBookingDetails input = new GetBookingDetails();

    public void getDetails() {
        Random r = new Random();
        date = input.getUserInput("Enter booking date(DD-MM-YYYY): ");
        depCity = input.getUserInput("Enter departure city: ");
        arrCity = input.getUserInput("Enter arrival city: ");
        seatChoice = input.getUserInput("Enter seat type(ECONOMY or BUSINESS): "); 
        flightNumber = 1 + r.nextInt(1000);
        bookingNumber = 1 + r.nextInt(10000);
        seatNumber = 1 + r.nextInt(99);
        
        System.out.println("");
        System.out.println("BOOKING DETAILS");
        System.out.println("BOOKING NUMBER:     " + bookingNumber);
        System.out.println("BOOKING DATE:       " + date);
        System.out.println("DEPARTURE CITY:     " + depCity.toUpperCase());
        System.out.println("ARRIVAL CITY:       " + arrCity.toUpperCase());
        System.out.println("FLIGHT NUMBER:      " + flightNumber);
        System.out.println("SEAT NUMBER:        " + seatNumber);
        if (seatChoice.toUpperCase().equals(seatType[0]) ||
            seatChoice.toUpperCase().equals(seatType[1])) {
            System.out.println("SEAT CLASS:         " + seatChoice.toUpperCase());
        }
    } 
}
