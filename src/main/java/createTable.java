import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createTable {
    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:derby:D:/NetBean8.2/Derby_DB";
//      String URL ="jdbc:derby:D:\\NetBean8.2\\DerbyDataBase;create=true";
        Connection con = DriverManager.getConnection(URL);

      Statement stmt = con.createStatement();
      String query="CREATE TABLE Employees("
              + "Id INT NOT NULL GENERATED ALWAYS AS IDENTITY(Start with 1, Increment by 1),"
              + "uName VARCHAR(30) NOT NULL,"
              + "Phno VARCHAR(11) NOT NULL,"
              + "Age INT,"
              + "Address VARCHAR(255) NOT NULL"
              + ")";
      String qry="DROP TABLE Employees";
//      String qry1 = "INSERT INTO Employees(uName,Phno,Age,Address) VALUES('KoKo',`09451236472`,12,'Myanmar')";
      stmt.execute(query);
        System.out.println("Table Created Succeful");
    }
}
