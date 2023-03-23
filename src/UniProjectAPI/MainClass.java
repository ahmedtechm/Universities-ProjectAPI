package UniProjectAPI;

import java.sql.Connection;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
		String url = "jdbc:sqlserver://localhost:1433;" + "databaseName=universityDB;" + "encrypt=true;"
				+ "trustServerCertificate=true";

		String userID = "sa";
		String passID = "root";

		System.out.println("Connecting to University database...");

		boolean loggedIn = true;
		while (loggedIn) {
			System.out.println("\nEnter User ID: ");
			userID = scanner.nextLine();
			System.out.println("Enter User password: ");
			passID = scanner.nextLine();

			if (userID.equals("sa") && passID.equals("root")) {
				loggedIn = false;
			} else {
				System.out.println("Wrong username or password");
			}
		}

		Connection connection = null;

		
		 boolean running = true;

	        while (running) {
	            System.out.println("\nPlease choose an option:");
	            System.out.println("1. Initialize database");
	            System.out.println("2. Fetch data from API");
	            System.out.println("3. Fetch data from database");
	            System.out.println("4. Print universities");
	            System.out.println("5. Search universities By Country");
	            System.out.println("6. Backup database");
	            System.out.println("7. Remove tables from database");
	            System.out.println("8. Dump data to file");
	            System.out.println("9. Retrieve data from file");
	            System.out.println("10. Exit program");
				System.out.print("\nEnter your choice: ");

				int choice = scanner.nextInt();


	}}

}
