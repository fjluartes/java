// Booking: booking class for airline reservation
public class Booking {
    GetDetails input = new GetDetails();
    boolean[] seats = new boolean[20];
    String get = null;
    int num = 0, seatNum = 0;

    public void start() {
        while(true) {
            makeReservation();
        }
    }

    private void makeReservation() {
        System.out.println("WELCOME TO AIR LINES");
        System.out.println("Which seat class do you want?");
        get = input.getUserInput("Select 1 - BUSINESS and 2 - ECONOMY: ");

        // code for assigning seats
        if (Integer.parseInt(get) == 1) {
            num = reservation(SeatType.BUSINESS);
            boardingPass(num, SeatType.BUSINESS);
        } else if (Integer.parseInt(get) == 2) {
            reservation(SeatType.ECONOMY);
            boardingPass(num, SeatType.ECONOMY);
        } else {
            System.out.println("Invalid choice.");
        }

        if (seats[19] == true) {
            System.exit(0);
        }
    }
    
    private int reservation(SeatType s) {
        if (s == SeatType.BUSINESS) {
            for (int i = 0; i < 5; i++) {
                if (seats[i] == false) {
                    seats[i] = true;
                    seatNum = i;
                    break;
                }
            }
        }
        
        if (s == SeatType.ECONOMY) {
            for (int j = 5; j < 20; j++) {
                if (seats[j] == false) {
                    seats[j] = true;
                    seatNum = j;
                    break;
                }
            }
        }
        return seatNum;
    }
        
    private void boardingPass(int reservation, SeatType s) {
        System.out.println("BOARDING PASS");
        System.out.println("SEAT NUMBER: " + reservation);
        System.out.println("SEAT CLASS:  " + s);
    }
}
