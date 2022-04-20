package mainpackage;

import java.util.List;
//ΔΗΜΙΟΥΡΓΙΑ ΚΛΑΣΗΣ ΕΡΩΤΗΜΑ 4
class Professors extends Users {
	//ΧΑΡΑΚΤΗΡΙΣΤΙΚΟ ΚΛΑΣΗΣ COURSES ΓΙΑ ΝΑ ΔΗΛΩΝΕΙ ΣΕ ΠΟΙΟ/Α ΜΑΘΗΜΑΤΑ ΕΙΝΑΙ Ο ΚΑΘΗΓΗΤΗΣ
	public Courses mathimatos;

	public Professors(String name, String surname, String username, String department, Courses mathimatos) {
		//CONSTRUCTOR
		super(name, surname, username, department);
		this.mathimatos = mathimatos;
	}
	// ΜΕΘΟΔΟΣ ΓΙΑ ΕΜΦΑΝΙΣΗ ΚΑΘΗΓΗΤΗ
	public void Show_professor() {
		System.out.println("O Καθηγητής είναι ο  "+" " + getName()+" " + "Με επίθετο"+" "
				+ getSurname()+" " +"Στο τμήμα"+" " + getDepartment());
	}

	public void Show_mathima() {
		System.out.println("Διδάσκει  " + mathimatos);
	}

	public Courses getMathimatos() {
		return mathimatos;
	}

	public void setMathimatos(Courses mathimatos) {
		this.mathimatos = mathimatos;
	}

	// 10.3.1
	public void emfanish_vathmologias(List<Students> lista_student, List<Courses> courseList) {

		// sunarthsh gia na vathmologei o kathigiths
		System.out.println("Εδω ο καθηγητης θα βαθμολογει τα μαθηματα που του εχουν ανατεθει");

	}
	
	// 10.3.2
		public void emfanish_vathmou_gia_mathima(List<Students> lista_student, List<Courses> courseList) {

			// μέθοδος που προοριζεται για να γινεται εμφανιση βαθμων μονο οσως μαθηματων διδάσκει ο εκαστοτε καθηγητής
			System.out.println("μέθοδος που προοριζεται για να γινεται εμφανιση βαθμων μονο οσως μαθηματων διδάσκει ο εκαστοτε καθηγητής");

		}

	

}
