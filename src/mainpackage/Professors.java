package mainpackage;

import java.util.List;

class Professors extends Users {

	public Courses mathimatos;

	public Professors(String name, String surname, String username, String department, Courses mathimatos) {
		super(name, surname, username, department);
		this.mathimatos = mathimatos;
	}

	public void Show_professor() {
		System.out.println("O Καθηγητής είναι ο  " + getName());
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

	

}
