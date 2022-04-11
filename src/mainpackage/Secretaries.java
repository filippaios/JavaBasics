package mainpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Secretaries extends Users {
	  
	  Scanner input = new Scanner(System.in);

	public Secretaries(String name,String surname,String username,String department) {
		super(name,surname,username,department);
	}
	
	
	public void Show_Grammateia() {
		System.out.println("Εδώ ειναι λειτουργίες της Γραμματείας  " );
	}
	
	public void Dimiourgia_kathigith( List<Professors> lista_kathigitwn) {
		try {
		System.out.println("Δώστε το όνομα του Καθηγητή: ");
		String name_kathigiti = input.nextLine();
		if (name_kathigiti.matches("^[α-ωΑ-Ωa-zA-Z]*$")) {

		} else {
			throw new Exception("το όνομα δεν είναι σωστό");
		}

		System.out.println("Δώστε το επίθετο του Καθηγητή ");
		String surname_kathigiti = input.nextLine();
		if (surname_kathigiti.matches("^[α-ωΑ-Ωa-zA-Z]*$")) {

		} else {
			throw new Exception("το επίθετο δεν είναι σωστό");
		}

		System.out.println("Δώστε το username του Καθηγητή: ");
		String username_kathigiti = input.nextLine();
		if (username_kathigiti.matches("^[α-ωΑ-Ωa-zA-Z]*$")) {

		} else {
			throw new Exception("το username δεν είναι σωστό");
		}

		System.out.println("Δώστε το τμήma που διδάσκει: ");
		String department_kathigiti = input.nextLine();
		if (department_kathigiti.matches("^[α-ωΑ-Ωa-zA-Z]*$")) {
		} else {
			throw new Exception("το τμήμα  δεν είναι σωστό");
		}		
		System.out.println("Δώστε το μάθημα που διδάσκει: ");
		String mathima_kathigiti = input.nextLine();
		if (department_kathigiti.matches("^[α-ωΑ-Ωa-zA-Z]*$")) {
		} else {
			throw new Exception("το μάθημα  δεν είναι σωστό");
		}	
		Professors kathigiths = new Professors(name_kathigiti, surname_kathigiti, username_kathigiti, department_kathigiti,department_kathigiti);
		lista_kathigitwn.add(kathigiths);		
		

	} catch (Exception e) {
		System.out.println("General Exception occurred" + e);
	} 
		
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void Dimiourgia_foithth( List<Students> lista_foithtwn) {
		try {

			System.out.println("Δώστε το όνομα του Φοιτητή: ");
			String names_student = input.nextLine();
			if (names_student.matches("^[α-ωΑ-Ωa-zA-Z]*$")) {

			} else {
				throw new Exception("το όνομα δεν είναι σωστό");
			}

			System.out.println("Δώστε το επίθετο του Φοιτητή ");
			String surname_student = input.nextLine();
			if (surname_student.matches("^[α-ωΑ-Ωa-zA-Z]*$")) {

			} else {
				throw new Exception("το επίθετο δεν είναι σωστό");
			}

			System.out.println("Δώστε το username του Φοιτητή: ");
			String username_student = input.nextLine();
			if (username_student.matches("^[α-ωΑ-Ωa-zA-Z]*$")) {

			} else {
				throw new Exception("το username δεν είναι σωστό");
			}

			System.out.println("Δώστε το τμήma που φοιτεί: ");
			String department_student = input.nextLine();
			if (department_student.matches("^[α-ωΑ-Ωa-zA-Z]*$")) {

			} else {
				throw new Exception("το τμήμα  δεν είναι σωστό");
			}
			System.out.println("Δώστε το registration number: ");
			String registrationNumber = input.nextLine();
			if (registrationNumber.matches("^[0-9]*$")) {

			} else {
				throw new Exception("Ο Αριθμός Μητρώου δεν είναι σωστός");
			}

			Students foithths = new Students(names_student, surname_student, username_student, department_student,
					Integer.parseInt(registrationNumber));			
			lista_foithtwn.add(foithths);

		} catch (Exception e) {
			System.out.println("General Exception occurred" + e);
		} finally {
			System.out.println("H Εγγραφή του Φοιτητή τελείωσε!");
		}
	}

	

	
}
