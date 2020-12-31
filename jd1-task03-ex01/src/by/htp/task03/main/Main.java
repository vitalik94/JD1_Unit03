package by.htp.task03.main;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Grouplogic grl = new Grouplogic();
		
		Group gr = new Group(10);
		
		gr.add(new Student("Иванов А.Н.",10, new int[] {9,9,9,10,9}));
		gr.add(new Student("Игорев Р.К.",1, new int[] {1,2,9,8,4}));
		gr.add(new Student("Петров И.В.",9, new int[] {7,5,8,3,5}));
		gr.add(new Student("Романов Л.К.",10, new int[] {10,9,10,9,9}));
		gr.add(new Student("Киселев Н.Э.",4, new int[] {2,7,3,5,2}));
		gr.add(new Student("Жук Г.Е.",5, new int[] {6,9,3,5,7}));
		gr.add(new Student("Кот А.С.",9, new int[] {4,9,7,10,3}));
		gr.add(new Student("Мышь Т.Ж.",8, new int[] {2,7,5,9,8}));
		gr.add(new Student("Пес М.Ю.",7, new int[] {1,2,4,5,7}));
		gr.add(new Student("Конь Б.А.",9, new int[] {9,10,9,10,10}));
		
		List<Student> topSt;
		topSt = grl.topStudents(gr);
		
		printTopStudent(topSt);
		
	}
	
	public static void printTopStudent(List<Student> topSt) {
		
		for(Student st : topSt) {
			
			System.out.print(st.getsurname() + ", " + st.getgroupnumber() +": ");
			
			for(int i = 0 ; i < st.getprogres().length;++i) {
				
				System.out.print(st.getprogres()[i] + ", ");
				
			}
			System.out.println();
		}
		
	}

}
