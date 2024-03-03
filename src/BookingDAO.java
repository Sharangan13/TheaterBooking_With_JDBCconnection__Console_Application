import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookingDAO {

    public int getBookedCount(int movieNumber,String timeSloat) throws SQLException {

        String query = "SELECT SUM(ticketCount) AS sumofcount FROM booking WHERE movieNumber = ? AND timeSlot = ?";
        Connection con = DbConnection.getConnection();
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, movieNumber);
        pst.setString(2, timeSloat);
        ResultSet rs = pst.executeQuery();
        rs.next();
        return rs.getInt(1);
    }

    public void addBooking(Booking booking) throws SQLException{
        String query = "Insert into booking values(?,?,?,?)";
        Connection con = DbConnection.getConnection();
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, booking.customerName);
        pst.setInt(2, booking.movieNumber);
        pst.setString(3, booking.timeSloat);
        pst.setInt(4,booking.ticketCount);

        pst.executeUpdate();

    }
}