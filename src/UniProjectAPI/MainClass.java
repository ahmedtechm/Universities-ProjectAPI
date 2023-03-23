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

	}

}
