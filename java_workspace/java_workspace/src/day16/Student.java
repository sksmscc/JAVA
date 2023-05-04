package day16;

public class Student {
	private String studentName;
	private int studentscore;

	public Student() {}
	public Student(String studentName, int studentscore) {
		this.studentName = studentName;
		this.studentscore = studentscore;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentscore() {
		return studentscore;
	}

	public void setStudentscore(int studentscore) {
		this.studentscore = studentscore;
	}
	
	@Override
	public String toString() {
		return studentName+" : "+studentscore;
	}
	
	

}
