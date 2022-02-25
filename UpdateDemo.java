import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class UpdateDemo {
	public static void main(String args[]) {
		try {
//step1 load the driver class  
			Class.forName("org.postgresql.Driver");

//step2 create  the connection object  
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Test@123");

//step3 create the statement object  
			Statement stmt = con.createStatement();

//step4 execute query  
			stmt.executeUpdate("update account set username='Biru' where user_id=6");
			
				System.out.println("updated");

//step5 close the connection object  
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}