package by.htp.task03.main;

import java.util.ArrayList;
import java.util.List;

public class Grouplogic {
	
	private Studentlogic stl = new Studentlogic();
	
	public List<Student> topStudents(Group group){
		
		List<Student> result = new ArrayList<Student>();
		
		Student[] students = group.getstudents();
		
		for(Student st : students) {
			
			if(stl.topAStudent(st)) {
				
				result.add(st);
				
			}
		
		}
		
		return result;
		
	}

}
