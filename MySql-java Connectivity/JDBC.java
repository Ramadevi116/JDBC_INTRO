import java.sql.*;
class JDBC{
    public static void main(String[] args) throws Exception {
        String Driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/school";
        String username="root";
        String password="sql834";
        Class.forName(Driver);
    Connection con=DriverManager.getConnection(url,username,password);
    Statement stmt=con.createStatement();
    stmt.executeUpdate("insert into student values(1,'Ramadevi')");
    stmt.executeUpdate("insert into student values(2,'Jyothi')");
    stmt.executeUpdate("insert into student values(3,'Rupesh')");
    con.close();
    }
}