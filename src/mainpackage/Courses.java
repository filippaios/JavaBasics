package mainpackage;
//дглиоуяциа йкасгс циа еяытгла 6
public class Courses {
	//ваяайтгяистийа лахглатос
	private int courseid;
	private String coursename;
	private int etos ;
	
	
	public Courses(int courseid , String coursename , int etos ) {
		
		this.courseid = courseid ;
		this.coursename = coursename;
		this.etos = etos ;
	}
	
	//GETTERS + SETTERS
	public int getCourseid() {
		return courseid;
	}


	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}


	public String getCoursename() {
		return coursename;
	}


	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}


	public int getEtos() {
		return etos;
	}


	public void setEtos(int etos) {
		this.etos = etos;
	}


}
