package mainpackage;
//дглиоуяциа йкасгс бахлым циа еяытгсг 6
public class Grades {
	//ваяайтгяистийа йкасгс
	Students foitiths ;
	Courses mathima ;
	int vathmos; 

	public Grades(Students foitiths , Courses mathima , int vathmos) {
		this.foitiths = foitiths;
		this.mathima = mathima;
		this.vathmos = vathmos;
	}
	//леходос циа елжамисг бахлоу
	void Show_grade(Students foitiths , Courses mathima , int vathmos) {
		System.out.println("Oi vathmoi tou" + foitiths + "gia to mathima" + mathima.getCoursename() + "einai" + vathmos);
	}
	
	// GETTERS + SETTERS ваяайтгяистийым
	public Students getFoitiths() {
		return foitiths;
	}

	public void setFoitiths(Students foitiths) {
		this.foitiths = foitiths;
	}

	public Courses getMathima() {
		return mathima;
	}

	public void setMathima(Courses mathima) {
		this.mathima = mathima;
	}

	public int getVathmos() {
		return vathmos;
	}

	public void setVathmos(int vathmos) {
		this.vathmos = vathmos;
	}
	
	

}
