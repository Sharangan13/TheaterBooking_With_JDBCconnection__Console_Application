import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TheaterDAO {
    public void displayThearterInfo() throws SQLException {
        String query = "Select * from theater";
        Connection con = DbConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while(rs.next()) {

            if(rs.getInt(1)==1){
                System.out.println("Movie : bigil");
            }
            else if (rs.getInt(1)==2) {
                System.out.println("Movie : master");
            }
            else {
                System.out.println("Movie : leo");
            }

            System.out.println("Time sloat is: " + rs.getString(2));

            System.out.println("capacity is: " + rs.getInt(3));

            System.out.println("------------------------------------------");
        }


    }

    public int getCapacity(int movieNumber) throws SQLException {
        String query = "Select capacity from theater where movie_number=" + movieNumber;
        Connection con = DbConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        return rs.getInt(1);
    }
}
