package com.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MySqlDB {
	/*
	static Connection connection = null;
	static Statement statement = null;
	static WebDriver driver;
			
	@BeforeMethod
	public void initialise() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/demo";
		String userName = "root";
		String password = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(url, userName, password);
		statement = connection.createStatement();
		if(connection != null) {
			System.out.println("Connection created");
		}
		
		System.out.println("Initialisation done");
	}
	
	@Test
	public void testA() throws ClassNotFoundException, SQLException, InterruptedException {
		String user = "User1";
		ResultSet rs = statement.executeQuery("select * from loginCredentials where user='" + user + "'");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String userName = rs.getString("userName");
		String password = rs.getString("password");
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		new Actions(driver).scrollByAmount(0, 100);
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[value='Login']")).click();
	
	}
	
	
	public void closure() throws SQLException {
		driver.close();
		statement.close();
		connection.close();
		System.out.println("Resources released");
	}
*/	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306";
		String userName = "root";
		String password = "root";
		String user = "User1";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, userName, password);
		Statement statement = connection.createStatement();
		statement.execute("use demo;");
		ResultSet rs = statement.executeQuery("select * from logincredentials where user='" + user + "'");
		
		if(connection != null) {
			System.out.println("Connection created");
		}
		
		while(rs.next()) {
			String uName = rs.getString("userName");
			String uPass = rs.getString("password");
		}
		
	}

}
