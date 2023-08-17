package Vtiger.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class FetchDataFromMysql {

	public static void main(String[] args) throws Throwable {
		// step 1- Register driver
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);

		// step 2- connection to database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysystem", "root", 
				"@72Vikas72");

		// step 3- create mysql statement
		Statement stat = conn.createStatement();
		String query = "select*from vikas";

		// step 4- Execute query
		ResultSet result = stat.executeQuery(query);
		while (result.next()) {
			System.out.println(result.getInt(1) + "\t" + result.getString(2) + "\t" + result.getString(3) + "\t"
					+ result.getString(4));
		}

		// step 5- close the database connection
		conn.close();

	}

}
