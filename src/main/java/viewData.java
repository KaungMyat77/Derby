import java.sql.*;

public class viewData {
    static Statement stmt;
    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:derby:D:/NetBean8.2/Derby_DB";
        Connection con = DriverManager.getConnection(URL);
        stmt = con.createStatement();
        selectStar();
        selectStar2();
        selectInd();


    }
    static void selectStar() throws SQLException {
        String query = "SELECT * FROM Employees";
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()) {
            System.out.println(rs.getString("uName"));
        }
        System.out.println("------------            Finish           --------------");

    }
   static void selectStar2() throws SQLException {
        String query = "SELECT * FROM Employees";
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getString("Id"));
            System.out.println(rs.getString("uName"));
            System.out.println(rs.getString("Phno"));
            System.out.println(rs.getString("Age"));
            System.out.println(rs.getString("Address"));
            System.out.println("-----------------------------------------------------------------------");
        }
       System.out.println("------------            Finish           --------------");

   }
    static void selectInd() throws SQLException {
        String query = "SELECT Id,UName,Phno,Address FROM Employees";
        String query1 = "SELECT UName,Phno FROM Employees";
        ResultSet rs = stmt.executeQuery(query1);
        while (rs.next()) {
//            System.out.println(rs.getString("Id"));
            System.out.println(rs.getString("uName"));
            System.out.println(rs.getString("Phno"));
//            System.out.println(rs.getString("Age"));
//            System.out.println(rs.getString("Address"));
            System.out.println("-----------------------------------------------------------------------");
        }
        System.out.println("------------            Finish           --------------");

    }
}
