package Vtiger.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class InsertDataIntoTableInMysql {

	public static void main(String[] args) throws Throwable {
		//step 1- register driver
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		//step 2- connection to database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysystem","root","@72Vikas72");
		
		//step 3- insert into table
		Statement stat = conn.createStatement();
		 String query = "insert into vikas(first_name,last_name,address)values('sulochana','S T','kunabevu')";
		
		int result = stat.executeUpdate(query);
		
		if(result==1) {
			System.out.println("Data is added into the table");
		}else {
			System.out.println("Data in not added into the table");
		}
		
		//step 4- close the database
		conn.close();
	}

}
