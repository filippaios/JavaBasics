package mainpackage;

  class Secretaries extends Users {

	public Secretaries(String name,String surname,String username,String department) {
		super(name,surname,username,department);
	}
	
	
	public void Show_Grammateia() {
		System.out.println("Εδώ ειναι λειτουργίες της Γραμματείας  " );
	}

}
