package by.htp.task03.main;

public class Group {
	
	private Student[] students;
	private int Groupstudent;
	
	
	public Group(int number){
		
		students = new Student [number];
		Groupstudent = 0;
	}
	
	public boolean add (Student newStudent) {
		
		if(Groupstudent >= students.length) {
			return false;
		}
		
		students[Groupstudent] = newStudent;
		Groupstudent++;
		
		return true;

	}
	
	public void setstudents(Student[] students) {
		
		this.students = students;
	}
	
	public Student[] getstudents() {
		
		return students;
		
	}

}
