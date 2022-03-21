package mainpackage;

  class Professors extends Users {

	public String mathimatos ;
	
	public Professors(String name,String surname,String username,String department, String mathimatos) {
		super(name,surname,username,department);
		this.mathimatos=mathimatos;
	}
	
	

	public String getMathimatos() {
		return mathimatos;
	}

	public void setMathimatos(String mathimatos) {
		this.mathimatos = mathimatos;
	}

}
