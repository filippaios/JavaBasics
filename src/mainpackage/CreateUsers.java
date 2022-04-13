package mainpackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
//ΔΗΜΙΟΥΡΓΙΑ ΚΛΑΣΗΣ ΓΙΑ ΕΡΩΤΗΜΑ 7,1
public class CreateUsers {
	
	

	public static void main(String[] args) {
		//ΛΙΣΤΕΣ ΜΕ ΑΝΤΙΚΕΙΜΕΝΑ
		 List<Users> lista_xrhstwn = new ArrayList<Users>();		
		 List<Students> lista_foititwn = new ArrayList<Students>();
		 List<Secretaries> lista_gramateias = new ArrayList<Secretaries>();
		 List<Professors> lista_kathigitwn = new ArrayList<Professors>();
		 List<Grades> lista_vathmwn = new ArrayList<Grades>();
		 List<Courses> lista_mathimatwn = new ArrayList<Courses>(); 
		 

		// ΔΗΜΙΟΥΡΓΙΑ USER ΜΕΣΩ ΜΕΣΩ SCANNER ΚΑΙ TRY-CATCH. ΕΡΩΤΗΜΑ 7.1
		Scanner input = new Scanner(System.in);
		try {

			System.out.println("Δώστε το όνομα του Χρήστη: ");
			String name = input.nextLine();
			if (name.matches("^[α-ωΑ-Ωa-zA-Z]*$")) {

			} else {
				throw new Exception("το όνομα δεν είναι σωστό");
			}

			System.out.println("Δώστε το επίθετο του Χρήστη ");
			String surname = input.nextLine();
			if (surname.matches("^[α-ωΑ-Ωa-zA-Z]*$")) {

			} else {
				throw new Exception("το επίθετο δεν είναι σωστό");
			}

			System.out.println("Δώστε το username του χρήστη : ");
			String username = input.nextLine();
			if (username.matches("^[α-ωΑ-Ωa-zA-Z]*$")) {

			} else {
				throw new Exception("το  username δεν είναι σωστό");
			}

			System.out.println("Δώστε το τμήμα που ανοίκει: ");
			String department = input.nextLine();
			if (department.matches("^[α-ωΑ-Ωa-zA-Z]*$")) {

			} else {
				throw new Exception("το τμήμα  δεν είναι σωστό");
			}

			Users xrhsths = new Users(name, surname, username, department);
			lista_xrhstwn.add(xrhsths);
			//ΕΜΦΑΝΙΣΗ ΧΡΗΣΤΗ ΓΙΑ ΕΡΩΤΗΜΑ 7.2
			xrhsths.Show_User();

		} catch (Exception e) {
			System.out.println("General Exception occurred" + e);
		} finally {
			System.out.println("H Εγγραφή του Χρήστη τελείωσε!");
		}

		// ΔΗΜΙΟΥΡΓΙΑ STUDENT ΜΕΣΩ ΜΕΣΩ SCANNER ΚΑΙ TRY-CATCH. ΕΡΩΤΗΜΑ 7.1
		//TRY-CATCH ΓΙΑ ΕΡΩΤΗΜΑ 8.1
		//ΜΕ ΤΙΣ ΜΕΘΟΔΟΥΣ SHOW ΤΗΣ ΕΚΑΣΤΟΤΕ ΚΛΑΣΗΣ ΓΙΝΕΤΑΙ ΕΜΦΑΝΙΣΗ ΤΩΝ ΧΑΡΑΚΤΗΡΙΣΤΙΚΩΝ
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
			//ΕΜΦΑΝΙΣΗ ΦΟΙΤΗΤΗ ΕΡΩΤΗΜΑ 7.2
		    foithths.Show_student();
			lista_foititwn.add(foithths); //ΠΡΟΣΘΗΚΗ ΦΟΙΤΗΤΗ ΣΤΗΝ ΛΙΣΤΑ ΦΟΙΤΗΤΩΝ
			
			foithths.emfanish_vathmologias(lista_foititwn, lista_vathmwn); //ΕΡΩΤΗΜΑ 10,2,1. ΕΜΦΑΝΙΣΗ ΒΑΘΜΟΛΟΓΙΩΝ

		} catch (Exception e) {
			System.out.println("General Exception occurred" + e);
		} finally {
			System.out.println("H Εγγραφή του Φοιτητή τελείωσε!");
		}
		
