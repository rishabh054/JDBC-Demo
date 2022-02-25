import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class InsertDemo {
	public static void main(String args[]) {
		try {
//step1 load the driver class  
			Class.forName("org.postgresql.Driver");

//step2 create  the connection object  
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Test@123");

//step3 create the statement object  
			Statement stmt = con.createStatement();

//step4 execute query  
			stmt.executeQuery("insert into account(user_id,username,password,email,created_date) \r\n"
					+ "values(7,'Biru','Ram','test1678gmail.com','2013-7-11') returning *;");
			
				System.out.println("Inserted");

//step5 close the connection object  
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}