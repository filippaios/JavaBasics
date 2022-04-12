package mainpackage;

import java.util.List;

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
	// 10.2.1
	public void emfanish_vathmologias(List<Professors> professorList, List<Courses> courseList) {

		// sunarthsh gia na vlepoun oi foitites tis vatmologies
		System.out.println("Εδω οι φοιτητες θα βλεπουν τις βαθμολογιεσ τους  " );
		
	}
}
