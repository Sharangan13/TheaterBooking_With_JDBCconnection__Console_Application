import java.sql.SQLException;
import java.util.Scanner;

public class Booking {
    String customerName;
    int movieNumber;
    String timeSloat;
    int ticketCount;

    Booking(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name: ");
        customerName = scanner.next();

        System.out.println("Enter movie no:(Press 1(bigil) or 2(master) or 3(leo)) ");
        movieNumber = scanner.nextInt();


        System.out.println("Enter time sloat no: (press 9-12 because only this time is available) ");
        timeSloat = scanner.next();

        System.out.println("How many tickets you want? : ");
        ticketCount = scanner.nextInt();


    }

    public boolean isAvailable()  throws SQLException {

        TheaterDAO theaterdao = new TheaterDAO();
        BookingDAO bookingdao = new BookingDAO();
        int capacity = theaterdao.getCapacity(movieNumber);

        int booked = bookingdao.getBookedCount(movieNumber,timeSloat);

        return booked<capacity;

    }
}
