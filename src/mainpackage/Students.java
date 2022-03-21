package mainpackage;

 class Students extends Users {
//etos, show grade, show avg grade, courses: courseid,coursename,etos grades:student antikeimeno,course antikeimeno, vathmo int
	 //
	final int registrationNumber ;
	
	public Students(String name,String surname,String username,String department,int registrationNumber) {
		super(name,surname,username,department);
		this.registrationNumber=registrationNumber;
	}
	
	/*public void make_student()
	{
	System.out.println("Prosthiki Mathiti");
	}
	
	public void delete_student()
	{
	System.out.println("Diegrafh Mathiti");
	}*/

	public int getRegistrationNumber() {
		return registrationNumber;
	}

}