		//ΔΗΜΙΟΥΡΓΙΑ ΕΝΟΣ ΜΑΘΗΜΑΤΟΣ ΚΑΙ ΕΙΣΑΓΩΓΗ ΤΟΥ ΣΤΗΝ ΛΙΣΤΑ
		 Courses agglika = new Courses(0, "agglika", 3);
		lista_mathimatwn.add(agglika);

		// ΔΗΜΙΟΥΡΓΙΑ ΕΝΟΣ ΚΑΘΗΓΗΤΗ ΚΑΙ ΕΙΣΑΓΩΓΗ ΣΤΗΝ ΛΙΣΤΑ ΕΡΩΤΗΜΑ 7.1
		Professors kathigitis = new Professors("Γιώργος", "Φιλιππαίος", "filippaios", "Πληροφορικής", agglika);
		lista_kathigitwn.add(kathigitis);
		kathigitis.Show_professor(); //ΕΜΦΑΝΙΣΗ ΓΙΑ ΕΡΩΤΗΜΑ 7.2
		
		// ΔΗΜΙΟΥΡΓΙΑ ΕΝΟΣ ΓΡΑΜΜΑΤΕΆ ΚΑΙ ΕΙΣΑΓΩΓΗ ΣΤΗΝ ΛΙΣΤΑ ΕΡΩΤΗΜΑ 7.1
		Secretaries grammateia = new Secretaries("Κική", "Βουγιουκλάκη", "kiki", "Πληροφορικής");
		lista_gramateias.add(grammateia);
		grammateia.Show_Grammateia(); //ΕΜΦΑΝΙΣΗ ΓΙΑ ΕΡΩΤΗΜΑ 7.2
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//ΕΝΤΟΛΕΣ ΓΙΑ ΤΑ ΕΡΩΤΗΜΑΤΑ 9 ΚΑΘΩΣ ΚΑΙ TRY CATCH ΓΙΑ ΕΡΩΤΗΜΑ 9.3
		// 9.1, 9.2..
		try {
			FileInputStream fstream = new FileInputStream("/src/mainpackage/Student.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				String[] tokens = strLine.split("/");
				int number = Integer.parseInt(tokens[4]);

				if ((tokens[0].matches("^[α-ωΑ-Ωa-zA-Z]*$"))) {
				} else {
					throw new Exception("το όνομα δεν είναι σωστό");
				}
				if ((tokens[1].matches("^[α-ωΑ-Ωa-zA-Z]*$"))) {
				} else {
					throw new Exception("το επίθετο δεν είναι σωστό");
				}
				if ((tokens[2].matches("^[α-ωΑ-Ωa-zA-Z]*$"))) {
				} else {
					throw new Exception("το username δεν είναι σωστό");
				}
				if ((tokens[3].matches("^[α-ωΑ-Ωa-zA-Z]*$"))) {
				} else {
					throw new Exception("το Τμήμα δεν είναι σωστό");
				}
				if (tokens[4].matches("^[0-9]*$")) {

				} else {
					throw new Exception("Ο Αριθμός Μητρώου δεν είναι σωστός");
				}			
				

				Students record = new Students(tokens[0], tokens[1], tokens[2], tokens[3], number);
				System.out.println("H Εγγραφή του Φοιτητή τελείωσε!" + record.getRegistrationNumber());
			}
			in.close();
		} catch (Exception e) {
			System.err.println("Kάτι πήγε Λάθος: " + e.getMessage());
		}
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// ΕΝΤΟΛΕΣ ΓΙΑ ΕΡΩΤΗΜΑΤΑ ΣΤΗΝ ΠΑΡΑΓΡΑΦΟ 10.0
		
		grammateia.Dimiourgia_kathigith(lista_kathigitwn,lista_mathimatwn); //10.1.1
		grammateia.Dimiourgia_foithth(lista_foititwn);  //10,1,1
		grammateia.Dimiourgia_mathimatos(lista_mathimatwn); //10,1,1
		grammateia.Anathesh_mathimatos(lista_kathigitwn,lista_mathimatwn);  //10,1,2
		grammateia.vathmologish_foititwn(lista_foititwn,lista_vathmwn); //10,1,3
		
		kathigitis.emfanish_vathmologias(lista_foititwn, lista_mathimatwn); //10,3,1 
		
		

	}

}
