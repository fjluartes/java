// Booking: Booking class for airline reservation system
public class Booking {
    GetBookingDetails input = new GetBookingDetails();
    boolean[] isSeatTaken = new boolean[20];
    String[] seatType = {"ECONOMY", "BUSINESS"};
    String getSeat = null;
    String choice = null;
    int seatNum = 0;
    int i = 5, j = 0;
    String seatClass = null;

    public void getSeatType() {
        System.out.println("WELCOME TO AIR PHILIPPINES");
        System.out.println("Which seat type do you want? ");
        getSeat = input.getUserInput("SELECT 1 - BUSINESS or 2 - ECONOMY: ");

        if (getSeat.equals("2")) {
            seatClass = seatType[0];
            if ((isSeatTaken[i] == false) && (i < 20)) {
                isSeatTaken[i] = true;
                seatNum = i + 1;
                i++;
            }
            
            if (i == 20) {
                choice = input.getUserInput("Do you want to switch to BUSINESS class? (y/n): ");
                if (choice.equals("y")) {
                    getSeat = "1";
                } else if (choice.equals("n")) {
                    System.out.println("Next flight is in 3 hours.");
                } else {
                    System.out.println("Invalid choice.");
                }
            }
        }

        if (getSeat.equals("1")) {
            seatClass = seatType[1];
            if ((j < 5) && (isSeatTaken[j] == false)) {
                isSeatTaken[j] = true;
                seatNum = j + 1;
                j++;
            }
        }

        System.out.println("BOARDING PASS");
        System.out.println("SEAT NUMBER: " + seatNum); 
        System.out.println("SEAT TYPE:   " + seatClass);
    }
}
