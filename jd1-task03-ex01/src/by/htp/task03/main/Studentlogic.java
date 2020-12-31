package by.htp.task03.main;

public class Studentlogic {
	
	public boolean topAStudent(Student st) {
		
		int[] progress;
		
		progress = st.getprogres();
		
		for(int progres : progress) {
			
			if(progres < 9) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}

}
