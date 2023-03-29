package UniProjectAPI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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
			System.out.println("\n1. Initialize database");
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

			switch (choice) {
			case 1:
				System.out.println("Initializing database...");
				initializeDatabase();

				break;
			case 2:
				System.out.println("Fetching data from API...");
				fetchDataFromAPI();

				break;
			case 3:
				System.out.println("Fetching data from database...");
				fetchDataFromDatabase();

				break;
			case 4:
				System.out.println("Printing universities...");
				printUniversities();

				break;
			case 5:
				System.out.println("Searching universities By Country...");
				SearchUniversitiesByCountry();

				break;
			case 6:
				System.out.println("Backing up database...");
				BackupDatabase();

				break;
			case 7:
				System.out.println("Removing tables from database...");
				RemoveTablesFromDatabase();

				break;
			case 8:
				System.out.println("Dumping data to file...");
				DumpDataToFile();

				break;
			case 9:
				System.out.println("Retrieving data from file...");
				RetrieveDataFromFile();

				break;
			case 10:
				System.out.println("Exiting program...");
				running = false;
				break;
			default:
				System.out.println("Invalid choice, please try again.");
				break;
			}
		}

		scanner.close();

	}

	// Helper methods for each menu option

	private static void initializeDatabase() {

		try {
			String dbName = "universityDB";
			String url = "jdbc:sqlserver://localhost:1433;" + "databaseName=" + dbName + ";" + "encrypt=true;"
					+ "trustServerCertificate=true";

			String userID = "sa";
			String passID = "root";

			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			DriverManager.registerDriver(driver);

			Connection connection = DriverManager.getConnection(url, userID, passID);
			Statement statement = connection.createStatement();

			String createUniversityTable = "CREATE TABLE  University (state_province VARCHAR(255), Name VARCHAR(255), Country VARCHAR(255), "
					+ "AlphaTwoCode VARCHAR(2), Domains VARCHAR(255), WebPages VARCHAR(255))";
			statement.executeUpdate(createUniversityTable);

			String createCountriesTable = "CREATE TABLE countries (Name VARCHAR(255), AlphaTwoCode VARCHAR(2))";
			statement.executeUpdate(createCountriesTable);

			System.out.println("\nDatabase initialization completed.");
		} catch (Exception ex) {
			System.err.println(ex);
		}

	}

	private static void fetchDataFromAPI() {
		
		try {
			// Create a URL object for the API endpoint
			URL url = new URL("http://universities.hipolabs.com/search?country=Oman");

			// Open a connection to the API endpoint
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");

			// Read the response from the API endpoint
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			// Print the response from the API endpoint
			System.out.println(response.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void fetchDataFromDatabase() {

	}

	private static void printUniversities() {

	}

	private static void SearchUniversitiesByCountry() {

	}

	private static void BackupDatabase() {

	}

	private static void RemoveTablesFromDatabase() {

	}

	private static void DumpDataToFile() {

	}

	private static void RetrieveDataFromFile() {

	}

}
