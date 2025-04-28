import java.net.StandardSocketOptions;
import java.sql.*;
public class DemoClass {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/demo";
        String userName = "root";
        String password = "mysqlpassword";
        String query1 = "SELECT userName FROM Users WHERE userId = 1";
        String query2 = "SELECT * FROM Users";
        String query3 = "INSERT INTO Users values (4,'Aarav')";
        String query4 = "DELETE FROM Users WHERE userid = 5";
        try {
            //Load the driver
            //Class.forName("com.mysql.jdbc.Driver"); // This is deprecated now.
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Create connection to database and create statement
            Connection con = DriverManager.getConnection(url, userName, password);
            Statement st = con.createStatement();

            //Execute query
            ResultSet rs = st.executeQuery(query1);
            rs.next();

            //Fetch the data from result set
            String name = rs.getString("userName");
            System.out.println(name);

            //Insert data into table
            int numberOfAffectedRows = st.executeUpdate(query3);
            System.out.println("numberOfInsertedRows : " + numberOfAffectedRows);

            //Insert data into table by using prepared statement
            String prepareQuery = "INSERT INTO Users values (?,?)";
            int userid  = 5;
            String username = "Akshita";
            PreparedStatement pst = con.prepareStatement(prepareQuery);
            pst.setInt(1, userid);
            pst.setString(2, username);
            numberOfAffectedRows = pst.executeUpdate();

            //Delete data from table
            numberOfAffectedRows = st.executeUpdate(query4);
            System.out.println("numberOfDeletedRows : " + numberOfAffectedRows);

            //print all data
            rs = st.executeQuery(query2);
            while(rs.next()){
                int col1 = rs.getInt(1);
                String col2 = rs.getString(2);
                System.out.println(col1 + " " +  col2);

            }
            st.close();
            con.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
