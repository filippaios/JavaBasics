package mainpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//ΔΗΜΙΟΥΡΓΙΑ ΚΛΑΣΗΣ ΓΙΑ ΤΗΝ ΓΡΑΜΜΑΤΕΙΑ ΓΙΑ ΕΡΩΤΗΜΑ 5
class Secretaries extends Users {

	Scanner input = new Scanner(System.in);

	public Secretaries(String name, String surname, String username, String department) {
		super(name, surname, username, department);
	}

	public void Show_Grammateia() {
		System.out.println("O/Η ΓΡΑΜΜΑΤΕΑΣ είναι ο/η " +" " + getName()+" " + "Με επίθετο"+" "
				+ getSurname()+" " +"Στο τμήμα"+" " + getDepartment());
	}
//ΜΕΘΟΔΟΣ ΓΙΑ ΝΑ ΒΡΙΣΚΕΙ ΜΑΘΗΜΑ ΑΠΟ ΜΙΑ ΛΙΣΤΑ ΜΑΘΗΜΑΤΩΝ
	public Courses findUsingEnhancedForLoop(String mathima_kathigiti, List<Courses> courseList) {

		for (Courses cours : courseList) {
			if (cours.getCoursename().equals(mathima_kathigiti)) {
				return cours;
			}
		}
		return null;
	}

	public List<Professors> Dimiourgia_kathigith(List<Professors> professorList, List<Courses> courseList) {
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

			Courses mathima = findUsingEnhancedForLoop(mathima_kathigiti, courseList);

			Professors kathigiths = new Professors(name_kathigiti, surname_kathigiti, username_kathigiti,
					department_kathigiti, mathima);
			professorList.add(kathigiths);

		} catch (Exception e) {
			System.out.println("General Exception occurred" + e);
		}
		return professorList;

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public List<Students> Dimiourgia_foithth(List<Students> lista_student) {
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
			lista_student.add(foithths);

		} catch (Exception e) {
			System.out.println("General Exception occurred" + e);
		}
		return lista_student;
	}

	public List<Courses> Dimiourgia_mathimatos(List<Courses> lista_mathimatwn) {
		try {

			System.out.println("Δώστε τον Κωδικό του Μαθήματος: ");
			String course_id = input.nextLine();
			if (course_id.matches("^[0-9]*$")) {
			} else {
				throw new Exception("o κωδικός δεν είναι σωστός");
			}

			System.out.println("Δώστε το όνομα του Μαθήματος: ");
			String onoma_mathimatos = input.nextLine();
			if (onoma_mathimatos.matches("^[α-ωΑ-Ωa-zA-Z]*$")) {

			} else {
				throw new Exception("το όνομα  δεν είναι σωστό");
			}

			System.out.println("Δώστε το έτος του Μαθήματος: ");
			String etos_mathimatos = input.nextLine();
			if (etos_mathimatos.matches("^[0-9]*$")) {
			} else {
				throw new Exception("το έτος δεν είναι σωστό");
			}

			Courses neo_mathima = new Courses(Integer.parseInt(course_id), onoma_mathimatos,
					Integer.parseInt(etos_mathimatos));
			lista_mathimatwn.add(neo_mathima);

		} catch (Exception e) {
			System.out.println("General Exception occurred" + e);
		}
		return lista_mathimatwn;

	}

	// 10.1.2
	public void Anathesh_mathimatos(List<Professors> professorList, List<Courses> courseList) {
		System.out.println("Εδώ θα γινεται η ανάθεση μαθήματος");
		// sunarthsh gia anathesi mathimatwn
		// mesw enos for kai katalilhs anazhths stis listes tha ginetai h anathesi
	}
	// 10.1.3
	public void vathmologish_foititwn(List<Students> lista_student,List<Grades> lista_vathmwn) {
		System.out.println("Εδώ θα γινεται η βαθμολογιση φοιτητών");
		// sunarthsh gia vathmologish foithtwn
		// pairnei thn lista kai kanei tis katalliles anatheseis

	}

}
