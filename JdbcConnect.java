import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class JdbcConnect {
	public static void main(String args[]) {
		try {
//step1 load the driver class  
			Class.forName("org.postgresql.Driver");

//step2 create  the connection object  
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Test@123");

//step3 create the statement object  
			Statement stmt = con.createStatement();

//step4 execute query  
			ResultSet rs = stmt.executeQuery("select * from account");
			while (rs.next())
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

//step5 close the connection object  
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}