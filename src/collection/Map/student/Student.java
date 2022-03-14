package collection.Map.student;

public class Student {
	
	public String Studentname;
	public int StudentRollno;
	public int Studentmarks;
	
	public Student(String studentname, int StudentRollno, int studentmarks) {
		this.Studentname = studentname;
		this.StudentRollno = StudentRollno;
		this.Studentmarks = studentmarks;
	}
	
	public Student() {}

	@Override
	public String toString() {
		return "Student [Studentname=" + Studentname + ", StudentRollno=" + StudentRollno + ", Studentmarks="
				+ Studentmarks + "]";
	}
	
	
}
