package mainpackage;

  class Professors extends Users {

	public Courses mathimatos ;
	
	public Professors(String name,String surname,String username,String department, Courses mathimatos) {
		super(name,surname,username,department);
		this.mathimatos=mathimatos;
	}
	
	public void Show_professor() {
		System.out.println("O Καθηγητής είναι ο  " + getName() );
	}
	
	public void Show_mathima() {
		System.out.println("Διδάσκει  " + mathimatos );
	}

	public Courses getMathimatos() {
		return mathimatos;
	}

	public void setMathimatos(Courses mathimatos) {
		this.mathimatos = mathimatos;
	}

}
