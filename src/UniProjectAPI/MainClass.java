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
		
	}
	
	private static void fetchDataFromAPI() {
	    
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
