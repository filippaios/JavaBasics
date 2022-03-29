package mainpackage;

  class Professors extends Users {

	public String mathimatos ;
	
	public Professors(String name,String surname,String username,String department, String mathimatos) {
		super(name,surname,username,department);
		this.mathimatos=mathimatos;
	}
	
	public void Show_professor() {
		System.out.println("O Καθηγητής είναι ο  " + getName() );
	}
	
	public void Show_mathima() {
		System.out.println("Διδάσκει  " + mathimatos );
	}

	public String getMathimatos() {
		return mathimatos;
	}

	public void setMathimatos(String mathimatos) {
		this.mathimatos = mathimatos;
	}

}
