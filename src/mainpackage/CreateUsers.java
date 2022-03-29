package mainpackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CreateUsers {

	public static void main(String[] args) {

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
			xrhsths.Show_User();

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

		} catch (Exception e) {
			System.out.println("General Exception occurred" + e);
		} finally {
			System.out.println("H Εγγραφή του Φοιτητή τελείωσε!");
		}

		//PROFESSOR
		Professors kathigitis = new Professors ("Γιώργος", "Φιλιππαίος", "filippaios", "Πληροφορικής", "java");
		//Secreteries.
		Secretaries grammateia = new Secretaries ("Κική", "Βουγιουκλάκη", "kiki", "Πληροφορικής");

	}

}
