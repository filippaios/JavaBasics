package mainpackage;
//ΔΗΜΙΟΥΡΓΙΑ ΚΛΑΣΗΣ USERS ΓΙΑ ΕΡΩΤΗΜΑ 2,1
public class Users {
//ΧΑΡΑΚΤΗΡΙΣΤΙΚΑ ΓΙΑ ΕΡΩΤΗΜΑ 2.1.1	
	private String name;
	private String surname;
	private String username;
	private String department;
	static int usersCounter=0;

	public Users(String name2, String surname2, String username2, String department2) {
		//CONSTUCTOR ΓΙΑ ΕΡΩΤΗΜΑ 2.1.3
		this.name=name2;
		this.surname=surname2;
		this.username=username2;
		this.department=department2;
		this.usersCounter++;
		
	}
	

	void Show_User() {
		System.out.println("O Χρήστης είναι ο  "+ " " + name + "  "+ surname + "  "+
	username + "Στο τμήμα"+" "+ department);
	}
	
	
	//ΜΕΘΟΔΟΙ GETTERS + SETTERS 2.1.2
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public static int getUsersCounter() {
		return usersCounter;
	}

	public static void setUsersCounter(int usersCounter) {
		Users.usersCounter = usersCounter;
	}

}
