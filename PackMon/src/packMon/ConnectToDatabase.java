package packMon;

import java.sql.*;
import java.util.Random;

/*
 * Connection class that allows program to connect to the database
 */
public class ConnectToDatabase {
	
	private Connection con;
	
	/**
	 * Connect to the database
	 */
	public void connect() {
		String url = "jdbc:mysql://localhost:3306/packmon";
		String userName = "root";
		String pass = "cs380";
		
		try {
			con = DriverManager.getConnection(url, userName, pass);
			System.out.println("Connected to database");
		} catch(Exception e) {
			System.out.println("Could not connect to database: " + e.getMessage());
		}
	}
	
	/**
	 * Retrieve method that retrieves a random monster from the database
	 * @throws SQLException 
	 */
	public Monster retrieveMonster() throws SQLException {
		Random rand = new Random();
		int id = rand.nextInt(4) + 1; // Selecting one of four monsters to fight
		ConnectToDatabase ctd = new ConnectToDatabase();
		ctd.connect();
		String query = "SELECT * FROM monster WHERE monsterID = " + id;
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery(query);
		return new Monster(result.getString("monsterName"), result.getInt("monsterVal"), result.getInt("monsterID"), result.getString("attackName"), result.getInt("attackPower"), result.getInt("monsterHP"));
		
	}
}
