package by.htp.task03.main;

/* 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
 *  успеваемость (массив из пяти  элементов). Создайте массив  из  десяти  элементов  такого  типа.
 *  Добавьте  возможность  вывода фамилий  и номеров групп студентов, имеющих оценки, 
 *  равные только 9 или 10.
 */

public class Student {
	
	private String surname;
	private int groupnumber;
	private int [] progres ;
	
	
	public Student() {
		
	}
	
	public Student(String surname, int groupnumber, int [] progres) {
		
		this.surname = surname;
		this.groupnumber = groupnumber;
		this.progres = progres;
		
	}
	
	public void setsurname(String surname) {
		
		this.surname = surname;
		
	}
	
	public void setgroupnumber(int groupnumber) {
		
		this.groupnumber = groupnumber;
		
	}
	
	public void setprogres(int [] progres) {
		
		this.progres = progres;
		
	}
	
	public String getsurname() {
		
		return surname;
		
	}
	
	public int getgroupnumber() {
		
		return groupnumber;
		
	}
	
	public int [] getprogres() {
		
		return progres;
		
	}
	
}
