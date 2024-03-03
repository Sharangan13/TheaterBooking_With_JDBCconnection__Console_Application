import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {

        TheaterDAO theaderdao = new TheaterDAO();

        try {
            theaderdao.displayThearterInfo();

            int userOpt = 1;
            Scanner scanner = new Scanner(System.in);

            while(userOpt==1) {
                System.out.println("Enter 1 to Book and 0 to exit");
                userOpt = scanner.nextInt();
                if(userOpt == 1) {
                    Booking booking = new Booking();
                    if(booking.isAvailable()) {
                        BookingDAO bookingdao = new BookingDAO();
                        bookingdao.addBooking(booking);
                        System.out.println("Your booking is confirmed");
                    }
                    else
                        System.out.println("Sorry. theater is full. Try another movie...");
                }
            }
            scanner.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

}