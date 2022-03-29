package mainpackage;

public class Grades {
	
	Students foitiths ;
	Courses mathima ;
	int vathmos; 

	public Grades(Students foitiths , Courses mathima , int vathmos) {
		this.foitiths = foitiths;
		this.mathima = mathima;
		this.vathmos = vathmos;
	}
	
	void Show_grade(Students foitiths , Courses mathima , int vathmos) {
		System.out.println("Oi vathmoi tou" + foitiths + "gia to mathima" + mathima.getCoursename() + "einai" + vathmos);
	}

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
