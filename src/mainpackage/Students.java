package mainpackage;

 class Students extends Users {

	
	final int registrationNumber ;
	
	public Students(String name,String surname,String username,String department,int registrationNumber) {
		super(name,surname,username,department);
		this.registrationNumber=registrationNumber;
	}
	
	public void Show_student() {
		System.out.println("O Φοιτητής είναι ο  " + getName() );
	}
	
	public void Show_mitrwo() {
		System.out.println("Αριθμός Μητρώου  " + registrationNumber );
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

}
