package mainpackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class CreateUsers {
	
	

	public static void main(String[] args) {
		
		 List<Users> userList = new ArrayList<Users>();		
		 List<Students> studentList = new ArrayList<Students>();
		 List<Secretaries> secretariesList = new ArrayList<Secretaries>();
		 List<Professors> professorList = new ArrayList<Professors>();
		 List<Grades> gradeList = new ArrayList<Grades>();
		 List<Courses> coursesList = new ArrayList<Courses>(); 
		 

		// USER
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
			userList.add(xrhsths);
			System.out.println("Ο Χρήστης είναι ο " + xrhsths.getName() + "" + xrhsths.getSurname() + "Και ειναι στο"
					+ xrhsths.getDepartment() + "τμήμα");

		} catch (Exception e) {
			System.out.println("General Exception occurred" + e);
		} finally {
			System.out.println("H Εγγραφή του Χρήστη τελείωσε!");
		}

		// STUDENT
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
			foithths.Show_User();
			studentList.add(foithths);

		} catch (Exception e) {
			System.out.println("General Exception occurred" + e);
		} finally {
			System.out.println("H Εγγραφή του Φοιτητή τελείωσε!");
		}
		
		//Courses
		 Courses agglika = new Courses(0, "agglika", 3);
		coursesList.add(agglika);

		// PROFESSOR
		Professors kathigitis = new Professors("Γιώργος", "Φιλιππαίος", "filippaios", "Πληροφορικής", agglika);
		professorList.add(kathigitis);
		
		// Secreteries.
		Secretaries grammateia = new Secretaries("Κική", "Βουγιουκλάκη", "kiki", "Πληροφορικής");
		secretariesList.add(grammateia);
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// 9.1, 9.2
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
		//10.0
		
		grammateia.Dimiourgia_kathigith(professorList,coursesList);
		grammateia.Dimiourgia_foithth(studentList);
		
		
		

	}

}
