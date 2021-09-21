import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        String URL = "jdbc:derby:D:/NetBean8.2/Derby_DB";
        Connection con = DriverManager.getConnection(URL);
        Statement stmt = con.createStatement();
        String qry = "INSERT INTO Employees (uName,Phno,Age,Address) VALUES('Aung Aung','09458766784',30,'Korea')";
        stmt.execute(qry);
        System.out.println("Insert Data Succeful");
    }
}
