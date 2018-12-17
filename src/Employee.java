import java.sql.Date;
/**
 * FOLLOW THE COMMENTS CAREFULLY TO COMPLETE THIS FILE 
 * 
 * Employee class containing fields which directly relate to column in the Employees table in MySQL database 
 * 
 * @author Alex Cronin
 *
 */
public class Employee {

	// private fields to store data
	private int emp_no;			
	private Date birth_date;
	private String first_name;
	private String last_name;
	private String gender;
	private Date hire_date;

	/**
	 * Constructor
	 * @param emp_no
	 * @param birth_date
	 * @param first_name
	 * @param last_name
	 * @param gender
	 * @param hire_date
	 */
	//provide the correct arguments to the constructor and assign the parameter values to the appropriate instance variables
	public Employee() {
		super();

	}

	/**
	 * 
	 * @param emp_no
	 * @param birth_date
	 * @param first_name
	 * @param last_name
	 * @param gender
	 * @param hire_date
	 */
	public Employee(int emp_no, Date birth_date, String first_name, String last_name, String gender, Date hire_date) {
		super();
		this.emp_no = emp_no;
		this.birth_date = birth_date;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.hire_date = hire_date;
	}

	/**
	 * 
	 * @return
	 */
	public int getEmp_no() {
		return emp_no;
	}

	/**
	 * 
	 * @param emp_no
	 */
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	// TODO add getter and setter methods for all fields of the class

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}


	// TODO expand this to string method to convert an instance of this class into a meaningful string
	// so that it can be printed later
	/**
	 * 
	 */
	public String toString(){
		return "Emp_no:"+this.emp_no;
	} 
	
	/**
	 * Main method to test the class to ensure that the getters, setters and toString methods work
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e = new Employee(10, java.sql.Date.valueOf("2000-01-01"), "FirstName", "LastName", "M", java.sql.Date.valueOf("2001-01-01"));
		System.out.println(e);
	}





}
