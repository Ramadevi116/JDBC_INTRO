import java.sql.*;
class JDBC{
    public static void main(String[] args) {
        String Driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/school";
        String username="root";
        String password="sql834";
	try{
        Class.forName(Driver);
    	Connection con=DriverManager.getConnection(url,username,password);
    	Statement stmt=con.createStatement();
    	ResultSet res=stmt.executeQuery("select * from student");
	while(res.next()){
		System.out.print(res.getInt(1)+" "+res.getString(2));
		System.out.println();
	}
	    con.close();
    
	}
	catch(Exception e){
	System.out.println(e); 
	}
}
}