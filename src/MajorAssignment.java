

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Scanner;

import util.DBConnect;
/**
 * FOLLOW THE COMMENTS CAREFULLY TO COMPLETE THIS FILE
 * 
 * A user menu facilitates interaction with a MySQL schema by calling methods from this file 
 * which execute SQL procedures stored in a MYSQL schema. Connection to this is specified by the user.
 * Ensure that the correct name for the style of connection (setUpForLocalMySQL or setUpForKnuthMySQL) you are using is accessible (uncommented)
 * 
 * Common Errors
 * - "The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server."
 *    - Your MySQL server is not running
 *    - There is no MySQL server running on the port you have specified
 * 
 * @author Alex Cronin
 */
public class MajorAssignment {

	public static void main(String[] args) {
		System.out.println("MajorAssignment.java - starting main method\n");

		// Create a scanner to accept input from the user

		// Create a DBConnect object and open a  connection

		// Below are two options ( a and b) for how to access your MySQL . 
		// - Comment out the option you DO NOT want
		// - then fill in the appropriate values in the constructor
		// a) Use the option below if you are accessing MySQL on your local machine

		// b) Use the option below if you are accessing MySQL over an SSH connection

		// Open the connection - call the correct method on the correct object

		do {
			// Menu of the application
			System.out.println("\n===========================================================");
			System.out.println("USER MENU");
			System.out.println("Please select an option by typing the corresponding number.");
			System.out.println("0. Exit");				
			System.out.println("1. Display the count of the employees");
			System.out.println("2. Display records of all employees");
			System.out.println("3. Search for an employee by last name");
			System.out.println("4. Add a new employee");
			System.out.println("5. List all departments");				
			System.out.println("6. Get salary info");
			System.out.println("===========================================================");
			System.out.print("option> ");

			// Initialize a variable of the correct type called option to store the value entered by the user 

			/**
			 * When the user selects an option of 7 options are executed. 
			 * 		Option 0 and 1 specified. 
			 * 		You must specify options 2 to 6. 
			 * Each option will call a method below
			 * 		No method is required for option 0. 
			 * 		Method for option 1 is specified below. 
			 * 		You must specify methods of option 2 to 6. 
			 */
			// 0. exit the program 
			if (option == 0) {
				System.out.println("Exiting the program");
				break; //exit the while loop
			}

			// 1. displaying all employees
			else if (option == 1) {
				// Output the result of the getEmployeeCount method which is implemented after the main method
			
			}

			// 2. displaying all employees 
			else if (option == 2) {
			}

			// 3. search for an employee by name
			else if (option == 3) {
			}
			// 4. adding an employee
			else if (option == 4) {
				
			}
			// 5. Additional functionality 
			else if (option == 5) {
				System.out.println("Additional functionality not yet implemented.");
				// Call a method below to perform a task which accesses more than one table. 
				// You will have to write the code here to call the method below and also the code for the method below.
			}	
			// 6. Additional functionality 
			else if (option == 6) {
				System.out.println("Additional functionality not yet implemented.");
				// Call a method below to perform a task which accesses more than one table. 
				// You will have to write the code here to call the method below and also the code for the method below.
			}	

			// unknown option
			else {
				System.out.println("Invalid option.");
			}
		}while(true); //loop until option 0 is selected

		// Close the connection

		// Close the scanner

		System.out.println("MajorAssignment.java - ending main method\n");

	}

	/**
	 * THE FOLLOWING METHODS CALL SQL PROCEDURES STORED IN YOUR MYSQL SCHEMA AND 
	 * RETURNs THE RESULTS TO THE IF/ELSE BLOCKS ABOVE WHERE THEY WERE CALLED
	 * 
	 * Each method calls one or more stored SQL procedures from our MySQL schema 
	 * There is currently have one SQL procedure defined in the provided procedures.sql file 
	 * located in the data folder. 
	 * You will need to 
	 * 	- Create additional procedures in procedures.sql
	 * 	- Import them into your schema using Import.java
	 * 	- Write code in the if/else blocks above to call java methods below which in turn call procedures in your MySQL schema
	 * 	- All of these steps combined should enable you to have 7 options (0 to 6) on your user menu.
	 * Using option 1 as a template you must implement option 2 to 6. 
	 * 
	 * The general format of these methods is as follows
	 *  - give the method an appropriate access modifier, return type, name & parameters
	 *  - Create a string containing an SQL statement which calls a procedure
	 *  - Create a statement
	 *  - Create a results set by executing your statement on the MySQL schema
	 *  - Return the results set as a java primitive or object
	 *  - Close the statement
	 *  - Close the results set
	 */

	/**
	 * Option 0 - Exit the program. No method to call SQL required. 
	 */

	/**
	 * Option 1 - Display the count of the employees
	 * @param conn - the connection to the MySQL schema 
	 * @return count of employess
	 */
	public static int getEmployeeCount(Connection conn) {
		int num = -1;
		try {
			// Create the SQL query string which uses the  "getEmployeeCount" stored procedure in the employee 
			String sql = "CALL getEmployeeCount()";
			// Create a new SQL statement 
			Statement st = conn.createStatement();
			// Create a new results set which store the value returned by the  when the sql statement is executed 
			ResultSet rs = st.executeQuery(sql); 
			// While there are still elements in the results set
			while (rs.next()) 
				num = rs.getInt(1); // assign the next int in the results set to num
			rs.close(); // close the results set
			st.close(); // close the statement
		}
		catch (SQLException e) {
			System.out.println("Error in getEmployeeCount");
			e.printStackTrace();
		}
		return num;		
	}

	/**
	 * Option 2 - Display records of all the employees 
	 * @param conn - the connection to the MySQL schema 
	 */
	public static Employee[] getAllEmployeesDetails(Connection conn) {
		Employee [] empArray = new Employee[11];



		try {
			// Create the SQL query string which uses the  "getEmployeeCount" stored procedure in the employee 
			String sql = "CALL getEmployeeCount()";
			// Create a new SQL statement 
			Statement st = conn.createStatement();
			// Create a new results set which store the value returned by the  when the sql statement is executed 
			ResultSet rs = st.executeQuery(sql); 
			// While there are still elements in the results set
			int i=0;
			while (rs.next()) 
				empArray[i++] = new Employee(rs.getInt(), rs.getDate()) //TODO Expand this constructor call to take more arguements

			rs.close(); // close the results set
			st.close(); // close the statement
		}
		catch (SQLException e) {
			System.out.println("Error in getEmployeeCount");
			e.printStackTrace();
		}
	}

	/**
	 * Option 3 - Search for an employee by last name
	 * @param conn - the connection to the MySQL schema 
	 * @param lname - Last name provided
	 * @return
	 */
	public static Employee getEmployeeByLastName(Connection conn, String lname) {
	}

	/**
	 *  Option 4 - Add a new employee. This method need only alter the Employee table
	 * @param conn - the connection to the MySQL schema 
	 * @param emp - the employee to add
	 */
	public static void insertEmployee(Connection conn, Employee emp) {
		System.out.println("please enter employee number");
		s.nextInt();
	}
}
