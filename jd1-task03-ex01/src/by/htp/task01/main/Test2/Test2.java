package by.htp.task01.main.Test2;

/* 2.Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
 * Добавьте конструктор, инициализирующий члены класса по умолчанию. 
 * Добавьте set- и get- методы для полей экземпляра класса.
 */

public class Test2 {
	
	
	private int var1;
	private int var2;

	
	public Test2(int var1 , int var2) {
		
		this.var1 = var1;
		this.var2 = var2;
		
	}
	
	
	public Test2() {
		
		this.var1 = 1;
		this.var2 = 2;
		
	}
	
	public void setvar1(int var1) {
		
		this.var1 = var1;
		
	}
	
	public void setvar2(int var2) {
		
		this.var2 = var2;
		
	}
	
	public int getvar1() {
		
		return var1;
		
	}

	public int getvar2() {
		
		return var2;
		
	}

}
