package mainpackage;

import java.util.List;
//ΔΗΜΙΟΥΡΓΙΑ ΚΛΑΣΗΣ ΓΙΑ ΕΡΩΤΗΜΑ 3
class Students extends Users {

	//ΕΡΩΤΗΜΑ 3.1. ΕΙΝΑΙ FINAL ΔΙΟΤΙ ΔΕΝ ΘΑ ΑΛΛΑΖΕΙ ΠΟΤΕ
	final int registrationNumber ;
	
	public Students(String name,String surname,String username,String department,int registrationNumber) {
		//ΕΡΩΤΗΜΑ 3.2 CONSTRUCTOR
		super(name,surname,username,department);
		this.registrationNumber=registrationNumber;
	}
	
	//ΕΡΩΤΗΜΑ 3.3. ΜΕΘΟΔΟΣ ΓΙΑ ΝΑ ΕΜΦΑΝΙΖΟΝΤΑΙ ΟΙ ΦΟΙΤΗΤΕΣ
	public void Show_student() {
		System.out.println("O Φοιτητής είναι ο  "+" " + getName() +" "+ "Με επίθετο"+" "
				+ getSurname() +"Στο τμήμα"+" " + getDepartment());
	}
	
	public void Show_mitrwo() {
		System.out.println("Αριθμός Μητρώου  " + registrationNumber );
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}
	
	
	//ΕΡΩΤΗΜΑ 10.2.1
	public void emfanish_vathmologias(List<Students> studentList, List<Grades> lista_vathmwn) {

		// sunarthsh gia na vlepoun oi foitites tis vatmologies
		System.out.println("Εδω οι φοιτητες θα βλεπουν τις βαθμολογιεσ τους  " );
		
	}
}
